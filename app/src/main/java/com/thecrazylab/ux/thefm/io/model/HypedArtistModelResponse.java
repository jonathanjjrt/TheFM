package com.thecrazylab.ux.thefm.io.model;
import com.google.gson.annotations.SerializedName;
import com.thecrazylab.ux.thefm.domain.Artist;

import java.util.ArrayList;

/**
 * Created by jonathan on 1/28/16.
 */
public class HypedArtistModelResponse {

    @SerializedName(JasonKeys.ARTIST_RESULT)
    HypedArtistResults results;

    public ArrayList<Artist> getArtist(){

        return results.artists;
    }

    public class HypedArtistResults{

        @SerializedName(JasonKeys.ARTIST_ARRAY)
        ArrayList<Artist> artists;
    }
}
