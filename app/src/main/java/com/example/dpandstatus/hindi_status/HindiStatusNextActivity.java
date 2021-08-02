package com.example.dpandstatus.hindi_status;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dpandstatus.HindiStatusInterface;
import com.example.dpandstatus.R;

import java.util.ArrayList;

public class HindiStatusNextActivity extends AppCompatActivity implements HindiStatusInterface {

    TextView content;
    RecyclerView recyclerView;
    ImageView iv_backArrow;
    String toolbarTitle="";
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_hindi_status_next );

        content=(TextView)findViewById( R.id.title );
        iv_backArrow=findViewById( R.id.iv_backArrow );


//adapter se value lene ke liye
        toolbarTitle=getIntent().getStringExtra( "title" );
        content.setText(getIntent().getStringExtra( "title" ));



        if (getIntent()!=null){
            toolbarTitle=getIntent().getStringExtra( "title" );
            list=new ArrayList<>();
            String cat =getIntent().getStringExtra("title");

            if (cat.equals( ConstantHs.ATTITUDE )){
                list =(new DatabaseHindiStatus()).getAttitude();
            }
            else if (cat.equals( ConstantHs.DEKHPAGALI)){
                 list=(new DatabaseHindiStatus()).getDekhPagali();
            }
            else if (cat.equals( ConstantHs.LOVE)){
                list=(new DatabaseHindiStatus()).getLove();
            }
            else if (cat.equals( ConstantHs.FRIENDSHIP)){
                list=(new DatabaseHindiStatus()).getFriendship();
            }
            else if (cat.equals( ConstantHs.RAIN)){
                list=(new DatabaseHindiStatus()).getRain();
            }
            else if (cat.equals( ConstantHs.FUNNY)){
                list=(new DatabaseHindiStatus()).getFunny();
            }
            else if (cat.equals( ConstantHs.SAD)){
                list=(new DatabaseHindiStatus()).getSad();
            }
            else if (cat.equals( ConstantHs.MOTIVATINAL)){
                list=(new DatabaseHindiStatus()).getMotivatinal();
            }
            else if (cat.equals( ConstantHs.FESTIVAL)){
                list=(new DatabaseHindiStatus()).getFestival();
            }
            else if (cat.equals( ConstantHs.GOODMORNING)){
                list=(new DatabaseHindiStatus()).getGoodMorning();
            }
            else if (cat.equals( ConstantHs.GOODNIGHT)){
                list=(new DatabaseHindiStatus()).getGoodNight();
            }


        }



        //

        recyclerView=findViewById( R.id.recyclerview_next);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation( LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager( layoutManager );

        HindiStatusNextAdapter adapter= new HindiStatusNextAdapter(  list, getApplicationContext(), this::setContent);
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
        Intent intent=new Intent(this, HindiStatusNextShareActivity.class);
           intent.putExtra( "content",content );
           intent.putExtra( "toolbartitle",toolbarTitle );

         intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
           startActivity( intent );
    }
}