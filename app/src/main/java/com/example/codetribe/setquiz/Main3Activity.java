package com.example.codetribe.setquiz;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.codetribe.setquiz.Main2Activity.finals;

public class Main3Activity extends AppCompatActivity {
    Button N;
    RadioButton Rd1, Rd2, Rd3, Rd4;

    //int Score3=0;
    public static int Score3;
    public static int finals2;
    public Question question=new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Rd1 = (RadioButton) findViewById(R.id.Rd1);
        Rd2 = (RadioButton) findViewById(R.id.Rd2);
        Rd3 = (RadioButton) findViewById(R.id.Rd3);
        Rd4 = (RadioButton) findViewById(R.id.Rd4);

        N = (Button) findViewById(R.id.button);
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Next();
                check();
            }
        });
    }

    private void Next() {
        question.setQ1(0);
        question.setQ2(1);
        if (Rd2.isChecked()) {
            Score3=question.getQ2();
        } else {
            Score3 =question.getQ1();
        }

    }

    public void check() {
        if (!Rd1.isChecked() && !Rd2.isChecked() && !Rd3.isChecked() && !Rd4.isChecked()) {
            Toast.makeText(getApplicationContext(), "ATTEND QUESTION5 PLEASE", Toast.LENGTH_SHORT).show();
        } else {
            finals2=Score3+finals;
            Intent i = new Intent(Main3Activity.this, Results.class);
            startActivity(i);
        }
    }
}