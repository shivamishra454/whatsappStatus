package com.example.dpandstatus.latestdp;

import androidx.appcompat.app.AppCompatActivity;
import de.mateware.snacky.Snacky;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.dpandstatus.R;
import com.example.dpandstatus.status.SubStatusActivity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Random;

public class LatestDpNextActivity extends AppCompatActivity {


    private static final String DIRECTORY_TO_SAVE_MEDIA_NOW ="/WSDownloader/" ;
    ImageView image;
    ImageView iv_backArrow;
    ImageView share;
    ImageView whtasapp;
    ImageView file;
    ImageView facebook;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_latest_dp_next );

        image=(ImageView)findViewById( R.id.imageView2 );



        Glide.with(this).load(getIntent().getStringExtra("image" )).placeholder(R.drawable.ic_launcher_background).dontAnimate()
                .diskCacheStrategy( DiskCacheStrategy.ALL)
                .apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(12)))
                .into(image);

        iv_backArrow=findViewById( R.id.iv_latest_dp_next_Arrow );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);
                onBackPressed();
            }



        } );


        share=findViewById(R.id.share );

        share.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {


            {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                v.startAnimation(animation);


                BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
                Bitmap bitmap= bitmapDrawable.getBitmap();
                String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"share" ,null );

                Uri uri= Uri.parse( bitmpath );
                Intent shareIntent= new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT,uri);
                shareIntent.setType("image/jpg");
                startActivity( Intent.createChooser( shareIntent,"share using" ) );


            }

        }
        });



        whtasapp=findViewById(R.id.wtsap );

        whtasapp.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
            Bitmap bitmap= bitmapDrawable.getBitmap();
            String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"whatsapp" ,null );

            Uri uri= Uri.parse( bitmpath );
            Intent shareIntent= new Intent(Intent.ACTION_SEND);
            shareIntent.setType( "image/jpg" );
            shareIntent.setPackage( "com.whatsapp" );
            shareIntent.putExtra( Intent.EXTRA_STREAM,uri );
            startActivity( Intent.createChooser( shareIntent,"share using" ) );


        }
        });



        file=findViewById(R.id.file );

        file.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);
            BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
            Bitmap bitmap= bitmapDrawable.getBitmap();
          /*  //String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"facebook" ,null );
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            Uri uri= Uri.parse( extStorageDirectory );
            File currentFile1= bitmap.compress(Bitmap.CompressFormat.PNG, quality, outStream);
            Log.e("RecyclerV", "onClick: Error:"+currentFile1.toString() );*/
            downloadMethod(bitmapToFile( LatestDpNextActivity.this, bitmap ));

        }
        });



        facebook=findViewById(R.id.fb );

        facebook.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);


            BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
            Bitmap bitmap= bitmapDrawable.getBitmap();
            String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"facebook" ,null );

            Uri uri= Uri.parse( bitmpath );

            Log.e("RecyclerV", "Image patha "+bitmpath );
            Intent shareIntent= new Intent(Intent.ACTION_SEND);
            shareIntent.setType( "image/jpg" );
            shareIntent.setPackage( "com.facebook.katana" );
            shareIntent.putExtra( Intent.EXTRA_STREAM,uri );
            startActivity( Intent.createChooser( shareIntent,"share using" ) );

        }
        });
    }


    public static File bitmapToFile(Context context,Bitmap bitmap) {
        // File name like "image.png"
        //create a file to write bitmap data
        File file = null;
        try {
            String fileNameToSave="dwn"+String.valueOf((new Random()).nextInt(100000000));

            file = new File(Environment.getExternalStorageDirectory() + File.separator + fileNameToSave+".jpg");
            file.createNewFile();

//Convert bitmap to byte array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0 , bos); // YOU can also save it in JPEG
            byte[] bitmapdata = bos.toByteArray();

//write the bytes in file
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bitmapdata);
            fos.flush();
            fos.close();
            return file;
        }catch (Exception e){
            e.printStackTrace();
            return file; // it will return null
        }
    }
    private void downloadMethod(File currentFile1) {
        new Runnable(){

            @Override
            public void run() {

                try {



                  copyFile(currentFile1, new File(Environment.getExternalStorageDirectory().toString() + DIRECTORY_TO_SAVE_MEDIA_NOW + currentFile1.getName()));


                  Snacky.builder().
                            setActivity( LatestDpNextActivity.this).
                            setText(R.string.save_successful_message).
                            success().
                            show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("RecyclerV", "onClick: Error:"+e.getMessage() );

                    Snacky.builder().
                            setActivity(LatestDpNextActivity.this).
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