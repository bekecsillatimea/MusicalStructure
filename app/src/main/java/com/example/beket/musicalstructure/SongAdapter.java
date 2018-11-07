package com.example.beket.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by beket on 2/28/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Song currentSong = getItem(position);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }

        TextView titleTextView = listItemView.findViewById(R.id.song_title);
        titleTextView.setText(currentSong.getSongTitle());

        TextView albumTextView = listItemView.findViewById(R.id.album);
        albumTextView.setText(currentSong.getSongAlbum());

        TextView yearTextView = listItemView.findViewById(R.id.year_release);
        yearTextView.setText(currentSong.getSongYear());

        TextView lengthTextView= listItemView.findViewById(R.id.length);
        lengthTextView.setText(currentSong.getSongLength());

        return listItemView;
    }

    SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context,0, songs);
    }
}
