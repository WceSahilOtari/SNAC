package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercises extends AppCompatActivity
{

    static List<String> exerciseNames = new ArrayList<>();
    static List<String> demoURL = new ArrayList<>() ;

    List<String> overWeightExercises = new ArrayList<>();
    List<String> overWeightDemoURL = new ArrayList<>();

    List<String> underWeightExercises = new ArrayList<>();
    List<String> underWeightDemoURL = new ArrayList<>();

    public void setUnderWeightExercises()
    {
        underWeightExercises.add("Push ups");
        underWeightDemoURL.add("https://media.tenor.com/images/58cc0c7477ea44689ccadb511217f00a/tenor.gif");
        underWeightExercises.add("Pike Push ups");
        underWeightDemoURL.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/workouts/2016/03/pikepushup-1456956895.gif");
        underWeightExercises.add("Triceps Dip");
        underWeightDemoURL.add("https://thumbs.gfycat.com/FittingImpassionedAmethystinepython-max-1mb.gif");
        underWeightExercises.add("Pull ups");
        underWeightDemoURL.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/workouts/2016/03/chinup-1457101678.gif?crop=1xw:1xh;center,top&resize=480:*");
        underWeightExercises.add("Jump Squats");
        underWeightDemoURL.add("https://i.giphy.com/JOwwB7O1PpxC0.gif");
        underWeightExercises.add("Walking Lunges");
        underWeightDemoURL.add("https://i.giphy.com/RICLAgxK7y9ck.gif");
        underWeightExercises.add("Squats");
        underWeightDemoURL.add("https://flabfix.com/wp-content/uploads/2019/08/Air-Squat.gif");
        underWeightExercises.add("Bent over row");
        underWeightDemoURL.add("https://media1.tenor.com/images/b0012e05f4bb0c758ca0ba3f36ce0ae8/tenor.gif?itemid=10530352");
        underWeightExercises.add("Chest press ");
        underWeightDemoURL.add("https://thumbs.gfycat.com/DearestMammothDrafthorse-size_restricted.gif");
        underWeightExercises.add("Shoulder press");
        underWeightDemoURL.add("https://thumbs.gfycat.com/ExcitableOblongFluke-max-1mb.gif");
        underWeightExercises.add("DeadLifts");
        underWeightDemoURL.add("https://i.pinimg.com/originals/a2/59/47/a25947945b7c676929993c422937910d.gif");
        underWeightExercises.add("Spiderman Plank");
        underWeightDemoURL.add("https://flabfix.com/wp-content/uploads/2019/05/Forearm-Spiderman-Plank.gif");
        underWeightExercises.add("Spuerman Back Exercise");
        underWeightDemoURL.add("https://flabfix.com/wp-content/uploads/2019/05/Superman.gif");
        underWeightExercises.add("Barbell Pullover") ;
        underWeightDemoURL.add("https://thumbs.gfycat.com/AccomplishedParallelDogfish-small.gif") ;
        underWeightExercises.add("Inchworm") ;
        underWeightDemoURL.add("https://media4.giphy.com/media/UTXzXAwUHGx8MDEtPS/200.gif") ;
        underWeightExercises.add("Chin up") ;
        underWeightDemoURL.add("https://www.gymvisual.com/img/p/1/4/5/2/8/14528.gif") ;


    }

    public void setOverWeightExercises()
    {

        /* 1 */   overWeightExercises.add("Kettlebell Swings") ;
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/kettlebell-swing.gif?crop=0.563xw:1.00xh;0.259xw,0&resize=768:*");

        overWeightExercises.add("Shadow Boxing");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/shadowboxgif.gif?crop=0.7509293680297398xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Barbell Deadlifts");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/deadlift.gif?crop=0.807xw:1.00xh;0.135xw,0&resize=980:*");

        overWeightExercises.add("Box Jumps");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/boxjump.gif?crop=0.5621019108280255xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Skipping");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/skip.gif?crop=0.7515923566878981xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Burpees");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/Burpee.gif?crop=0.6671974522292994xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Dumbbell Goblet Squat");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/dumbbellgoblet.gif?crop=0.5625xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Thrusters");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/Thrusters.gif?crop=0.713xw:0.950xh;0.155xw,0.0431xh&resize=768:*");

        overWeightExercises.add("Mountain Climbers");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/99-Mountain-climbers.gif?crop=0.566xw:1.00xh;0.238xw,0&resize=768:*");

        overWeightExercises.add("Weighted Lunges");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/lunge.gif?crop=0.563xw:1.00xh;0.314xw,0&resize=768:*");

        overWeightExercises.add("Front Squats");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/how-to-do-the-front-squat.gif?crop=0.667xw:1.00xh;0.221xw,0&resize=768:*");

        overWeightExercises.add("Dumbbell Deadlifts" );
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/dumbbell-squat.gif?crop=0.5621019108280255xw:1xh;center,top&resize=768:*");

        overWeightExercises.add("Bear Crawls");
        overWeightDemoURL.add("https://hips.hearstapps.com/ame-prod-menshealth-assets.s3.amazonaws.com/main/assets/102-Bear-crawl.gif?crop=0.770xw:0.880xh;0.0691xw,0.0399xh&resize=980:*");

        overWeightExercises.add("Bridges") ;
        overWeightDemoURL.add("https://thumbs.gfycat.com/ConcernedPointedHornet-size_restricted.gif") ;

        overWeightExercises.add("Wall Sit") ;
        overWeightDemoURL.add("https://builder.trainerpl.us/img/exercises/gifs/1787.gif") ;

        overWeightExercises.add("Calf Raises") ;
        overWeightDemoURL.add("https://thumbs.gfycat.com/EntireThatGazelle-max-1mb.gif") ;

        overWeightExercises.add("Crunches") ;
        overWeightDemoURL.add("https://flabfix.com/wp-content/uploads/2019/05/Crunches.gif");

        overWeightExercises.add("Downward Dog" );
        overWeightDemoURL.add("https://mindbodygreen-res.cloudinary.com/images/c_scale,w_767,q_auto,f_auto,fl_lossy/org/lgr4emkvskmglh13x/downward-dog-plank.gif") ;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        setOverWeightExercises();
        setUnderWeightExercises();

        Random random = new Random();
        exerciseNames.clear(); demoURL.clear();

        SharedPreferences bmiSharedPreferences = this.getSharedPreferences("com.example.prana" , MODE_PRIVATE) ;
        float weight = bmiSharedPreferences.getFloat("weight" , 0) ;
        float height = (bmiSharedPreferences.getFloat("height" , 0))/100 ;
        float bmi = 0 ;
        if (height != 0 && weight != 0)
            bmi = weight/(height*height) ;

        if (bmi > 25) {
            for (int i = 0; i < 5; i++) {
                int num = random.nextInt(overWeightExercises.size());
                exerciseNames.add(overWeightExercises.get(num));
                demoURL.add(overWeightDemoURL.get(num));
                overWeightDemoURL.remove(num);
                overWeightExercises.remove(num);
            }
        }
        else {
            for (int i = 0; i < 5; i++) {
                int num = random.nextInt(underWeightExercises.size());
                exerciseNames.add(underWeightExercises.get(num));
                demoURL.add(underWeightDemoURL.get(num));
                underWeightExercises.remove(num);
                underWeightDemoURL.remove(num);
            }
        }


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , R.layout.list_item , exerciseNames) ;
        ListView listView = findViewById(R.id.listView) ;
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext() , exercises_demo.class) ;
                intent.putExtra("pos" , position) ;
                startActivity(intent);
            }
        });
    }

}