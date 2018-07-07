package com.padcmyanmar.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShopsVO {

    @SerializedName("shopId")
    private String shopId;

    @SerializedName("name")
    private String name;

    @SerializedName("address")
    private String address;

    @SerializedName("lat")
    private float lat;

    @SerializedName("lng")
    private float lng;

    @SerializedName("township")
    private String township;

    @SerializedName("popularity")
    private float popularity;

    @SerializedName("shopImages")
    private List<String > images;

    @SerializedName("reviews")
    private List<ReviewVO> reviews;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<ReviewVO> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewVO> reviews) {
        this.reviews = reviews;
    }
}
