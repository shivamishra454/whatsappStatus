package com.example.dpandstatus.hindi_status;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dpandstatus.R;
import com.example.dpandstatus.categorie.Constant;

import java.util.ArrayList;


public class HindiStatusFragment extends Fragment {

    RecyclerView recyclerView;


    public HindiStatusFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_hindi_status, container, false );



        ArrayList<ModelHindiStatus> list=new ArrayList<>();

        /*ModelHindiStatus modelHindiStatus =new ModelHindiStatus("fh",R.drawable.gif4  );
        modelHindiStatus.setTitle( "mmm" );
        modelHindiStatus.setImageIcon( R.drawable.gif4 );
        list.add( modelHindiStatus );
        */

        list.add(new ModelHindiStatus( ConstantHs.ATTITUDE ,R.drawable.attitude) );
        list.add(new ModelHindiStatus( ConstantHs.DEKHPAGALI,R.drawable.romantic) );
        list.add(new ModelHindiStatus(  ConstantHs.LOVE,R.drawable.love) );
        list.add(new ModelHindiStatus( ConstantHs.FRIENDSHIP,R.drawable.friendship) );
        list.add(new ModelHindiStatus( ConstantHs.RAIN,R.drawable.sad) );
        list.add(new ModelHindiStatus( ConstantHs.FUNNY,R.drawable.funnyy) );
        list.add(new ModelHindiStatus( ConstantHs.SAD,R.drawable.sad) );
        list.add(new ModelHindiStatus( ConstantHs.MOTIVATINAL,R.drawable.motivatinal) );
        list.add(new ModelHindiStatus( ConstantHs.FESTIVAL,R.drawable.fastival) );
        list.add(new ModelHindiStatus( ConstantHs.GOODMORNING,R.drawable.familylove) );
        list.add(new ModelHindiStatus( ConstantHs.GOODNIGHT,R.drawable.romantic) );





        recyclerView=view.findViewById( R.id.recyclerview2);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(getContext());
        layoutManager.setOrientation( LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager( layoutManager );
        HindiStatusAdapter adapter= new HindiStatusAdapter(  list, getContext());
        recyclerView.setAdapter( adapter );



        return view;
    }
}