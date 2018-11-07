package com.example.beket.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by beket on 2/26/2018.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private int[] imageId;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView;

        if(gridView == null){
            gridView = LayoutInflater.from(context).inflate(R.layout.singer_list_item, parent, false);
        }

        ImageView artistImageView = gridView.findViewById(R.id.singer_image_view);
        artistImageView.setBackgroundResource(imageId[position]);

        return gridView;
    }


    ImageAdapter(@NonNull Activity context, int[] imageId) {
        this.context = context;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return imageId.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
