package com.hukex.punpun.model.anime;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class AnimeTopCall {
    @SerializedName("request_hash")
    @Expose
    public String requestHash;
    @SerializedName("request_cached")
    @Expose
    public Boolean requestCached;
    @SerializedName("request_cache_expiry")
    @Expose
    public Integer requestCacheExpiry;
    @SerializedName("top")
    @Expose
    public List<AnimeTop> top = null;

}

