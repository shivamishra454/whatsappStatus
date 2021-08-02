package com.example.dpandstatus.status;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.dpandstatus.R;

import java.io.File;
import java.util.ArrayList;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;


public class StatusFragment extends BaseActivity {

    // whatsapp path
    private static final String WHATSAPP_STATUSES_LOCATION = "/Whatsapp_status/.Statuses";
    private static final String WHATSAPP_STATUSES_LOCATION2 = "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses";
    private static final String WHATSAPP_STATUSES_LOCATION3 = "/WhatsApp/Media/.Statuses";
    private RecyclerView mRecyclerViewMediaList;
    private SwipeRefreshLayout mSwipeRefresh;

    private LinearLayoutManager mLinearLayoutManager;
    public static final String TAG = "Home";

    ArrayList<File> inFiles2 = new ArrayList<File>();
    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate( R.layout.fragment_status, container, false );




// set recycler
        mRecyclerViewMediaList = (RecyclerView) view.findViewById(R.id.recyclerViewMedia);
        mSwipeRefresh = view.findViewById(R.id.swipeRefresh);
        int numberOfColumns = 3;
        mRecyclerViewMediaList.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
//set animation
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);
        mRecyclerViewMediaList.setLayoutAnimation(animation);

        inFiles2=this.getListFiles();
        // create adapters
        RecyclerViewMediaAdapter recyclerViewMediaAdapter = new RecyclerViewMediaAdapter(inFiles2, (Activity) getActivity() );
        mRecyclerViewMediaList.setAdapter(recyclerViewMediaAdapter);


        setSwipeRefresh();
        return view;
    }


   /* private ArrayList<File> get2ListFiles() {
        File parentDir = new File( Environment.getExternalStorageDirectory().toString() + WHATSAPP_STATUSES_LOCATION3 );
        Log.e( "Tag", "path : " + parentDir.toString() );
        ArrayList<File> inFiles = new ArrayList<File>();
        File[] files;
        files = parentDir.listFiles();
        if (files != null) {

            for (File file : files) {

                if (file.getName().endsWith( ".jpg" ) || file.getName().endsWith( ".gif" ) || file.getName().endsWith( ".mp4" )) {
                    if (!inFiles.contains( file ))
                        inFiles.add( file );
                    Log.e( "Tag", "File Name : " + file.getName() );
                }
            }

        } else {
            Log.e( "Tag", "Else" );
        }
        return inFiles;
    }*/


    @SuppressLint("ResourceAsColor")
    private void setSwipeRefresh() {
        mSwipeRefresh.setColorSchemeColors(R.color.purple_200);
        mSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                mSwipeRefresh.setRefreshing(false);
                inFiles2.clear();
                inFiles2=getListFiles();
                RecyclerViewMediaAdapter recyclerViewMediaAdapter = new RecyclerViewMediaAdapter(inFiles2, (Activity) getActivity() );
                mRecyclerViewMediaList.setAdapter(recyclerViewMediaAdapter);

            }
        });

    }

    private ArrayList<File> getListFiles() {
        ArrayList<File> inFiles = new ArrayList<File>();
        File parentDir = new File(Environment.getExternalStorageDirectory().toString() + WHATSAPP_STATUSES_LOCATION3);
        File parentDir2 = new File(Environment.getExternalStorageDirectory().toString() + WHATSAPP_STATUSES_LOCATION2);
        File[] files;
        files = parentDir.listFiles();

        if (files == null) {
            File[] files2;
            files2 = parentDir2.listFiles();
            if (files2 != null) {
                for (File file : files2) {

                    if (file.getName().endsWith(".jpg") || file.getName().endsWith(".gif") || file.getName().endsWith(".mp4") ) {
                        if (!inFiles.contains(file))
                            inFiles.add(file);
                    }
                }
            }else {

            }


        } else {

            for (File file : files) {

                if (file.getName().endsWith(".jpg") || file.getName().endsWith(".gif") || file.getName().endsWith(".mp4")) {
                    if (!inFiles.contains(file))
                        inFiles.add(file);

                }
            }

        }


        return inFiles;
    }
}





