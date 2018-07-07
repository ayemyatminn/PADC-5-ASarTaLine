package com.padcmyanmar.networks.response;

import com.google.gson.annotations.SerializedName;
import com.padcmyanmar.data.vo.ShopsVO;

import java.util.ArrayList;
import java.util.List;

public class GetShopsResponse {


    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("astlMealShop")
    private List<ShopsVO> shopsList;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public List<ShopsVO> getShopsList() {
        if (shopsList==null){
            shopsList=new ArrayList<>();
        }
        return shopsList;
    }

}
