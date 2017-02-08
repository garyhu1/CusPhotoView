package com.garyhu.imagesliderdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.garyhu.imagesliderdemo.R;
import com.garyhu.imagesliderdemo.photoview.PhotoView;
import com.squareup.picasso.Picasso;

/**
 * 作者： garyhu.
 * 时间： 2017/2/8.
 */

public class PhotoActivity extends AppCompatActivity {

    private String imgUrl = "http://imga.mumayi.com/android/img_google/2013/09/26/com.hd.live.wallpaper.beauty.anime/comhdlivewallpaperbeautyanime_litpic_2.jpg";
    private PhotoView photoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        photoView = (PhotoView) findViewById(R.id.photo);
        Picasso.with(this)
                .load(imgUrl)
                .into(photoView);
    }
}
