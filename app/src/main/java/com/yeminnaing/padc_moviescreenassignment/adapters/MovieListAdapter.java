package com.yeminnaing.padc_moviescreenassignment.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.padc_moviescreenassignment.R;
import com.yeminnaing.padc_moviescreenassignment.viewholders.MovieViewHolder;

/**
 * Created by yeminnaing on 11/10/17.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private LayoutInflater mLayoutInflator;

    public MovieListAdapter(Context context){
        //mContext = context;
        mLayoutInflator = LayoutInflater.from(context);

    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View moviesItemView = mLayoutInflator.inflate(R.layout.view_item_movie, parent, false);

        return new MovieViewHolder(moviesItemView);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
