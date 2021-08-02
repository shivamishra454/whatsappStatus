package com.example.dpandstatus.hindi_status;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import android.widget.TextView;
import android.widget.Toast;

import com.example.dpandstatus.R;

public class HindiStatusNextShareActivity extends AppCompatActivity {

    TextView title;
    TextView content;
    ImageView copy;
    TextView q;
    ImageView whtasapp;
    ImageView iv_backArrow;

    String shareString="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_hindi_status_next_share );

        title=(TextView)findViewById( R.id.title );
        content=(TextView)findViewById( R.id.textView3 );
        if (getIntent()!=null){
            title.setText(getIntent().getStringExtra( "toolbartitle" ));

            content.setText(getIntent().getStringExtra( "content" ));
            shareString=getIntent().getStringExtra( "content" );
        }






        iv_backArrow=findViewById( R.id.iv_hns_next_Arrow );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);
                onBackPressed();
            }
        } );



        copy=findViewById(R.id.hns_copy );


        final TextView q = findViewById(R.id.textView3); // my textview
        copy.setOnClickListener(new View.OnClickListener() { // set onclick listener to my textview
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);

                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(q.getText().toString());
                Toast.makeText(getApplicationContext(), "Copied :)", Toast.LENGTH_SHORT).show();
            }
        });






        whtasapp=findViewById(R.id.hns_wtsap );

        whtasapp.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            Intent sendIntent = new Intent(); sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT,shareString);
            sendIntent.setType("text/plain"); startActivity(sendIntent);
        }
        });


    }
}