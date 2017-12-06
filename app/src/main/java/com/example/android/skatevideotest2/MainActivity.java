package com.example.android.skatevideotest2;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mediaC = new MediaController(this);

    //This is used to implement the video
    VideoView simpleview = findViewById(R.id.skateVideo);

    simpleview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.skatevid1));

    simpleview.setMediaController(mediaC);

    simpleview.start();
}
}
