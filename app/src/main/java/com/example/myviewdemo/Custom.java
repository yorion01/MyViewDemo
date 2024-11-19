package com.example.myviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Custom extends View{
    public Custom(Context context){
        super(context);
    }
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.YELLOW);
    }


}



