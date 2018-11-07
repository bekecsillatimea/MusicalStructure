package com.example.beket.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    public static final String SINGER_POSITION_KEY = "SingerPosition";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.main_activity_label));
        gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(new ImageAdapter(this, Arrays.images));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songsActivityIntent = new Intent(MainActivity.this, SongsActivity.class);
                songsActivityIntent.putExtra(SINGER_POSITION_KEY, position);
                startActivity(songsActivityIntent);
            }
        });
    }
}
