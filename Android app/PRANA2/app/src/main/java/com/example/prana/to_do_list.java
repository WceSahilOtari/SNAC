package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class to_do_list extends AppCompatActivity {
    static ArrayList<String> taskArrayList ;
    static ArrayAdapter<String> arrayAdapter ;
    static ListView taskListView ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);
        SQLiteDatabase taskDB = this.openOrCreateDatabase("Tasks" , MODE_PRIVATE , null) ;

        taskDB.execSQL("CREATE TABLE IF NOT EXISTS tasks (taskNum INT , task VARCHAR)");
        taskArrayList = new ArrayList<>();

        Cursor c = taskDB.rawQuery("SELECT * FROM tasks" ,null  );
        int taskIndex = c.getColumnIndex("task") ;
        c.moveToFirst() ;
        while (!c.isAfterLast())
        {
            taskArrayList.add(c.getString(taskIndex)) ;
            c.moveToNext() ;
        }

        arrayAdapter = new ArrayAdapter<>(this , R.layout.list_item2, taskArrayList) ;
        taskListView = findViewById(R.id.taskListView) ;

        taskListView.setAdapter(arrayAdapter);


        taskListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                new AlertDialog.Builder(to_do_list.this).
                        setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you Sure ?")
                        .setMessage("Do you want to delete ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                taskArrayList.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                                taskDB.execSQL("DROP TABLE IF EXISTS tasks");
                                taskDB.execSQL("CREATE TABLE IF NOT EXISTS tasks (taskNum INT , task VARCHAR)");
                                for (int i = 0 ; i < taskArrayList.size() ; i++)
                                {
                                    String sql = "INSERT INTO tasks (taskNum , task) VALUES (? , ?)" ;
                                    SQLiteStatement statement = taskDB.compileStatement(sql) ;
                                    statement.bindString(1 , Integer.toString(i)) ;
                                    statement.bindString(2 , taskArrayList.get(i));
                                    statement.execute();
                                }
                            }
                        })
                        .setNegativeButton("No" , null).show();


                return true;
            }

        });

        taskListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext() , task.class) ;
                intent.putExtra("task" , taskArrayList.get(position)) ;
                intent.putExtra("pos" , position) ;
                startActivity(intent);
            }
        });
    }


    public void addTask(View view)
    {
        Intent intent = new Intent(getApplicationContext(), task.class) ;
        startActivity(intent);
    }

}