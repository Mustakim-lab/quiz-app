package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    private RadioGroup mygroup5;
    int mark;
    final static String markformquiz5="quiz four mark";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        mygroup5=findViewById(R.id.question5RadioGroup);
        Intent intent=getIntent();
        mark=intent.getIntExtra(MainActivity5.markformquiz4,0);
    }

    public void submitOnclick4(View view) {

        int group5=mygroup5.getCheckedRadioButtonId();


        if (group5==R.id.quiz5Ans1_ID || group5==R.id.quiz5Ans2_ID || group5==R.id.quiz5Ans3_ID || group5==R.id.quiz5Ans4_ID){
            if (group5==R.id.quiz5Ans2_ID){
                mark=mark+5;
            }else {
                mark=0;
            }
            Intent intent=new Intent(this,MainActivity3.class);
            intent.putExtra(markformquiz5,mark);
            startActivity(intent);

        }else{
            Toast.makeText(this,"please select fast",Toast.LENGTH_LONG).show();
        }
    }
}