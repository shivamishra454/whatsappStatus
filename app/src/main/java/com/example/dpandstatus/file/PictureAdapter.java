package com.example.dpandstatus.file;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dpandstatus.R;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PictureAdapter extends RecyclerView.Adapter <PictureAdapter.viewHolder>{

    private ArrayList<File> filesList;
    private Activity activity;

    public PictureAdapter(ArrayList<File> filesList, Activity activity) {
        this.filesList = filesList;
        this.activity = activity;
    }

    @NonNull
    @NotNull
    @Override
    public PictureAdapter.viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( activity ).inflate( R.layout.singlerow_dow_pic,parent,false );
        return new PictureAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PictureAdapter.viewHolder holder, int position) {

        File currentFile = filesList.get(position);
        if (currentFile.getAbsolutePath().endsWith(".jpg")) {
            Bitmap myBitmap = BitmapFactory.decodeFile(currentFile.getAbsolutePath());
            holder.imageView.setImageBitmap(myBitmap);
        }


        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(activity, FullImageActivity.class);
                intent.putExtra( "imageFile",currentFile );
                intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity( intent );

            }
        } );

    }

    @Override
    public int getItemCount() {
        return filesList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public viewHolder(@NonNull @NotNull View itemView) {
            super( itemView );

            imageView=itemView.findViewById( R.id.imageview);

        }
    }
}
