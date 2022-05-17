package com.example.dyario.service;

import com.example.dyario.response.NewsApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsArticleApi {

    @GET("top-headlines")
    Call<NewsApiResponse> callHeadlines(
            @Query("country") String country,
            @Query("category") String category,
            @Query("q") String query,
            @Query("apiKey") String api_key
    );
}
