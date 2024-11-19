package com.example.myviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab33);
        //View instance get
        trueBtn = findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_Target);
        falseBtn = findViewById(R.id.btn_visible_false);

        //
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(v == trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }else if(v == falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}