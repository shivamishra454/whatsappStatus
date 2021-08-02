package com.example.dpandstatus.english_status;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dpandstatus.HindiStatusInterface;
import com.example.dpandstatus.R;
import com.example.dpandstatus.hindi_status.ConstantHs;
import com.example.dpandstatus.hindi_status.DatabaseHindiStatus;
import com.example.dpandstatus.hindi_status.HindiStatusNextShareActivity;

import java.util.ArrayList;

public class EnglishStatusNextActivity extends AppCompatActivity implements HindiStatusInterface {

    TextView content;
    int posion;
    RecyclerView recyclerView;
    ImageView iv_backArrow;
    String toolbarTitle="";
    ArrayList<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_english_status_next );





        iv_backArrow=findViewById( R.id.imageView );
        content=(TextView)findViewById( R.id.tv_title );
//adapter se value lene ke liye
        toolbarTitle=getIntent().getStringExtra( "title" );
        content.setText(getIntent().getStringExtra( "title" ));


        if (getIntent()!=null){
            toolbarTitle=getIntent().getStringExtra( "title" );
            list=new ArrayList<>();
            String cat =getIntent().getStringExtra("title");

            if (cat.equals( ConstantEs.ATTITUDE )){
                list =(new DatabaseEnglishStatus()).getAttitude();
            }else if (cat.equals(ConstantEs.LOVE)){
                 list=(new DatabaseEnglishStatus()).getLove();
            }else if (cat.equals(ConstantEs.SAD)) {
                list = (new DatabaseEnglishStatus()).getSad();
            }
            else if (cat.equals(ConstantEs.ROMANTIC)) {
                list = (new DatabaseEnglishStatus()).getRomantic();
            }
            else if (cat.equals(ConstantEs.FUNNY)) {
                list = (new DatabaseEnglishStatus()).getFunny();
            }
            else if (cat.equals(ConstantEs.FRIENDS)) {
                list = (new DatabaseEnglishStatus()).getFriends();
            }
            else if (cat.equals(ConstantEs.CUTE)) {
                list = (new DatabaseEnglishStatus()).getCute();
            }
            else if (cat.equals(ConstantEs.LIFE)) {
                list = (new DatabaseEnglishStatus()).getLife();
            }
            else if (cat.equals(ConstantEs.BIRTHDAY)) {
                list = (new DatabaseEnglishStatus()).getBirthday();
            }
            else if (cat.equals(ConstantEs.INSPIRATIONAL)) {
                list = (new DatabaseEnglishStatus()).getInspirtional();
            }
            else if (cat.equals(ConstantEs.GOODMORNING)) {
                list = (new DatabaseEnglishStatus()).getGoodmorning();
            }
            else if (cat.equals(ConstantEs.GOODNIGHT)) {
                list = (new DatabaseEnglishStatus()).getGoodnight();
            }



        }

        recyclerView=findViewById( R.id.recyclerview_next_english);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation( LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager( layoutManager );

        EnglishStatusNextAdapter adapter= new EnglishStatusNextAdapter(  list, getApplicationContext(), this::setContent);
        recyclerView.setAdapter( adapter );

        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), resId);
        recyclerView.setLayoutAnimation(animation);


        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);

                onBackPressed();
            }
        } );


    }

    @Override
    public void setContent(String content) {
        Intent intent=new Intent(this, EnglishStatusNextShareActivity.class);
        intent.putExtra( "content",content );
        intent.putExtra( "toolbartitle",toolbarTitle );

        intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity( intent );
    }

    }
