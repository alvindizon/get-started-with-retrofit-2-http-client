package com.chikeandroid.retrofittutorial.data.model;


import com.squareup.moshi.Json;

public class Owner {

    @Json(name = "reputation")
    private Integer reputation;
    @Json(name = "user_id")
    private Integer userId;
    @Json(name = "user_type")
    private String userType;
    @Json(name = "profile_image")
    private String profileImage;
    @Json(name = "display_name")
    private String displayName;
    @Json(name = "link")
    private String link;
    @Json(name = "accept_rate")
    private Integer acceptRate;

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }
}
