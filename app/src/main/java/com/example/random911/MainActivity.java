package com.example.random911;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button generateBtn = findViewById(R.id.generateBtn);
        generateBtn.setOnClickListener(view -> {
//                    textView.setText("Random number is " + getRandom());
//                    generateBtn.setText("Random number is " + getRandom());
//                     int randomNumber = getRandom();
                     int randomNumber= (int)(Math.random() * 100);
                     textView.setText("Random number is " + randomNumber);
                     generateBtn.setText("Random number is " + randomNumber);
                }
        );


//        CharSequence text = textView.getText();
//        String text2 = textView.getText().toString();

    }

//    private int getRandom(){
//        return (int) (Math.random() * 100);
//    }






}