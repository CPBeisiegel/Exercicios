package com.example.pbanda.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.pbanda.model.Album;

import java.util.List;

public class AlbumAdapter extends FragmentStatePagerAdapter {

    private List<Album> albumList;

    public AlbumAdapter(FragmentManager fragmentManager, List<Album> albumList){
        super(fragmentManager);
        this.albumList = albumList;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return albumList.get(position).getNome();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return albumList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return albumList.size();
    }
}
