package com.example.genshinlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class adapterGenshin extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    List<Genshin> itemObjects;

    public adapterGenshin(Context context, List<Genshin> itemObjects){
        this.context = context;
        this.itemObjects = itemObjects;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_element, null);
        ViewHolder holderItem=new ViewHolder(view);
        return holderItem;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(itemObjects.get(position).nama);
        holder.img.setImageResource(itemObjects.get(position).image);
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();
    }
}
