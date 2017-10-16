package com.example.android.imed.AboutImed;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.imed.R;

public class AboutImed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_imed);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("বঙ্গবন্ধুর বাণী "));
        tabLayout.addTab(tabLayout.newTab().setText("নিবন্ধক ও পরিচালকের বাণী"));
        tabLayout.addTab(tabLayout.newTab().setText("সংক্ষিপ্ত  ইতিহাস"));
        tabLayout.addTab(tabLayout.newTab().setText("ভিশন ও মিশন"));
        tabLayout.addTab(tabLayout.newTab().setText("গ্যালারী"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final AboutImedAdapter adapter = new AboutImedAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }
}
