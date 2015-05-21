package com.example.android.animationsdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class MyView extends View {
    public  Paint paint;
    public  int width;
    public int i;
    public float k;



    public MyView(Context context, AttributeSet attr)
    {
        super(context,attr);

        paint = new Paint();
        paint.setColor(Color.BLUE);

    }

    public void onDraw( Canvas canvas)
    {

        int rad = 10;
        int h = getMeasuredHeight();
        int w = getMeasuredWidth();
        int d= w/6;
        int dp = 10;



        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(2*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(3*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(4*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(5*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        if(i==0)
        {

            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(2*d-dpToPx( dp), h-dpToPx( dp), dpToPx( k), paint);

            if(k==0)

            {
                canvas.drawCircle(d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
                invalidate();
            }


        }else if (i==1)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(3*d-dpToPx( dp), h-dpToPx( dp), dpToPx( k), paint);

            if(k==0)

            {
                canvas.drawCircle(2*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
                invalidate();
            }
        }else if(i==2)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(4*d-dpToPx( dp), h-dpToPx( dp), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(3*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
                invalidate();
            }
        }else if (i==3)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(5*d-dpToPx( dp), h-dpToPx( dp), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(4*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
                invalidate();
            }
        }else if(i==4)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(6*d-dpToPx( dp), h-dpToPx( dp), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(5*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
                invalidate();
            }

        }

    }

//    public void changeColor(int p)
//    {
//        i=p;
//
//        invalidate();
//    }


    public void increaseSize(int p , float positionOffset)
    {

        i=p;
        k = positionOffset*10;

        invalidate();
    }
    public float dpToPx(float dp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        float px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

 }

