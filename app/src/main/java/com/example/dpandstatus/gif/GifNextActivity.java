package com.example.dpandstatus.gif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dpandstatus.R;

public class GifNextActivity extends AppCompatActivity {

    ImageView image;
    ImageView iv_backArrow;
    ImageView share;
    ImageView whtasapp;
    ImageView file;
    ImageView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_gif_next );


        image=(ImageView)findViewById( R.id.g_imageView );
        image.setImageResource(getIntent().getIntExtra("image",0 ));


        iv_backArrow=findViewById( R.id.gifnext );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);
                onBackPressed();
            }
        } );


        share=findViewById(R.id.g_share );

        share.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {


            {
                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                v.startAnimation(animation);

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }

        }
        });



        whtasapp=findViewById(R.id.g_wtsap );

        whtasapp.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
            Bitmap bitmap= bitmapDrawable.getBitmap();
            String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"whtasapp" ,null );

            Uri uri= Uri.parse( bitmpath );
            Intent shareIntent= new Intent(Intent.ACTION_SEND);
            shareIntent.setType( "image/gif" );
            shareIntent.setPackage( "com.whatsapp" );
            shareIntent.putExtra( Intent.EXTRA_STREAM,uri );
            startActivity( Intent.createChooser( shareIntent,"share using" ) );

        }
        });



        file=findViewById(R.id.g_file );

        file.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("*/*");
            startActivity(intent);



        }
        });

        facebook=findViewById(R.id.g_fb );

        facebook.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            BitmapDrawable bitmapDrawable= (BitmapDrawable) image.getDrawable();
            Bitmap bitmap= bitmapDrawable.getBitmap();
            String bitmpath= MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"facebook" ,null );

            Uri uri= Uri.parse( bitmpath );
            Intent shareIntent= new Intent(Intent.ACTION_SEND);
            shareIntent.setType( "image/jpg" );
            shareIntent.setPackage( "com.facebook.katana" );
            shareIntent.putExtra( Intent.EXTRA_STREAM,uri );
            startActivity( Intent.createChooser( shareIntent,"share using" ) );

        }
        });


    }


}