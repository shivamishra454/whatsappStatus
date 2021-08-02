package com.example.dpandstatus.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dpandstatus.R;

public class SubMyDownloadActivity extends AppCompatActivity {

    ImageView share;
    ImageView iv_backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sab_my_download );

        iv_backArrow=findViewById( R.id.iv_back );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        } );



        share=findViewById(R.id.share );

        share.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {


            {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }

        }
        });
    }
}