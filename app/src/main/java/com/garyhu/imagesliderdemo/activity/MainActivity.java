package com.garyhu.imagesliderdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.garyhu.imagesliderdemo.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_start).setOnClickListener(new OnClickListener());
        findViewById(R.id.choose_pic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChoosePicActivity.class));
            }
        });

        findViewById(R.id.photo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PhotoActivity.class));
            }
        });
    }

    class OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,NewsViewPagerActivity.class));
        }
    }
}
