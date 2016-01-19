package com.thecrazylab.ux.thefm.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thecrazylab.ux.thefm.MainActivity;
import com.thecrazylab.ux.thefm.R;

/**
 * Created by federica on 18/01/16.
 */
public class HypedArtistFragment extends Fragment {

    public static final String LOG_TAG = HypedArtistFragment.class.getName();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity){
            Log.i("Its attached", "YES");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_hyped_artist,container,false);


        return root;
    }
}
