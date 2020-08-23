package com.example.newprojectonlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class CekGambar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_gambar);
        ImageView iv = (ImageView)findViewById(R.id.ivcobagambar);
        Glide.with(CekGambar.this)
                .load("https://live.staticflickr.com/6021/5979551591_e61f575354.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(iv);
    }
}