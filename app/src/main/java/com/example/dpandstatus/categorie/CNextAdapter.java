package com.example.dpandstatus.categorie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.dpandstatus.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CNextAdapter extends RecyclerView.Adapter <CNextAdapter.viewHolder> {

    ArrayList<String> list;
    Context context;
    CategoriesInterface categoriesInterface;

    public CNextAdapter(ArrayList<String> list, Context context, CategoriesInterface categoriesInterface) {
        this.list = list;
        this.context = context;
        this.categoriesInterface=categoriesInterface;
    }

    @NonNull
    @NotNull
    @Override
    public CNextAdapter.viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_c_next,parent,false );
        return new CNextAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CNextAdapter.viewHolder holder, int position) {


        Glide.with(context).load(list.get( position )).placeholder(R.drawable.ic_launcher_background).dontAnimate()
                .diskCacheStrategy( DiskCacheStrategy.ALL)
                .apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(12)))
                .into(holder.imageView);

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent=new Intent(context, CategorieNext2Activity.class);
               // intent.putExtra( "image",model.getImageIcon() );
               // intent.putExtra( "title",model.getTitle() );

                //intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
              //  context.startActivity( intent );
                final Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
                view.startAnimation(animation);

                categoriesInterface.setContent( list.get( position ));

            }
        } );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle;
        public viewHolder(@NonNull @NotNull View itemView) {
            super( itemView );
            imageView=itemView.findViewById( R.id.c_imageview);
            textViewTitle=itemView.findViewById( R.id.cn_title );


        }
    }
}
