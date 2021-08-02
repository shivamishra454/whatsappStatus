package com.example.dpandstatus.categorie;

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
import com.example.dpandstatus.hindi_status.HindiStatusNextActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {

    ArrayList<ModelCategory> list;
    Context context;

    public CategoryAdapter(ArrayList<ModelCategory> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_category,parent,false );
        return new CategoryAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.viewHolder holder, int position) {
        ModelCategory model=list.get( position );
        holder.imageView.setImageResource( model.getImageIcon() );
        holder.textViewTitle.setText( model.getTitle() );

        if(position%2==0){
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation));
        }else {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.animation2));
        }


        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, CategorieNextActivity.class);
                intent.putExtra( "title",model.getTitle() );

                // loading Animation from
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
        TextView textViewTitle;

        public viewHolder(@NonNull View itemView) {
            super( itemView );

            imageView=itemView.findViewById( R.id.iv_category);
            textViewTitle=itemView.findViewById( R.id.tv_title );
        }
    }
}
