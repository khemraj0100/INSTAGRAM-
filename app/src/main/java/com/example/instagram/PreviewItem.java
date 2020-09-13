package com.example.instagram;

public class PreviewItem {
    int profileImage;
    String name;
    String previewImage;

    public PreviewItem(int profileImage, String name, String previewImage) {
        this.profileImage = profileImage;
        this.name = name;
        this.previewImage = previewImage;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }
}
