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
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.dpandstatus.R;
import com.example.dpandstatus.latestdp.LatestDpAdapter;
import com.example.dpandstatus.latestdp.ModelLatestDp;

import java.io.File;
import java.util.ArrayList;


public class PictureFragment extends Fragment {
    private static final String WHATSAPP_STATUSES_LOCATION = "/WSDownloader";
    RecyclerView recyclerView;

    public PictureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_picture, container, false );

        //recyleview2
        ArrayList<ModelPicture> list=new ArrayList<>();

        list.add(new ModelPicture( R.drawable.image) );
        list.add(new ModelPicture( R.drawable.image) );
        list.add(new ModelPicture( R.drawable.image));



        recyclerView = view.findViewById(R.id.recyclerview_dow_pic);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        PictureAdapter adapter= new PictureAdapter(  this.getListFiles(), (Activity) getActivity() );
        recyclerView.setAdapter( adapter );

        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);
        recyclerView.setLayoutAnimation(animation);

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

                if (file.getName().endsWith( ".jpg" ) || file.getName().endsWith( ".gif" )) {
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