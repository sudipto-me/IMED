package com.example.android.imed.SebaProdan;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.android.imed.R;

public class SebaProdan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seba_prodan);

        Toolbar tool = (Toolbar)findViewById(R.id.tool_bar);

        setSupportActionBar(tool);
        setTitle("সেবা প্রদান ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tab_seba = (TabLayout)findViewById(R.id.tab_seba_prodan);


        tab_seba.addTab(tab_seba.newTab().setText("অভ্যন্তরীন সেবা"));
        tab_seba.addTab(tab_seba.newTab().setText("বহিরাগত  সেবা"));
        tab_seba.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager seba_viewPager = (ViewPager)findViewById(R.id.vp_seba_prodan);
        final SebaProdanAdapter sebaProdanAdapter = new SebaProdanAdapter(getSupportFragmentManager(),tab_seba.getTabCount());
        seba_viewPager.setAdapter(sebaProdanAdapter);
        seba_viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_seba));


    }
}
