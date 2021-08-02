package com.example.dpandstatus.file;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.dpandstatus.R;
//import com.example.dpandstatus.whatsapp.WhatsappVideoSubActivity;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter extends RecyclerView.Adapter <VideoAdapter.viewHolder>{
    private ArrayList<File> filesList;
    private Activity activity;

    public VideoAdapter(ArrayList<File> filesList, Activity activity) {
        this.filesList = filesList;
        this.activity = activity;
    }

    @NonNull
    @NotNull
    @Override
    public VideoAdapter.viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( activity ).inflate( R.layout.singlerow_sub_video_file,parent,false );
        return new VideoAdapter.viewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull VideoAdapter.viewHolder holder, int position) {


        File currentFile = filesList.get(position);
        if (currentFile.getAbsolutePath().endsWith(".mp4")) {
            Bitmap bmThumbnail;
            bmThumbnail = ThumbnailUtils.createVideoThumbnail(currentFile.getAbsolutePath(), MediaStore.Video.Thumbnails.MICRO_KIND);
            holder.imageView.setImageBitmap(bmThumbnail);



         /*   Uri video = Uri.parse(currentFile.getAbsolutePath());
            holder.videoView.setVideoURI(video);
            holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                    //holder.videoView.start();
                }
            });*/
        }

        holder.imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(activity, FullVideoActivity.class);
                intent.putExtra( "videoFile",currentFile );
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
            imageView=itemView.findViewById( R.id.sr_videoview);
        }
    }
}
