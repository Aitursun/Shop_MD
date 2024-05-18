package com.example.shop_md.remote_data;

import com.example.shop_md.models.ModelM;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("products")
    Call<List<ModelM>> getStoreProducts();
}
