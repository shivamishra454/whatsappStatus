package com.example.dpandstatus.categorie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dpandstatus.R;

import java.util.ArrayList;

public class CategorieNextActivity extends AppCompatActivity implements CategoriesInterface {

    TextView title;
    RecyclerView recyclerView;
    ImageView iv_backArrow;
    String toolbarTitle="";
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_categorie_next );

        title=(TextView)findViewById( R.id.c_title );
        title.setText(getIntent().getStringExtra( "title" ));



        if (getIntent()!=null){
            toolbarTitle=getIntent().getStringExtra( "title" );
            list=new ArrayList<>();
            String cat =getIntent().getStringExtra("title");



            if (cat.equals( Constant.LOVE_ROMANTIC )){
                list =(new Database()).getLoveRomantic();
            }else if (cat.equals(Constant.LIFE)){
                list=(new Database()).getLife();
            }else if (cat.equals(Constant.SAD)) {
                list = (new Database()).getSad();
            }
            else if (cat.equals(Constant.FAMILYLOVE)) {
                list = (new Database()).getFamilyLove();
            }
            else if (cat.equals(Constant.CUTE)) {
                list = (new Database()).getCute();
            }
            else if (cat.equals(Constant.ATTITUDE)) {
                list = (new Database()).getCute();
            }
            else if (cat.equals(Constant.FESTIVAL)) {
                list = (new Database()).getFestival();
            }
            else if (cat.equals(Constant.FRIENDSHIP)) {
                list = (new Database()).getFriendship();
            }
            else if (cat.equals(Constant.FUNNY)) {
                list = (new Database()).getfunny();
            }
            else if (cat.equals(Constant.GIRLY)) {
                list = (new Database()).getGirly();
            }
            else if (cat.equals(Constant.MOTIVATINAL)) {
                list = (new Database()).getMotivatinal();
            }
            else if (cat.equals(Constant.GREETING)) {
                list = (new Database()).getGreeting();
            }

        }




        iv_backArrow=findViewById( R.id.cn_back );
        iv_backArrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                view.startAnimation(animation);
                onBackPressed();
            }
        } );


        recyclerView =findViewById(R.id.recyclerview_c_next);

       //for animation code3line
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), resId);
        recyclerView.setLayoutAnimation(animation);

       //for grid layout
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), numberOfColumns));
        CNextAdapter adapter= new CNextAdapter(  list,  getApplicationContext(), this );
        recyclerView.setAdapter( adapter );

    }

    @Override
    public void setContent(String image) {
        Intent intent = new Intent( this, CategorieNext2Activity.class );
        intent.putExtra( "image", image );
        intent.putExtra( "toolbartitle", toolbarTitle );

        intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK );
        startActivity( intent );
    }
}