package com.example.dpandstatus.file;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dpandstatus.R;
//import com.example.dpandstatus.whatsapp.ModelWhatsappVideo;

import java.io.File;
import java.util.ArrayList;


public class VideosFragment extends Fragment {
    private static final String WHATSAPP_STATUSES_LOCATION = "/WSDownloader";
    RecyclerView recyclerView;

    public VideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_videos, container, false );

        ArrayList<ModelVideo> list=new ArrayList<>();
        list.add(new ModelVideo( R.raw.teri_akkho) );
        list.add(new ModelVideo( R.raw.video2) );
        list.add(new ModelVideo( R.raw.teri_akkho) );
        list.add(new ModelVideo( R.raw.teri_akkho) );
        list.add(new ModelVideo( R.raw.video2) );



        recyclerView = view.findViewById(R.id.recyclerview_dow_video);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        VideoAdapter adapter= new VideoAdapter(   this.getListFiles(), (Activity) getActivity() );
        recyclerView.setAdapter( adapter );

        return view;
    }
    private ArrayList<File> getListFiles() {
        File parentDir = new File( Environment.getExternalStorageDirectory().toString() + WHATSAPP_STATUSES_LOCATION );
        Log.e( "Tag", "path : " + parentDir.toString() );
        ArrayList<File> inFiles = new ArrayList<File>();
        File[] files;
        files = parentDir.listFiles();
        if (files != null) {

            for (File file : files) {

                if ( file.getName().endsWith( ".mp4" )) {
                    if (!inFiles.contains( file ))
                        inFiles.add( file );
                    Log.e( "Tag", "File Name : " + file.getName() );
                }
            }

        } else {
            Log.e( "Tag", "Else" );
        }
        return inFiles;
    }
}