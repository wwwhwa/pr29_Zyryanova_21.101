package com.example.pr29;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btncamera, btnwebsite, btnvideo, btncall, btnlocation;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncamera = findViewById(R.id.btncamera);
        btncamera.setOnClickListener(this);

        btnwebsite = findViewById(R.id.btnweb);
        btnwebsite.setOnClickListener(this);

        btnvideo = findViewById(R.id.btnvideo);
        btnvideo.setOnClickListener(this);

        btncall = findViewById(R.id.btncall);
        btncall.setOnClickListener(this);

        btnlocation = findViewById(R.id.btnloc);
        btnlocation.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btncamera){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnweb){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://yandex.com"));
            startActivity(intent);
        }
        if (v.getId() == R.id.btnvideo){
            Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
            startActivity(intent);
        }
        if (v.getId() == R.id.btncall){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:12345"));
            startActivity(intent);
        }
        if (v.getId() == R.id.btnloc){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("yandexmaps://?ll=55.7558,37.6175"));
            startActivity(intent);
        }
    }
}
