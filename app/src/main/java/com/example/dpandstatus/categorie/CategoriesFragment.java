package com.example.dpandstatus.categorie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dpandstatus.R;

import java.util.ArrayList;


public class CategoriesFragment extends Fragment {

    RecyclerView recyclerView;

    public CategoriesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate( R.layout.fragment_categories, container, false );

        //recyleview2
        ArrayList<ModelCategory> list=new ArrayList<>();

        list.add(new ModelCategory( R.drawable.romantic, Constant.LOVE_ROMANTIC ) );
        list.add(new ModelCategory( R.drawable.love,Constant.LIFE) );
        list.add(new ModelCategory( R.drawable.sad,Constant.SAD) );
        list.add(new ModelCategory( R.drawable.attitude,Constant.ATTITUDE) );
        list.add(new ModelCategory( R.drawable.friendship,Constant.FRIENDSHIP) );
        list.add(new ModelCategory( R.drawable.funnyy,Constant.FUNNY) );
        list.add(new ModelCategory( R.drawable.familylove,Constant.FAMILYLOVE) );
        list.add(new ModelCategory( R.drawable.cute,Constant.CUTE) );
        list.add(new ModelCategory( R.drawable.fastival,Constant.FESTIVAL) );
        list.add(new ModelCategory( R.drawable.girly,Constant.GIRLY) );
        list.add(new ModelCategory( R.drawable.motivatinal,Constant.MOTIVATINAL) );
        list.add(new ModelCategory( R.drawable.greting,Constant.GREETING) );



        recyclerView = view.findViewById(R.id.recyclerview1);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        CategoryAdapter adapter= new CategoryAdapter(  list, getContext() );
        recyclerView.setAdapter( adapter );

        return view;
    }
}