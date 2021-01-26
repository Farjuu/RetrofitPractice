package com.example.farjana.retrofitpractice.data.remote;

/**
 * Created by Farjana on 1/22/2018.
 */

import com.example.farjana.retrofitpractice.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Observable<Post> savePost(@Field("title") String title,
                              @Field("body") String body,
                              @Field("userId") long userId);
}