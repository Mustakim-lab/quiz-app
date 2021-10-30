package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView textView;
    private Button button;
    int mark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView=findViewById(R.id.resultId);
        Intent intent=getIntent();
        mark=intent.getIntExtra(MainActivity6.markformquiz5,0);
        textView.setText("Your result is: "+mark);
    }

    public void tryOnclick(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}