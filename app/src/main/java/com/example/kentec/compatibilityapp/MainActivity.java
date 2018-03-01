package com.example.kentec.compatibilityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    private RadioGroup question1;
    private RadioGroup question2;
    private RadioGroup question3;
    private EditText answerBox;
    private Button submit;

    int answerToQuestion1;
    int answerToQuestion2;
    int answerToQuestion3;
    String answer4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        submit = findViewById(R.id.submit);
        answerBox = findViewById(R.id.editText1);


        question1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case 1: //(1)I have 5 pairs of shoes
                            answerToQuestion1 = i;
                        break;
                    case 2: //(2)No shoes I have  tough hobbit feet.
                        answerToQuestion1 = i;
                        break;
                    case 3: //(3)20 pairs,  I am rich.
                        answerToQuestion1 = i;
                        break;
                    case 4: //(4)I own all of the shoes.
                        answerToQuestion1 = i;
                    break;
                }

            }
        });

        question2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case 1: //What's your favorite Star Wars film?
                        answerToQuestion2 = i;
                        break;
                    case 2: //Episode II (Attack of the  Clones).
                        answerToQuestion2 = i;
                        break;
                    case 3: //Rogue One.
                        answerToQuestion2 = i;
                        break;
                    case 4: //Empire Strikes Back.
                        answerToQuestion2 = i;
                    break;
                }

            }
        });

        question3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case 1: //Call of Duty
                        answerToQuestion3 = i;
                        break;
                    case 2: //My drill sergeant.
                        answerToQuestion3 = i;
                        break;
                    case 3: //My parents
                        answerToQuestion3 = i;
                        break;
                    case 4: //google
                        answerToQuestion3 = i;
                    break;
                }

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer4 = answerBox.getText().toString();
            }
        });


    }
}
