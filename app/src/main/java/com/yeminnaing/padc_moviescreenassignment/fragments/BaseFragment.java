package com.yeminnaing.padc_moviescreenassignment.fragments;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by yeminnaing on 11/10/17.
 */

public abstract class BaseFragment extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){
            readArguments(bundle);
        }
    }

    protected void readArguments(Bundle bundle) {

    }

    @Override
    public void onStart() {
        super.onStart();

    }


}
