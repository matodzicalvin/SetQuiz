package com.example.codetribe.setquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import static com.example.codetribe.setquiz.Maths2.final_s;

public class Results2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);
        TextView s1;
        int y;
        TextView txt5;
        RatingBar rate;
        // Main2Activity x = new Main2Activity();
        //MainActivity y = new MainActivity();

            s1= (TextView) findViewById(R.id.txt3);
            y= final_s;

            txt5= (TextView) findViewById(R.id.txt5);
            s1.setText("Your Score: " + (y));

            if(y==5){
                txt5.setText("mmm..you know me");
            }
            else if (y==4){

                txt5.setText("Congra");
            }
            else if(y==3){
                txt5.setText("good");
            }
            else if(y==2||y==1){
                txt5.setText("you tried");
            }
            else{
                txt5.setText("weak");
            }

            rate=(RatingBar)findViewById(R.id.ratingBar);
            rate.setNumStars(5);
            rate.setStepSize(1f);

            rate.setRating(y);

        }
    }
