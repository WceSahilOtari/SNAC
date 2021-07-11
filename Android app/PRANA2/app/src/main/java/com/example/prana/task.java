package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class task extends AppCompatActivity {

    EditText editText ;
    SQLiteDatabase taskDB ;
    Intent intent ;
    View taskLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        taskLayout = findViewById(R.id.taskLayout);
        taskLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager mgr = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                if (getCurrentFocus() != null)
                mgr.hideSoftInputFromWindow(getCurrentFocus().getWindowToken() , 0) ;
            }
        });


        intent = getIntent();
        String prevTask = intent.getStringExtra("task") ;
        editText = findViewById(R.id.taskEditText) ;
        if (prevTask != null) {
            editText.setText(prevTask);
        }
        taskDB = this.openOrCreateDatabase("Tasks" , MODE_PRIVATE , null) ;

    }

    public void confirmAdding(View view)
    {

        if (intent.getStringExtra("task") == null) {
            to_do_list.taskArrayList.add(editText.getText().toString());
            to_do_list.arrayAdapter.notifyDataSetChanged();
            String sql = "INSERT INTO tasks (taskNum , task) VALUES (? , ?)";
            SQLiteStatement statement = taskDB.compileStatement(sql);
            statement.bindString(1, Integer.toString(to_do_list.taskArrayList.size() - 1));
            statement.bindString(2, editText.getText().toString());
            statement.execute();
        }
        else {
            to_do_list.taskArrayList.set(intent.getIntExtra("pos", 0), editText.getText().toString());
            to_do_list.arrayAdapter.notifyDataSetChanged();
            String s = "UPDATE  tasks SET task = ? WHERE taskNum = ?";
            SQLiteStatement s1 = taskDB.compileStatement(s);
            s1.bindString(1, editText.getText().toString());
            s1.bindString(2, String.valueOf(intent.getIntExtra("pos", 0)));
            s1.execute();
        }
        this.finish() ;
    }

}