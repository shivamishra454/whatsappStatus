package com.example.dpandstatus.english_status;

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

public class EnglishStatusAdapter extends RecyclerView.Adapter<EnglishStatusAdapter.viewHolder> {

    ArrayList<ModelEnglishStatus> list;
    Context context;

    public EnglishStatusAdapter(ArrayList<ModelEnglishStatus> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public EnglishStatusAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.singlerow_english_status, parent, false );
        return new EnglishStatusAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull EnglishStatusAdapter.viewHolder holder, int position) {
        ModelEnglishStatus model = list.get( position );

        if(position%2==0){
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation));
        }else {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation2));
        }

        holder.textViewTitle.setText( model.getTitle() );
        holder.imageView.setImageResource( model.getImageIcon() );

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, EnglishStatusNextActivity.class);
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
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;
        View view;

        public viewHolder(@NonNull View itemView) {
            super( itemView );
            textViewTitle = itemView.findViewById( R.id.tv_titleee );
            imageView=itemView.findViewById( R.id.iv_es_image );
            view=itemView.findViewById( R.id.v_es_viewcolor );

        }
    }
}
