package com.example.dpandstatus.gif;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dpandstatus.R;
import com.example.dpandstatus.latestdp.LatestDpNextActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GifAdapter  extends RecyclerView.Adapter <GifAdapter.MyViewHolder>{

    ArrayList<ModelGif> list;
    Context context;

    public GifAdapter(ArrayList<ModelGif> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public GifAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_gif,parent,false );
        return new GifAdapter.MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull GifAdapter.MyViewHolder holder, int position) {

        ModelGif model=list.get( position );

        holder.imageView.setImageResource( model.getImageIcon() );

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, GifNextActivity.class);
                intent.putExtra( "image",model.getImageIcon() );

                final Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
                view.startAnimation(animation);

                intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity( intent );

            }
        } );



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
             super( itemView );

            imageView=itemView.findViewById( R.id.imageview);

        }
    }
}
