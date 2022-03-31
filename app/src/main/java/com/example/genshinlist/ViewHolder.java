package com.example.genshinlist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends  RecyclerView.ViewHolder{

    public TextView name;
    public ImageView img;

    public ViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.nama);
        img = itemView.findViewById(R.id.imageView2);

    }
}
