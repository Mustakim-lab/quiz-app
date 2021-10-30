package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private RadioGroup mygroup4;
    int mark;
    final static String markformquiz4="quiz four mark";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mygroup4=findViewById(R.id.question4RadioGroup);
        Intent intent=getIntent();
        mark=intent.getIntExtra(MainActivity4.markformquiz3,0);
    }

    public void submitOnclick3(View view) {
        int group4=mygroup4.getCheckedRadioButtonId();


        if (group4==R.id.quiz4Ans1_ID || group4==R.id.quiz4Ans2_ID || group4==R.id.quiz4Ans3_ID || group4==R.id.quiz4Ans4_ID){
            if (group4==R.id.quiz4Ans1_ID){
                mark=mark+5;
            }else {
                mark=0;
            }
            Intent intent=new Intent(this,MainActivity6.class);
            intent.putExtra(markformquiz4,mark);
            startActivity(intent);

        }else{
            Toast.makeText(this,"please select fast",Toast.LENGTH_LONG).show();
        }
    }
}