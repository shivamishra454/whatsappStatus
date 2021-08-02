package com.example.dpandstatus.english_status;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dpandstatus.R;
import com.example.dpandstatus.hindi_status.ConstantHs;

import java.util.ArrayList;


public class EnglishStatusFragment extends Fragment {

    RecyclerView recyclerView;

    public EnglishStatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate( R.layout.fragment_english_status, container, false );

        ArrayList<ModelEnglishStatus> list=new ArrayList<>();

        list.add(new ModelEnglishStatus( ConstantEs.LOVE,R.drawable.love) );
        list.add(new ModelEnglishStatus( ConstantEs.ROMANTIC,R.drawable.romantic) );
        list.add(new ModelEnglishStatus( ConstantEs.FUNNY,R.drawable.funnyy) );
        list.add(new ModelEnglishStatus( ConstantEs.SAD,R.drawable.sad) );
        list.add(new ModelEnglishStatus(  ConstantEs.ATTITUDE,R.drawable.attitude) );
        list.add(new ModelEnglishStatus( ConstantEs.FRIENDS,R.drawable.familylove) );
        list.add(new ModelEnglishStatus( ConstantEs.CUTE,R.drawable.cute) );
        list.add(new ModelEnglishStatus( ConstantEs.LIFE,R.drawable.love) );
        list.add(new ModelEnglishStatus( ConstantEs.BIRTHDAY,R.drawable.girly) );
        list.add(new ModelEnglishStatus( ConstantEs.INSPIRATIONAL,R.drawable.motivatinal) );
        list.add(new ModelEnglishStatus( ConstantEs.GOODMORNING,R.drawable.romantic) );
        list.add(new ModelEnglishStatus( ConstantEs.GOODNIGHT,R.drawable.fastival) );



        recyclerView=view.findViewById( R.id.recyclerview3);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(getContext());
        layoutManager.setOrientation( LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager( layoutManager );

        EnglishStatusAdapter adapter= new EnglishStatusAdapter(  list, getContext());
        recyclerView.setAdapter( adapter );



        return view;
    }
}