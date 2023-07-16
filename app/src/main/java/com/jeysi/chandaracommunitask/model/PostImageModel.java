package com.jeysi.chandaracommunitask.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class PostImageModel {

    private String imageUrl, id, description;

    @ServerTimestamp
    private Date timestamps;

    public PostImageModel() {
    }

    public PostImageModel(String imageUrl, String id, String description, Date timestamps) {
        this.imageUrl = imageUrl;
        this.id = id;
        this.description = description;
        this.timestamps = timestamps;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Date timestamps) {
        this.timestamps = timestamps;
    }
}
