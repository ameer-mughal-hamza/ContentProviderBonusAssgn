package com.ameerhamza.contentprovider;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ameer Hamza on 12/29/2017.
 */

public interface Client {
    @POST("/api/contacts")
    Call<List<Contacts>> contactMatch(@Body ArrayList<Contacts> list);

    @GET("/api/contacts")
    Call<List<Contacts>> getcontactMatch();
}
