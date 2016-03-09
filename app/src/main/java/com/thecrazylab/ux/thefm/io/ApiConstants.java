package com.thecrazylab.ux.thefm.io;

/**
 * Created by jonathan on 1/28/16.
 */
public class ApiConstants {
    public static final String API_KEY = "fa062309e6f1028546dfd1f0af02a926";

    public static final String URL_BASE = "http://ws.audioscrobbler.com";

    public static final  String PATH_VERSION = "/2.0";

    public static final String PARAM_METHOD = "method";
    public static final String PARAM_FORMAT = "format";
    public static final String PARAM_API_KEY = "api_key";

    public static final String VALUE_HYPED_ARTIST_METHOD = "chart.gethypedartists";
    public static final String VALUE_JSON = "json";

    public static final String URL_HYPED_ARTIST = PATH_VERSION + "?" + PARAM_API_KEY + "=" + API_KEY + "&" +
            PARAM_METHOD + "=" + VALUE_HYPED_ARTIST_METHOD + "&" +
            PARAM_FORMAT + "=" + VALUE_JSON;

}
