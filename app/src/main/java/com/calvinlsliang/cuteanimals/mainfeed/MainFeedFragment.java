package com.calvinlsliang.cuteanimals.mainfeed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.calvinlsliang.cuteanimals.R;
import com.calvinlsliang.cuteanimals.mainfeed.adapter.ImageAdapter;

import java.util.Arrays;
import java.util.List;

public class MainFeedFragment extends Fragment {

    private static final int NUM_COLUMNS = 3;

    private RecyclerView imageGrid;

    private ImageAdapter imageAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_feed, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageGrid = view.findViewById(R.id.grid_view);
    }

    @Override
    public void onStart() {
        super.onStart();

        imageAdapter = new ImageAdapter(getContext());
        imageGrid.setHasFixedSize(true);
        imageGrid.setLayoutManager(new GridLayoutManager(getContext(), NUM_COLUMNS));
        imageGrid.setAdapter(imageAdapter);

        List<String> images = Arrays.asList("https://i.imgur.com/hBmlTfS.png",
                "https://i.imgur.com/hBmlTfS.png",
                "https://i.imgur.com/hBmlTfS.png",
                "https://i.imgur.com/hBmlTfS.png",
                "https://i.imgur.com/hBmlTfS.png");

        imageAdapter.setImages(images);
    }
}
