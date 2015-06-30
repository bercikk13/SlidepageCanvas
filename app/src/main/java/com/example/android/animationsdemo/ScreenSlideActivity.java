

package com.example.android.animationsdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ScreenSlideActivity extends FragmentActivity {

    private static final int NUM_PAGES = 5;


    private ViewPager mPager;


    private PagerAdapter mPagerAdapter;
    private MyView myview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);





        myview =(MyView)findViewById(R.id.view);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                Log.i(ScreenSlideActivity.class.getSimpleName(), String.format("Ofest: %s", String.valueOf(positionOffset)));

                myview.increaseSize(position,positionOffset);
                Log.i(ScreenSlideActivity.class.getSimpleName(),String.format("Pozycja:%s",String.valueOf(position)));

            }

            @Override
            public void onPageSelected(int position) {

                invalidateOptionsMenu();
              //  int l = mPager.getCurrentItem();
              //myview.changeColor(l);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }


    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ScreenSlidePageFragment.create(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
