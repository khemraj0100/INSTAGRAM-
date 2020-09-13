package com.example.instagram;

public class ProfileItem {
    String FruitsListName5;
    int FruitsListImage5;
    public ProfileItem(String birdListName, int birdListImage) {
        this.FruitsListName5 = birdListName;
        this.FruitsListImage5 = birdListImage;
    }

    public String getFruitsListNameList() {
        return FruitsListName5;
    }

    public void setFruitsListName(String birdListName) {
        this.FruitsListName5 = birdListName;
    }

    public int getBirdListImage() {
        return FruitsListImage5;
    }

    public void setBirdListImage(int birdListImage) {
        this.FruitsListImage5 = birdListImage;
    }
}

