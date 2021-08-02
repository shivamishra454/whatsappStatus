package com.example.dpandstatus.gif;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.bumptech.glide.Glide;
import com.example.dpandstatus.R;

import java.util.ArrayList;


public class GifFragment extends Fragment {

    RecyclerView recyclerView;

    public GifFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_gif, container, false );

        //recyleview
        ArrayList<ModelGif> list=new ArrayList<>();

        list.add(new ModelGif( R.drawable.loading) );
        list.add(new ModelGif( R.drawable.gif1) );
        list.add(new ModelGif( R.drawable.gif2));
        list.add(new ModelGif( R.drawable.gif3 ));
        list.add(new ModelGif( R.drawable.gif4) );
        list.add(new ModelGif( R.drawable.gif5) );
        list.add(new ModelGif( R.drawable.gif6));
        list.add(new ModelGif( R.drawable.gif7) );
        list.add(new ModelGif( R.drawable.gif8) );
        list.add(new ModelGif( R.drawable.gif9));
        list.add(new ModelGif( R.drawable.gif10 ));
        list.add(new ModelGif( R.drawable.gif11) );
        list.add(new ModelGif( R.drawable.gif12) );
        list.add(new ModelGif( R.drawable.gif13));
        list.add(new ModelGif( R.drawable.loading) );
        list.add(new ModelGif( R.drawable.gif1) );
        list.add(new ModelGif( R.drawable.gif2));
        list.add(new ModelGif( R.drawable.gif3 ));
        list.add(new ModelGif( R.drawable.gif4) );
        list.add(new ModelGif( R.drawable.gif5) );
        list.add(new ModelGif( R.drawable.gif6));
        list.add(new ModelGif( R.drawable.gif7) );
        list.add(new ModelGif( R.drawable.gif8) );
        list.add(new ModelGif( R.drawable.gif9));
        list.add(new ModelGif( R.drawable.gif10 ));
        list.add(new ModelGif( R.drawable.gif11) );
        list.add(new ModelGif( R.drawable.gif12) );
        list.add(new ModelGif( R.drawable.gif13));





        recyclerView = view.findViewById(R.id.recyclerview);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        GifAdapter adapter= new GifAdapter(  list, getContext() );

        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);
        recyclerView.setLayoutAnimation(animation);

        recyclerView.setAdapter( adapter );

        return view;
    }
}