package com.example.dpandstatus.latestdp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.dpandstatus.R;
import com.example.dpandstatus.hindi_status.HindiStatusNextActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class  LatestDpAdapter extends RecyclerView.Adapter <LatestDpAdapter.viewHolder>{

    ArrayList<String> list;
    Context context;

    public LatestDpAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public LatestDpAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_latestdp,parent,false );
        return new LatestDpAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull LatestDpAdapter.viewHolder holder, int position) {

        Glide.with(context).load(list.get( position )).placeholder(R.drawable.ic_launcher_background).dontAnimate()
                .diskCacheStrategy( DiskCacheStrategy.ALL)
                .apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(12)))
                .into(holder.imageView);
        Log.e("Tah", list.get( position ));

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, LatestDpNextActivity.class);
                intent.putExtra( "image",list.get( position ) );

                final Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
                view.startAnimation(animation);

                intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity( intent );

            }
        } );

    }

    @Override
    public int getItemCount() {
        return  list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super( itemView );

            imageView=itemView.findViewById( R.id.imageview);
        }
    }
}
