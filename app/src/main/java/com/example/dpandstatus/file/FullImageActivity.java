package com.example.dpandstatus.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dpandstatus.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FullImageActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView share;
    ImageView iv_backArrow;
    Bitmap myBitmap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_picture );

        imageView=(ImageView)findViewById( R.id.imagevieww );
       File currentFile= (File) getIntent().getExtras().get( "imageFile" );

      myBitmap = BitmapFactory.decodeFile(currentFile.getAbsolutePath());
         imageView.setImageBitmap(myBitmap);


        iv_backArrow=findViewById( R.id.iv_back );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        } );


        share=findViewById(R.id.share );

        share.setOnClickListener( new View.OnClickListener()

        {@Override
        public void onClick(View v) {

                 Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                myBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                File f = new File( Environment.getExternalStorageDirectory() + File.separator + "temporary_file.jpg");
                try {
                    f.createNewFile();
                    FileOutputStream fo = new FileOutputStream(f);
                    fo.write(bytes.toByteArray());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                share.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///sdcard/temporary_file.jpg"));
                startActivity(Intent.createChooser(share, "Share Image"));
        }
        });



    }
}