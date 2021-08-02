package com.example.dpandstatus.english_status;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dpandstatus.HindiStatusInterface;
import com.example.dpandstatus.R;
import com.example.dpandstatus.hindi_status.HindiStatusNextShareActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EnglishStatusNextAdapter extends RecyclerView.Adapter<EnglishStatusNextAdapter.viewHolder>{

    ArrayList<String> list;
    Context context;
    HindiStatusInterface hindiStatusInterface;

    public EnglishStatusNextAdapter(ArrayList<String> list, Context context, HindiStatusInterface hindiStatusInterface) {
        this.list = list;
        this.context = context;
        this.hindiStatusInterface=hindiStatusInterface;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public EnglishStatusNextAdapter.viewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.singlerow_english_next,parent,false );
        return new EnglishStatusNextAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull EnglishStatusNextAdapter.viewHolder holder, int position) {


        holder.textViewTitle.setText( list.get(position) );
        holder.textViewTitle.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  Intent intent=new Intent(context, EnglishStatusNextShareActivity.class);
                //intent.putExtra( "title",model.getTitle() );

                //intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
                //context.startActivity( intent );

                final Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
                view.startAnimation(animation);

                hindiStatusInterface.setContent( list.get(position) );

            }
        } );

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        ImageView iv_esn_copy;

        public viewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super( itemView );
            textViewTitle=itemView.findViewById( R.id.tv_Enext_title);
            iv_esn_copy=itemView.findViewById( R.id.iv_esn_copy );


            final TextView q = itemView.findViewById(R.id.tv_Enext_title ); // my textview
            iv_esn_copy.setOnClickListener(new View.OnClickListener() { // set onclick listener to my textview
                @Override
                public void onClick(View view) {
                    ClipboardManager cm = (ClipboardManager)context.getSystemService( Context.CLIPBOARD_SERVICE);
                    cm.setText(q.getText().toString());
                    Toast.makeText(context, "Copied :)", Toast.LENGTH_SHORT).show();
                }
            });


        }
    }
}
