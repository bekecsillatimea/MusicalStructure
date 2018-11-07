package com.example.beket.musicalstructure;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    String title, album, year, length;
    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        songs = new ArrayList<>();
        Intent intent = getIntent();
        int singerPosition = intent.getIntExtra(MainActivity.SINGER_POSITION_KEY, 0);

        for (int i = 0; i < Arrays.singersAndSongs[singerPosition].length; i++) {
            for (int j = 0; j < Arrays.singersAndSongs[singerPosition][i].length; j++) {
                switch (j) {
                    case 0:
                        title = Arrays.singersAndSongs[singerPosition][i][j];
                        break;
                    case 1:
                        album = Arrays.singersAndSongs[singerPosition][i][j];
                        break;
                    case 2:
                        year = Arrays.singersAndSongs[singerPosition][i][j];
                        break;
                    case 3:
                        length = Arrays.singersAndSongs[singerPosition][i][j];
                        break;
                }
            }
            songs.add(new Song(title, album, year, length));
        }

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
