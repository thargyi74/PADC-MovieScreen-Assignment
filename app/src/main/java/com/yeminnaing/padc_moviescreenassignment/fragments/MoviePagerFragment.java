package com.yeminnaing.padc_moviescreenassignment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.padc_moviescreenassignment.R;
import com.yeminnaing.padc_moviescreenassignment.adapters.MoviePagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yeminnaing on 11/10/17.
 */

public class MoviePagerFragment extends Fragment {

    @Bind(R.id.pager_for_movies)
    ViewPager pagerMovies;

    @Bind(R.id.tl_movies)
    TabLayout tlMovies;

    private MoviePagerAdapter mMoviePagerAdapter;
    private FragmentManager supportFragmentManager;

    public static MoviePagerFragment newInstance() {
        return new MoviePagerFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMoviePagerAdapter = new MoviePagerAdapter(getSupportFragmentManager());
        mMoviePagerAdapter.addTab(MovieFragment.newInstance(), getString(R.string.now_playing_movies));
        mMoviePagerAdapter.addTab(MovieFragment.newInstance(), getString(R.string.upcoming_movies));
        mMoviePagerAdapter.addTab(MovieFragment.newInstance(), getString(R.string.most_popular_movies));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_pager, container, false);
        ButterKnife.bind(this, rootView);

        pagerMovies.setAdapter(mMoviePagerAdapter);
        pagerMovies.setOffscreenPageLimit(mMoviePagerAdapter.getCount());
        tlMovies.setupWithViewPager(pagerMovies);

        return rootView;
    }

    public FragmentManager getSupportFragmentManager() {
        return supportFragmentManager;
    }
}
