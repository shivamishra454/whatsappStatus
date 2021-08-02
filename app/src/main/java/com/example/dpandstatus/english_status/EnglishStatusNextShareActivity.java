package com.example.dpandstatus.english_status;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dpandstatus.R;

public class EnglishStatusNextShareActivity extends AppCompatActivity {

    TextView title;
    TextView content;
    ImageView imageView_copy;
    TextView q;
    ImageView whtasapp;
    ImageView iv_backArrow;
    String shareString="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_english_status_next_share );

        title=(TextView)findViewById( R.id.header_title );
        content=(TextView)findViewById( R.id.tv_ens );
        content.setText(getIntent().getStringExtra( "content" ));
        shareString=getIntent().getStringExtra( "content" );
        title.setText(getIntent().getStringExtra( "toolbartitle" ));


        iv_backArrow=findViewById( R.id.iv_esn_next_Arrow );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);

                onBackPressed();
            }
        } );




        imageView_copy=findViewById(R.id.ens_copy );


        final TextView q = findViewById(R.id.tv_ens ); // my textview
        imageView_copy.setOnClickListener(new View.OnClickListener() { // set onclick listener to my textview
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);

                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService( Context.CLIPBOARD_SERVICE);
                cm.setText(q.getText().toString());
                Toast.makeText(getApplicationContext(), "Copied :)", Toast.LENGTH_SHORT).show();
            }
        });


        whtasapp=findViewById(R.id.ens_wtsap );

        whtasapp.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            v.startAnimation(animation);

            Intent sendIntent = new Intent();
            sendIntent.setPackage("com.whatsapp");
            sendIntent.putExtra(Intent.EXTRA_TEXT, shareString);
            sendIntent.setType("text/plain");
            startActivity(sendIntent);

        }
        });

    }
}