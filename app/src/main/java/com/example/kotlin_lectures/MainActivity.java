package com.example.kotlin_lectures;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
RecyclerView recyclerView;
ImageAdapter imageAdapter;
ArrayList<ImageModel> arrimageadap;
    String videoUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_layout);
        videoView=findViewById(R.id.videoload);
        Uri uri=Uri.parse(videoUrl);
        videoView.setVideoURI(uri);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.getBufferPercentage();
        videoView.getDuration();
        videoView.getCurrentPosition();

        // starts the video
        videoView.start();

       /* recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
arrimageadap.add(new ImageModel());
    *//*    arrimageadap.add(new ImageModel("July\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Aug\n13","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));
        arrimageadap.add(new ImageModel("Jun\n10","10:42:23 AM","01:30:23 PM"));*//*
        imageAdapter=new ImageAdapter(this,arrimageadap);
        recyclerView.setAdapter(imageAdapter);*/

    }
}
