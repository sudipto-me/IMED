package com.example.android.imed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBanglaButton,mEnglishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBanglaButton = (Button)findViewById(R.id.btn_bangla);
        mEnglishButton = (Button)findViewById(R.id.btn_english);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mBanglaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this,MenuBar.class);
                startActivity(newIntent);
            }
        });
    }
}
