package com.example.dpandstatus.file;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerDownloadAdapter extends FragmentPagerAdapter {


    public final List<Fragment> lstFragment=new ArrayList<>();
    public final List<String> lstTitle=new ArrayList<>();

    public ViewPagerDownloadAdapter(@NonNull FragmentManager fm) {
        super( fm );
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get( position );
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle( position );
    }

    public void addFragment(Fragment fragment, String title){
        lstFragment.add( fragment );
        lstTitle.add( title );
    }
}
