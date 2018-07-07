package com.padcmyanmar.data.vo;

import com.google.gson.annotations.SerializedName;

public class ReviewVO {

    @SerializedName("reviewId")
    private String reviewId;

    @SerializedName("review")
    private String review;

    @SerializedName("userId")
    private String userId;

    @SerializedName("userName")
    private String userName;

    @SerializedName("userImage")
    private String userImage;

    @SerializedName("timestamp")
    private String timeStamp;

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
