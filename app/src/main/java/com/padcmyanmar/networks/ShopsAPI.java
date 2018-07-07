package com.padcmyanmar.networks;

import com.padcmyanmar.networks.response.GetShopsResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ShopsAPI {

    @FormUrlEncoded
    @POST("v1/GetMealShop.php")
    Observable<GetShopsResponse> loadShops(
            @Field("access_token") String accessToken);

}
