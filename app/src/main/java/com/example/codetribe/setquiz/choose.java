package com.example.codetribe.setquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose extends AppCompatActivity {
     Button a;
     Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        a= (Button) findViewById(R.id.button2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(choose.this,MainActivity.class);
                startActivity(i);
            }
        });
        b= (Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(choose.this,Maths.class);
                startActivity(i);
            }
        });
    }
}
