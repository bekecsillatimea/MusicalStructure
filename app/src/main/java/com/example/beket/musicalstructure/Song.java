package com.example.beket.musicalstructure;

/**
 * Created by beket on 2/28/2018.
 */

public class Song {

    String mTitle;
    String mAlbum;
    String mYear;
    String mLength;

    Song(String title, String album, String year, String length){
        mTitle = title;
        mAlbum = album;
        mYear = year;
        mLength = length;
    }

    String getSongTitle(){ return mTitle; }

    String getSongAlbum() { return mAlbum; }

    String getSongYear() { return mYear; }

    String getSongLength() { return mLength; }
}
