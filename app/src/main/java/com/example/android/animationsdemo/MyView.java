package com.example.android.animationsdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;






 import android.content.Context;
 import android.graphics.Canvas;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.util.AttributeSet;
 import android.view.MotionEvent;
 import android.view.View;

 import java.util.jar.Attributes;


public class MyView extends View {
    public  Paint paint;
    public  int width;
    public int i;
    public MyView(Context context, AttributeSet attr)
    {
        super(context,attr);

        paint = new Paint();
        paint.setColor(Color.BLUE);
        // paint.setStrokeWidth(10);
    }

    public void onDraw( Canvas canvas)
    {


        int rad = 5;
        int h = getMeasuredHeight();
        int w = getMeasuredWidth();
        int d= w/5;
        int dp = 5;

        // paint.setStyle(Paint.Style.FILL);
        // canvas.drawCircle(w/2,h/2,rad,paint);
        //  paint.setTextSize(50);
        // paint.setStyle(Paint.Style.FILL);
        // canvas.drawText("Text",w/2-rad/2,h/2+rad*2,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(2*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(3*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(4*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        canvas.drawCircle(5*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        if(i==0)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        }else if (i==1)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(2*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        }else if(i==2)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(3*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        }else if (i==3)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(4*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        }else if(i==4)
        {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(5*d-dpToPx( dp), h-dpToPx( dp), dpToPx( rad), paint);
        }

    }

    public void changeColor(int p)
    {
        i=p;
        invalidate();
    }


    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

}
