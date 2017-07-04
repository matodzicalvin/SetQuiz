package com.example.codetribe.setquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Maths extends AppCompatActivity {

    RadioButton a,q1_c2,q1_c3,q1_c4;

    RadioButton b,q2_c2,q2_c3,q2_c4;

    CheckBox c,q3_c2,q3_c3;
    CheckBox d;

    Button e;
   public static int score=0;
    int score1=0;
    int score2=0;
    int score3=0;
    public Question question=new Question();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        a= (RadioButton) findViewById(R.id.question1_c3);
        q1_c2 = (RadioButton) findViewById(R.id.question1_c1);
        q1_c3 = (RadioButton) findViewById(R.id.question1_c2);
        q1_c4 = (RadioButton) findViewById(R.id.question1_c4);

        b= (RadioButton) findViewById(R.id.question2_c1);
        q2_c2 = (RadioButton) findViewById(R.id.question2_c2);
        q2_c3 = (RadioButton) findViewById(R.id.question2_c3);
        q2_c4 = (RadioButton) findViewById(R.id.question2_c4);

        c= (CheckBox) findViewById(R.id.question3_choice1);
        d= (CheckBox) findViewById(R.id.question3_choice3);
        q3_c2= (CheckBox) findViewById(R.id.question3_choice2);
        q3_c3= (CheckBox) findViewById(R.id.question3_choice4);

        e= (Button) findViewById(R.id.button);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First();
                Second();
                Third();
                Check();
            }
        });


    }

    public void First(){
        question.setQ1(0);
        question.setQ2(1);

        if(a.isChecked()){
           score1= question.getQ2();
        }
        else{
            score1=question.getQ1();
        }
    }
    public void Second() {
        question.setQ1(0);
        question.setQ2(1);

        if (b.isChecked()) {
            score2 = question.getQ2();
        } else {
            score2 = question.getQ2();
        }
    }
    public void Third() {
        question.setQ1(0);
        question.setQ2(1);

        if (c.isChecked() && d.isChecked()) {
            score3 = question.getQ2();
        } else {
            score3 = question.getQ1();
        }

    }
    public  void Check(){
        if(!a.isChecked()&&!q1_c2.isChecked()&&!q1_c3.isChecked()&&!q1_c4.isChecked()){

            Toast.makeText(getApplicationContext(),"Please attend question 1",Toast.LENGTH_SHORT).show();
        }
       else if(!b.isChecked()&&!q2_c2.isChecked()&&!q2_c3.isChecked()&&!q2_c4.isChecked()){

            Toast.makeText(getApplicationContext(),"Please attend question 2",Toast.LENGTH_SHORT).show();
        }
        else if(!c.isChecked()&&!d.isChecked()&&!q3_c3.isChecked()&&!q3_c2.isChecked()){

            Toast.makeText(getApplicationContext(),"Please attend question 3",Toast.LENGTH_SHORT).show();
        }
        else{
            score=score1+score2+score3;
            //Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Maths.this,Maths2.class);
            startActivity(i);
        }
    }
}
