package com.example.dpandstatus.file;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.content.FileProvider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.dpandstatus.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;


public class FullVideoActivity extends AppCompatActivity {

    ImageView iv_backArrow;
    VideoView videoView;
    MediaController mediaControls;
    ImageView share;
    Bitmap myBitmap;
    File currentFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_video );

        iv_backArrow=findViewById( R.id.im_back_button1 );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        } );

        videoView = (VideoView) findViewById(R.id.sb_videoView );
         currentFile = (File) getIntent().getExtras( ).get("videoFile");


        if (mediaControls == null) {
            // create an object of media controller class
            mediaControls = new MediaController( FullVideoActivity.this);
            mediaControls.setAnchorView( this.videoView );
        }
        // set the media controller for video view
        this.videoView.setMediaController(mediaControls);
        // set the uri for the video view
        Uri video = Uri.parse(currentFile.getAbsolutePath());
        videoView.setVideoURI(video);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
           videoView.start();
            }
        });

        // implement on completion listener on video view
        this.videoView.setOnCompletionListener( new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });
        this.videoView.setOnErrorListener( new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(getApplicationContext(), "Oops An Error Occur While Playing Video...!!!", Toast.LENGTH_LONG).show(); // display a toast when an error is occured while playing an video
                return false;
            }
        });


        share=findViewById(R.id.iv_video_share );

        share.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            String path = currentFile.getAbsolutePath(); //should be local path of downloaded video

            ContentValues content = new ContentValues(4);
            content.put(MediaStore.Video.VideoColumns.DATE_ADDED,
                    System.currentTimeMillis() / 1000);
            content.put(MediaStore.Video.Media.MIME_TYPE, "video/mp4");
            content.put(MediaStore.Video.Media.DATA, path);

            ContentResolver resolver = FullVideoActivity.this.getContentResolver();
            Uri uri = resolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, content);

            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("video/*");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey this is the video subject");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "Hey this is the video text");
            sharingIntent.putExtra(Intent.EXTRA_STREAM,uri);
            startActivity(Intent.createChooser(sharingIntent,"Share Video"));

        }
        });







    }
}