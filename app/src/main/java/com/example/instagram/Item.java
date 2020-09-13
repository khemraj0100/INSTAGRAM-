package com.example.instagram;

public class Item {
    String FruitsListName;
    int FruitsListImage;
    public Item(String birdListName, int birdListImage) {
        this.FruitsListName = birdListName;
        this.FruitsListImage = birdListImage;
    }

    public String getFruitsListNameList() {
        return FruitsListName;
    }

    public void setFruitsListName(String birdListName) {
        this.FruitsListName = birdListName;
    }

    public int getBirdListImage() {
        return FruitsListImage;
    }

    public void setBirdListImage(int birdListImage) {
        this.FruitsListImage = birdListImage;
    }
}

