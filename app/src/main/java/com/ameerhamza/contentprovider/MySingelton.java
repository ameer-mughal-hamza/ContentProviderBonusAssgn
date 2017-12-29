package com.ameerhamza.contentprovider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ameer Hamza on 12/29/2017.
 */

public class MySingelton {
    private static Client service;

    public static Client getInstance() {

        if (service == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();


            OkHttpClient.Builder okclient = new OkHttpClient.Builder();
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            okclient.addInterceptor(logging);

            String url = "http://192.168.130.1/";
            Retrofit builder = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okclient.build())
                    .build();

            service = builder.create(Client.class);

        }
        return service;
    }
}
