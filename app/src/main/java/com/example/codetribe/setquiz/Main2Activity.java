package com.example.codetribe.setquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button Next1;
    RadioButton Rd1,Rd2,Rd3,Rd4;
    public static int score2;
    public static int score4;
    public static int totalScore = 0;
    public static int finals =0 ;
    TextView s1;
    CheckBox a,c;
    CheckBox b,d;
    private Question question=new Question();
    //MainActivity x = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Rd1 = (RadioButton) findViewById(R.id.Rd1);
        Rd2 = (RadioButton) findViewById(R.id.Rd2);
        Rd3 = (RadioButton) findViewById(R.id.Rd3);
        Rd4 = (RadioButton) findViewById(R.id.Rd4);

        a= (CheckBox) findViewById(R.id.checkBox);
        b= (CheckBox) findViewById(R.id.checkBox2);
        c= (CheckBox) findViewById(R.id.checkBox3);
        d= (CheckBox) findViewById(R.id.checkBox4);

        Next1 = (Button) findViewById(R.id.button);
        Next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //score2++;
                Next1();
                Next();
                check();

            }
        });
    }

    public void Next1() {

        question.setQ1(0);
        question.setQ2(0);
        question.setQ3(1);
        question.setQ4(0);

        if (Rd1.isChecked()) {
            score2=question.getQ3();


        } else {
            score2 = question.getQ1();
        }

    }
    public void Next(){
        question.setQtwoa(1);
        question.setQtwob(0);

        if(a.isChecked()&&b.isChecked()) {
            score4=question.getQtwoa();
        }
        else {
            score4=question.getQtwob();
        }
        totalScore=score2+score4;
    }
    public void check(){
        if(!Rd1.isChecked()&&!Rd2.isChecked()&&!Rd3.isChecked()&&!Rd4.isChecked()){
            Toast.makeText(getApplicationContext(),"ATTEND QUESTION3 PLEASE",Toast.LENGTH_SHORT).show();
        }
        else if(!a.isChecked()&&!b.isChecked()&&!c.isChecked()&&!d.isChecked()){
            Toast.makeText(getApplicationContext(),"ATTEND QUESTION4 PLEASE",Toast.LENGTH_SHORT).show();
        }
        else{
            finals =MainActivity.scorea+MainActivity.scoreb+totalScore;
            Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(intent);
          // finals =MainActivity.scorea+MainActivity.scoreb+totalScore;
            //Toast.makeText(getApplicationContext(),"your score is "+finals,Toast.LENGTH_SHORT).show();
        }
    }

}