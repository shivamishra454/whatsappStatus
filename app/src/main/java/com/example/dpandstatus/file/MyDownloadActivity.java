package com.example.dpandstatus.file;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dpandstatus.R;
import com.google.android.material.tabs.TabLayout;

public class MyDownloadActivity extends AppCompatActivity {

    private ViewPagerDownloadAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageView iv_back;
    private ImageView imageView;
    ImageView edit;
    ConstraintLayout cl_show_and_hide;
    ConstraintLayout cl_edit_play;
    ImageView iv_close;
    ImageView iv_select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_download );



        tabLayout =findViewById(R.id.TabLayout2 );
        viewPager=findViewById( R.id.ViewPager2 );
        iv_back=findViewById( R.id.iv_file_back );
        imageView = (ImageView) findViewById( R.id.iv_fav_note );


      /*  edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               cl_show_and_hide.setVisibility( View.VISIBLE );
               cl_edit_play.setVisibility( View.GONE );


            }
        });*/

      /*  iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl_show_and_hide.setVisibility( View.GONE );
                cl_edit_play.setVisibility( View.VISIBLE );
            }
        });
*/



        /*iv_select.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        } );
*/





        //ek activity se dusre activity me jane ke liye
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MyDownloadActivity.this, SubMyDownloadActivity.class );
                startActivity( intent );
            }
        } );



        // back jane ke liye method
        iv_back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        } );




        assert getFragmentManager() != null;
        viewPagerAdapter =new ViewPagerDownloadAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment( new PictureFragment(),"" );
        viewPagerAdapter.addFragment( new VideosFragment(),"");

        viewPager.setAdapter( viewPagerAdapter );

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0  ).setText( "Picture" );
        tabLayout.getTabAt( 1 ).setText( "Videos" );

    }
}