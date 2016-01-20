package com.thecrazylab.ux.thefm.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    public static final int NUM_COLUMNS = 2;

    public static final String LOG_TAG = HypedArtistFragment.class.getName();
    private RecyclerView mHyppedArtistsList;

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

        mHyppedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artists_list);


        return root;
    }

    private void setupHypedArtistList(){

        mHyppedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(),NUM_COLUMNS));
    }
}
