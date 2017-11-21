package com.calvinlsliang.cuteanimals.mainfeed.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.calvinlsliang.cuteanimals.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context context;

    private List<String> images = new ArrayList<>();

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_image_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Picasso.with(context)
                .load(images.get(position))
                .fit()
                .centerCrop()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public void setImages(List<String> images) {
        this.images = images;
        notifyDataSetChanged();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;

        private ImageViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.grid_image);
        }
    }
}
