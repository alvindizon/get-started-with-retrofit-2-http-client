package com.chikeandroid.retrofittutorial.data.model;

import com.squareup.moshi.Json;

import java.util.List;

public class SOAnswersResponse {

    @Json(name = "items")
    private List<Item> items = null;
    @Json(name = "has_more")
    private Boolean hasMore;
    @Json(name = "backoff")
    private Integer backoff;
    @Json(name = "quota_max")
    private Integer quotaMax;
    @Json(name = "quota_remaining")
    private Integer quotaRemaining;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getBackoff() {
        return backoff;
    }

    public void setBackoff(Integer backoff) {
        this.backoff = backoff;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }
}
