package com.example.dpandstatus.status;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.dpandstatus.R;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

import de.mateware.snacky.Snacky;

public class RecyclerViewMediaAdapter extends RecyclerView.Adapter<RecyclerViewMediaAdapter.FileHolder>{
    private static String DIRECTORY_TO_SAVE_MEDIA_NOW = "/WSDownloader/";
    private ArrayList<File> filesList;
    private Activity activity;

    public RecyclerViewMediaAdapter(ArrayList<File> filesList, Activity activity) {
        this.filesList = filesList;
        this.activity = activity;
        // setHasStableIds(true);
    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public FileHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate( R.layout.item, parent, false);
        return new FileHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclerViewMediaAdapter.FileHolder holder, int position) {
        File currentFile = filesList.get(position);

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(activity, SubStatusActivity.class);
                intent.putExtra( "image",currentFile);

                final Animation animation = AnimationUtils.loadAnimation(activity, R.anim.bounce);
                view.startAnimation(animation);


                intent.setFlags( intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity( intent );

            }
        } );






        if (currentFile.getAbsolutePath().endsWith(".mp4")) {
            Log.e("Tag", "Path : " + currentFile.getAbsolutePath().toString());
            Bitmap bmThumbnail;
            bmThumbnail = ThumbnailUtils.createVideoThumbnail(currentFile.getAbsolutePath(), MediaStore.Video.Thumbnails.MICRO_KIND);
            holder.imageViewImageMedia.setImageBitmap(bmThumbnail);
         /*   holder.cardViewImageMedia.setVisibility(View.GONE);
            holder.cardViewVideoMedia.setVisibility(View.VISIBLE);
            Uri video = Uri.parse(currentFile.getAbsolutePath());
            holder.videoViewVideoMedia.setVideoURI(video);
            holder.videoViewVideoMedia.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                    holder.videoViewVideoMedia.start();
                }
            });*/
        } else {
            Log.e("Tag", "Path : " + currentFile.getAbsolutePath().toString());
            Bitmap myBitmap = BitmapFactory.decodeFile(currentFile.getAbsolutePath());
            holder.imageViewImageMedia.setImageBitmap(myBitmap);
        }
    }

    @Override
    public int getItemCount() {
//        Log.e("Tag", "Size : " + filesList.size());
//        for (File file : filesList) {
//            Log.e("Tag", "Name : " + file.getName());
//        }
        return filesList.size();
    }



    public class FileHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageViewImageMedia;
        CardView cardViewVideoMedia;
        CardView cardViewImageMedia;

        public FileHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageViewImageMedia = (ImageView) itemView.findViewById(R.id.imageViewImageMedia);
            cardViewVideoMedia = (CardView) itemView.findViewById(R.id.cardViewVideoMedia);
            cardViewImageMedia = (CardView) itemView.findViewById(R.id.cardViewImageMedia);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}

