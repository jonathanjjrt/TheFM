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
import com.thecrazylab.ux.thefm.domain.Artist;
import com.thecrazylab.ux.thefm.io.LastFmApiAdapter;
import com.thecrazylab.ux.thefm.io.LastFmApiService;
import com.thecrazylab.ux.thefm.io.model.HypedArtistModelResponse;
import com.thecrazylab.ux.thefm.ui.adapter.HypedArtistAdapter;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by federica on 18/01/16.
 */
public class HypedArtistFragment extends Fragment implements Callback<HypedArtistModelResponse> {

    public static final int NUM_COLUMNS = 2;

    public static final String LOG_TAG = HypedArtistFragment.class.getName();
    private RecyclerView mHyppedArtistsList;
    private HypedArtistAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HypedArtistAdapter(getActivity());

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity){
            Log.i("Its attached", "YES");
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        LastFmApiAdapter.getApiService()
                .getHypedArtists(this);

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_hyped_artist,container,false);

        mHyppedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artists_list);

        setupHypedArtistList();
        //setDummyContent();
        return root;
    }

    private void setupHypedArtistList(){

        mHyppedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(),NUM_COLUMNS));
        mHyppedArtistsList.setAdapter(adapter);
        mHyppedArtistsList.addItemDecoration(new ItemOffsetDecoration(getActivity(), R.integer.offset));
    }

    private void setDummyContent(){

        ArrayList<Artist> artist = new ArrayList<>();
        for(int i= 0; i < 10; i++ ){
            artist.add(new Artist("Artist" + i));
        }

        adapter.addAll(artist);
    }

    @Override
    public void success(HypedArtistModelResponse hypedArtistModelResponse, Response response) {
          adapter.addAll(hypedArtistModelResponse.getArtist());
    }

    @Override
    public void failure(RetrofitError error) {
           error.printStackTrace();
    }
}
