package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private RadioGroup mygroup3;
    int mark;
    final static String markformquiz3="quiz three mark";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mygroup3=findViewById(R.id.question3RadioGroup);
        Intent intent=getIntent();
        mark=intent.getIntExtra(MainActivity2.markformquiz2,0);
    }

    public void submitOnclick2(View view) {
        int group3=mygroup3.getCheckedRadioButtonId();


        if (group3==R.id.quiz3Ans1_ID || group3==R.id.quiz3Ans2_ID || group3==R.id.quiz3Ans3_ID || group3==R.id.quiz3Ans4_ID){
            if (group3==R.id.quiz3Ans3_ID){
                mark=mark+5;
            }else {
                mark=0;
            }
            Intent intent=new Intent(this,MainActivity5.class);
            intent.putExtra(markformquiz3,mark);
            startActivity(intent);

        }else{
            Toast.makeText(this,"please select fast",Toast.LENGTH_LONG).show();
        }
    }
}