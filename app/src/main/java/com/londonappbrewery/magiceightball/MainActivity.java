package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton= findViewById(R.id.askButton);
        final ImageView ballDisplay= findViewById(R.id.image_eightBall);
        final int[] ballArray= {  R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Random generate = new Random();
                int number = generate.nextInt(5);
                for(int i =1;i<=10;i++){
                Log.d("8 ball", "onClick number becomes "+number);
                ballDisplay.setImageResource(ballArray[number]);}
            }
        });
    }
}
