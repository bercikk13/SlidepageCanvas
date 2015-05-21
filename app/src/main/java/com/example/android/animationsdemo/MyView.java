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

        int radius = 15;
        int reverse =15;
        int height = getMeasuredHeight();
        int width = getMeasuredWidth();
        int split= width/6;
        int margin = 15;



       // paint.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
//        canvas.drawCircle(2*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
//        canvas.drawCircle(3*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
//        canvas.drawCircle(4*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
//        canvas.drawCircle(5*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
        if(i==0)
        {

            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(2*split-dpToPx( margin), height-dpToPx( margin), dpToPx( k), paint);

            if(k==0)

            {
                canvas.drawCircle(split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
                invalidate();
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(split-dpToPx( margin), height-dpToPx( margin), dpToPx(reverse- k), paint);


        }else if (i==1)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(3*split-dpToPx( margin), height-dpToPx( margin), dpToPx( k), paint);

            if(k==0)

            {
                canvas.drawCircle(2*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
                invalidate();
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(2*split-dpToPx( margin), height-dpToPx( margin), dpToPx(reverse- k), paint);
        }else if(i==2)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(4*split-dpToPx( margin), height-dpToPx( margin), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(3*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
                invalidate();
            }

            canvas.drawCircle(3*split-dpToPx( margin), height-dpToPx( margin), dpToPx(reverse- k), paint);
        }else if (i==3)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(5*split-dpToPx( margin), height-dpToPx( margin), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(4*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
                invalidate();
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(4*split-dpToPx( margin), height-dpToPx( margin), dpToPx(reverse- k), paint);
        }else if(i==4)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(6*split-dpToPx( margin), height-dpToPx( margin), dpToPx( k), paint);
            if(k==0)

            {
                canvas.drawCircle(5*split-dpToPx( margin), height-dpToPx( margin), dpToPx( radius), paint);
                invalidate();
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(5*split-dpToPx( margin), height-dpToPx( margin), dpToPx(reverse- k), paint);

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

