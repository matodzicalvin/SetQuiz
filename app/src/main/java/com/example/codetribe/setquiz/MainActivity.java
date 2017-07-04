package com.example.codetribe.setquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton r1,r2,r3,r4;
    EditText ed1;
    Button a;
    String answer;
    public static int  scorea=0 ;
    public static int  scoreb=0 ;
    public static int total;
    public Question question=new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1= (RadioButton) findViewById(R.id.Rd1);
        r2= (RadioButton) findViewById(R.id.Rd2);
        r3= (RadioButton) findViewById(R.id.Rd3);
        r4= (RadioButton) findViewById(R.id.Rd4);
        a= (Button) findViewById(R.id.button);
        ed1= (EditText) findViewById(R.id.editText);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!r1.isChecked()){
                  ed1.setVisibility(View.INVISIBLE);
                }
                else {
                    ed1.setVisibility(View.VISIBLE);
                }
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!r2.isChecked()){
                    ed1.setVisibility(View.INVISIBLE);
                }
                else {
                    ed1.setVisibility(View.VISIBLE);
                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!r3.isChecked()){
                    ed1.setVisibility(View.INVISIBLE);
                }
                else {
                    ed1.setVisibility(View.VISIBLE);
                }
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!r4.isChecked()){
                    ed1.setVisibility(View.INVISIBLE);
                }
                else {
                    ed1.setVisibility(View.VISIBLE);
                }
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


                   Res();
                   //next();

           }
       });
    }
   public void Res(){
       question.setQ1(0);
       question.setQ2(0);
       question.setQ3(1);
       question.setQ4(0);

       if(r1.isChecked()){
           scorea=question.getQ1();
       }
       else if(r2.isChecked()){
           scorea=question.getQ2();
       }
       else if(r3.isChecked()) {
           scorea=question.getQ3();

       }
       else{
           scorea=question.getQ4();
       }
       next();
       //Toast.makeText(getApplicationContext(),"your score is "+score,Toast.LENGTH_LONG).show();
   }
   public void next(){
       question.setQtwoa(1);
       question.setQtwob(0);

       answer=ed1.getText().toString().toLowerCase();
       if(answer.equals("code")){
           scoreb= question.getQtwoa();
       }

       else {
           scoreb=question.getQtwob();
       }
      // int total=scorea+scoreb;
      // Toast.makeText(getApplicationContext(),"your score is "+total,Toast.LENGTH_SHORT).show();
       check();
   }
   public void check(){

       if (!r1.isChecked()&&!r2.isChecked()&&!r3.isChecked()&&!r4.isChecked()){
           Toast.makeText(getApplicationContext(),"Please Attend Question 1",Toast.LENGTH_SHORT).show();
       }
       else if (ed1.length()==0){
           ed1.setError("this field can't be empty");

       }
       else{
          int total=scorea+scoreb;
          // Toast.makeText(getApplicationContext(),"your score is "+total,Toast.LENGTH_SHORT).show();
           Intent i = new Intent(MainActivity.this,Main2Activity.class);
           startActivity(i);
       }


   }

}
