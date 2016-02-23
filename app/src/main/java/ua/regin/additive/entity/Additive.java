package ua.regin.additive.entity;

import android.support.annotation.Nullable;

import java.io.Serializable;

public class Additive implements Serializable {
    private int id;
    private String name;
    private String similar;
    @Nullable
    private String synonym;
    private Naturality naturality;
    private String imageUrl;
    private int dangerRating;
    @Nullable
    private String influence;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSimilar() {
        return similar;
    }

    @Nullable
    public String getSynonym() {
        return synonym;
    }

    public Naturality getNaturality() {
        return naturality;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDangerRating() {
        return dangerRating;
    }

    @Nullable
    public String getInfluence() {
        return influence;
    }

    public enum Naturality {
        Natural, Synthetic, Unknown
    }
}