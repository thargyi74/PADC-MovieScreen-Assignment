package com.yeminnaing.padc_moviescreenassignment.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yeminnaing.padc_moviescreenassignment.R;
import com.yeminnaing.padc_moviescreenassignment.adapters.MovieListAdapter;

import butterknife.Bind;

/**
 * Created by yeminnaing on 11/10/17.
 */

public class MovieFragment extends BaseFragment {


    @Bind(R.id.rv_movies)
    RecyclerView rvMovies;

    @Bind(R.id.swipe_container)
    SwipeRefreshLayout swipeContainer;

    private View rootView;
    private static final String CATEGORY = "CATEGORY";

    private MovieListAdapter movieListAdapter;

    public static MovieFragment newInstance() {
        MovieFragment fragment = new MovieFragment();
        return fragment;
    }

    public MovieFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieListAdapter = new MovieListAdapter(getContext());

    }

    @Override
    protected void sendScreenHit() {

    }
}
