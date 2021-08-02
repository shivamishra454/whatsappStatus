package com.example.dpandstatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.dpandstatus.categorie.CategoriesFragment;
import com.example.dpandstatus.english_status.EnglishStatusFragment;
import com.example.dpandstatus.file.MyDownloadActivity;
import com.example.dpandstatus.gif.GifFragment;
import com.example.dpandstatus.hindi_status.HindiStatusFragment;
import com.example.dpandstatus.latestdp.LatestDpFragment;
import com.example.dpandstatus.status.StatusFragment;
//import com.example.dpandstatus.whatsapp.WhatsappStatusActivity;
import com.google.android.material.tabs.TabLayout;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView imageViewherat;
    private ImageView imageViewfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        
        imageViewfile = (ImageView) findViewById( R.id.file );
        tabLayout =findViewById(R.id.TabLayout1 );
        viewPager=findViewById( R.id.ViewPager1 );





        //ek activity se dusre activity me jane ke liye
        imageViewfile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                v.startAnimation(animation);

                Intent intent = new Intent( MainActivity.this, MyDownloadActivity.class );
                startActivity( intent );
            }
        } );



        assert getFragmentManager() != null;
        viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment( new LatestDpFragment(),"" );
        viewPagerAdapter.addFragment( new CategoriesFragment(),"");
        viewPagerAdapter.addFragment( new StatusFragment(),"");
        viewPagerAdapter.addFragment( new GifFragment(),"");
        viewPagerAdapter.addFragment( new HindiStatusFragment(),"");
        viewPagerAdapter.addFragment( new EnglishStatusFragment(),"");

        viewPager.setAdapter( viewPagerAdapter );
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0  ).setText( "Latest Dp" );
        tabLayout.getTabAt( 1 ).setText( "Categories" );
        tabLayout.getTabAt( 2 ).setText( "Status" );
        tabLayout.getTabAt( 3 ).setText( "Gif" );
        tabLayout.getTabAt( 4 ).setText( "Hindi Status" );
        tabLayout.getTabAt( 5 ).setText( "Engish Status" );



    }


    private void checkpermission(){
        Dexter.withContext(getApplicationContext())
                .withPermissions(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                ).withListener(new MultiplePermissionsListener() {
            @Override public void onPermissionsChecked(MultiplePermissionsReport report) {

                if(!report.areAllPermissionsGranted())
                    checkpermission();
            }
            @Override public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {/* ... */}
        }).check();


}
}