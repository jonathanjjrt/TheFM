package com.thecrazylab.ux.thefm.io;

import com.thecrazylab.ux.thefm.io.model.HypedArtistModelResponse;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by jonathan on 1/28/16.
 */
public interface LastFmApiService {

    @GET(ApiConstants.URL_HYPED_ARTIST)
         void getHypedArtists(Callback<HypedArtistModelResponse> serverResponse);

}
