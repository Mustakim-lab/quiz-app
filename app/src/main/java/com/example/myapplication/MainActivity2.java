package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private RadioGroup mygroup2;
    int mark;
    final static String markformquiz2="quiz two mark";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mygroup2=findViewById(R.id.question2RadioGroup);
        Intent intent=getIntent();
        mark=intent.getIntExtra(MainActivity.markformquiz1,0);
    }

    public void submitOnclick1(View view) {
        int group2=mygroup2.getCheckedRadioButtonId();


        if (group2==R.id.quiz2Ans1_ID || group2==R.id.quiz2Ans2_ID || group2==R.id.quiz2Ans3_ID || group2==R.id.quiz2Ans4_ID){
            if (group2==R.id.quiz2Ans4_ID){
                mark=mark+5;
            }else {
                mark=0;
            }
            Intent intent=new Intent(this,MainActivity4.class);
            intent.putExtra(markformquiz2,mark);
            startActivity(intent);

        }else{
            Toast.makeText(this,"please select fast",Toast.LENGTH_LONG).show();
        }
    }
}