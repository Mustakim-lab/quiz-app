package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mygroup1;
    int mark;
    final static  String markformquiz1="quiz one mark";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mygroup1=findViewById(R.id.question1RadioGroup);

    }


    public void submitOnclick(View view) {
        int group1=mygroup1.getCheckedRadioButtonId();

        if (group1==R.id.quiz1Ans1_ID || group1==R.id.quiz1Ans2_ID || group1==R.id.quiz1Ans3_ID || group1==R.id.quiz1Ans4_ID){
            if (group1==R.id.quiz1Ans1_ID){
                mark=5;
            }else {
                mark=0;
            }

            Intent intent=new Intent(this,MainActivity2.class);
            intent.putExtra(markformquiz1,mark);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Pleas select fast",Toast.LENGTH_SHORT).show();
        }
    }
}