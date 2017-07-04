package com.example.codetribe.setquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import static com.example.codetribe.setquiz.Maths.score;

public class Maths2 extends AppCompatActivity {

     //EditText a;
     RadioButton b,c,d,e;
     RadioButton f,g,h,i;
     CheckBox j,k,l,m;
    Button n;

  public static int final_s=0;
    int score1=0;
    int score2=0;
    int score3=0;
    int score4=0;
    int scores;
    public Question question=new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths2);

        //a= (EditText) findViewById(R.id.question4_answer);

        b= (RadioButton) findViewById(R.id.question5_choice1);
        c= (RadioButton) findViewById(R.id.question5_choice2);
        d= (RadioButton) findViewById(R.id.question5_choice3);
        e= (RadioButton) findViewById(R.id.question5_choice4);

        //f= (RadioButton) findViewById(R.id.question6_choice1);
        //g= (RadioButton) findViewById(R.id.question6_choice2);
       // h= (RadioButton) findViewById(R.id.question6_choice3);
        //i= (RadioButton) findViewById(R.id.question6_choice4);

        j= (CheckBox) findViewById(R.id.question7_choice1);
        k= (CheckBox) findViewById(R.id.question7_choice2);
        l= (CheckBox) findViewById(R.id.question7_choice3);
        m= (CheckBox) findViewById(R.id.question7_choice4);

        n= (Button) findViewById(R.id.button);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity();
                Check();
            }
        });

    }
    public void Activity(){
        question.setQ1(0);
        question.setQ2(1);
        //String answer;
       // answer=a.getText().toString().toLowerCase();
       // if(answer.equals("three")){
           // score1 =question.getQ2();
       // }
       // else if (a.equals("3")){

            //score1 =question.getQ2();
        //}
        //else{
          //  score1=question.getQ1();
      //  }

        if(b.isChecked()){

            score2=question.getQ2();
        }
        else{
            score2=question.getQ1();
        }
       // if(g.isChecked()){
       //     score3=question.getQ2();
        //}
       // else{
            //score3=question.getQ1();
       // }
        if(l.isChecked()&&m.isChecked()){
            score4=question.getQ2();
        }
        else{
            score4=question.getQ1();
        }
        scores=score1+score2+score3+score4;
    }
    public void Check(){

        if(!b.isChecked()&&!c.isChecked()&&!d.isChecked()&&!e.isChecked()){

            Toast.makeText(getApplicationContext(),"Please attend question 5",Toast.LENGTH_SHORT).show();
        }

        else if(!j.isChecked()&&!k.isChecked()&&!l.isChecked()&&!m.isChecked()){

            Toast.makeText(getApplicationContext(),"Please attend question 6",Toast.LENGTH_SHORT).show();
        }
        else{
            scores=score1+score2+score3;
            final_s=scores+score;
            //Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Maths2.this,Results2.class);
            startActivity(i);
        }
    }
}
