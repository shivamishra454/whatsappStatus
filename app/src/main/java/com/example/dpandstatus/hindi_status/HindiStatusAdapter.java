package com.example.dpandstatus.hindi_status;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dpandstatus.R;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HindiStatusAdapter extends RecyclerView.Adapter<HindiStatusAdapter.MyViewHolder>{

    ArrayList<ModelHindiStatus> list;
    Context context;

    public HindiStatusAdapter(ArrayList<ModelHindiStatus> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_hindi_status,parent,false );
        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModelHindiStatus model=list.get( position );

        holder.textViewTitle.setText( model.getTitle() );
        holder.image.setImageResource( model.getImageIcon() );

        if(position%2==0){
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation));
        }else {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation2));
        }

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, HindiStatusNextActivity.class);
                intent.putExtra( "title",model.getTitle() );

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

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            textViewTitle=itemView.findViewById( R.id.tv_titlee );
            image=itemView.findViewById( R.id.iv_hs_image );

        }
    }
}
