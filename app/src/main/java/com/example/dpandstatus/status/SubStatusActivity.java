package com.example.dpandstatus.status;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import de.mateware.snacky.Snacky;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.dpandstatus.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class SubStatusActivity extends AppCompatActivity {

    private static final String DIRECTORY_TO_SAVE_MEDIA_NOW ="/WSDownloader/" ;
    // public static String DIRECTORY_TO_SAVE_MEDIA_NOW = "/WSDownloader/";
    Button buttonImageDownload;
    Button buttonVideoDownload;
    CardView cardViewImageMedia;
    CardView cardViewVideoMedia;
    VideoView videoViewVideoMedia;
    ImageView imageViewImageMedia;
    ImageView share;
    ImageView iv_backArrow;
    File currentFile1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_status );

        cardViewVideoMedia = findViewById( R.id.cardViewVideoMedia );
        cardViewImageMedia = findViewById( R.id.cardViewImageMedia );
        buttonVideoDownload = findViewById( R.id.buttonVideoDownload );
        buttonImageDownload = findViewById( R.id.buttonImageDownload );


        videoViewVideoMedia = (VideoView) findViewById( R.id.videoViewVideoMedia );
        imageViewImageMedia = (ImageView) findViewById( R.id.imageViewImageMedia );
         currentFile1 = (File) getIntent().getExtras().get( "image" );
        String currentFile = currentFile1.getAbsolutePath();


        if (currentFile.endsWith( ".mp4" )) {
            Log.e( "Tag", "Path : " + currentFile.toString() );
            cardViewImageMedia.setVisibility( View.GONE );
            cardViewVideoMedia.setVisibility( View.VISIBLE );
            Uri video = Uri.parse( currentFile1.getAbsolutePath() );
            videoViewVideoMedia.setVideoURI( video );
            videoViewVideoMedia.setOnPreparedListener( new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping( true );
                    videoViewVideoMedia.start();
                }
            } );
        } else {
            Log.e( "Tag", "Path : " + currentFile.toString() );
            cardViewImageMedia.setVisibility( View.VISIBLE );
            cardViewVideoMedia.setVisibility( View.GONE );
            Bitmap myBitmap = BitmapFactory.decodeFile( currentFile );
            imageViewImageMedia.setImageBitmap( myBitmap );
        }

        iv_backArrow = findViewById( R.id.iv_ss_back );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);

                onBackPressed();
            }
        } );

        share = findViewById( R.id.iv_ss_share );

        share.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction( Intent.ACTION_SEND );
                    sendIntent.putExtra( Intent.EXTRA_TEXT, "This is my text to send." );
                    sendIntent.setType( "text/plain" );
                    startActivity( sendIntent );

                }

            }
        } );

        buttonImageDownload.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadMethod();
            }
        } );
        buttonVideoDownload.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadMethod();
            }


        } );


    }
    private void downloadMethod() {
        new Runnable(){

            @Override
            public void run() {
                try {
                    copyFile(currentFile1, new File(Environment.getExternalStorageDirectory().toString() + DIRECTORY_TO_SAVE_MEDIA_NOW + currentFile1.getName()));
                    Snacky.builder().
                            setActivity(SubStatusActivity.this).
                            setText(R.string.save_successful_message).
                            success().
                            show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("RecyclerV", "onClick: Error:"+e.getMessage() );

                    Snacky.builder().
                            setActivity(SubStatusActivity.this).
                            setText(R.string.save_error_message).
                            error().
                            show();
                }
            }
        }.run();
    }

    public static void copyFile(File sourceFile, File destFile) throws IOException {
        if (!destFile.getParentFile().exists())
            destFile.getParentFile().mkdirs();

        if (!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }



}