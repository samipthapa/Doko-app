package com.example.doko;

public class Club {
    private String name;
    private String introduction;
    private String imageUrl;

    public Club(String name, String introduction, String imageUrl) {
        this.name = name;
        this.introduction = introduction;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
