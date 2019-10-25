package com.example.pbanda.views.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.example.pbanda.R;
import com.example.pbanda.adapter.AlbumAdapter;
import com.example.pbanda.model.Album;
import com.example.pbanda.views.fragments.FotoFragment;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Album> listaAlbum = new ArrayList<>();

        listaAlbum.add(new Album("Direct Hits",FotoFragment.novaInstancia(R.drawable.kill,"Direct Hits")));
        listaAlbum.add(new Album("Hot Fuss", FotoFragment.novaInstancia(R.drawable.hotfuss,"Hot Fuss")));
        listaAlbum.add(new Album("Day & Age",FotoFragment.novaInstancia(R.drawable.thekillers,"Day & Age")));
        listaAlbum.add(new Album("Battle Born",FotoFragment.novaInstancia(R.drawable.battle_born,"Battle Born")));
        listaAlbum.add(new Album("Wonderfull Wonderfull",FotoFragment.novaInstancia(R.drawable.wonderful,"Wonderfull Wonderfull")));


        AlbumAdapter adapter = new AlbumAdapter(getSupportFragmentManager(), listaAlbum);

        ViewPager viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        viewPager.setOffscreenPageLimit(listaAlbum.size());

        tabLayout.setupWithViewPager(viewPager);

    }
}
