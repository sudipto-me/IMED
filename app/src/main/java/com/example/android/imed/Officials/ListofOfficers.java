package com.example.android.imed.Officials;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.android.imed.Model.Offices;
import com.example.android.imed.R;

import java.util.ArrayList;
import java.util.List;

public class ListofOfficers extends AppCompatActivity {

    public RecyclerView rv_officelist;
    LinearLayoutManager linearLayoutManager ;
    public List<Offices>officesList = new ArrayList<>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_officers);

        context = this;

        Toolbar toolbar = (Toolbar)findViewById(R.id.tb_office_list);
        setSupportActionBar(toolbar);
        setTitle("কর্মকর্তা বৃন্দ ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rv_officelist = (RecyclerView)findViewById(R.id.rv_officials_list);
        linearLayoutManager = new LinearLayoutManager(this);
        rv_officelist.setLayoutManager(linearLayoutManager);
        officesList.add(new Offices("মাননীয় মন্ত্রীর দপ্তর "));
        officesList.add(new Offices("মাননীয় প্রতিমন্ত্রীর দপ্তর "));
        officesList.add(new Offices("সচিব মহোদয়ের দপ্তর   "));
        officesList.add(new Offices("প্রশাসন ও অনুবিভাগ  "));
        officesList.add(new Offices("সমন্বয় ও এমএইএস সেক্টর   "));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ১ "));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ২ "));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৩"));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৪"));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৫"));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৬"));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৭"));
        officesList.add(new Offices("পরিবীক্ষণ ও মূল্যায়ন সেক্টর ৮"));
        officesList.add(new Offices("সিপিটিইউ  "));

        OfficesRecyclerAdapter officesRecyclerAdapter = new OfficesRecyclerAdapter(context,officesList);
        rv_officelist.setAdapter(officesRecyclerAdapter);
        rv_officelist.setHasFixedSize(false);


    }
}
