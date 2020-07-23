package com.example.boxme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewEx viewEx = new ViewEx(this);
        setContentView(viewEx);
    }

    protected class ViewEx extends View {
        public ViewEx(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);

            Paint MyPaint = new Paint();
            MyPaint.setColor(Color.WHITE);
            MyPaint.setStrokeWidth(30f);
            canvas.drawPoint(360, 640, MyPaint);

            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.RED);
            MyPaint.setStrokeWidth(5f);
            canvas.drawRect(150, 200, 300, 400, MyPaint);

            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.FILL);
            MyPaint.setColor(Color.GRAY);
            canvas.drawRect(400, 400, 600, 600, MyPaint);

            MyPaint.setStrokeWidth(20f);
            MyPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            MyPaint.setColor(Color.parseColor("#8041D9"));
            canvas.drawRect(500, 700, 700, 1100, MyPaint);

        }
    }
}
