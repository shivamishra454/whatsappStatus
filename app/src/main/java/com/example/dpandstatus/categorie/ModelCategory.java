package com.example.dpandstatus.categorie;

public class ModelCategory {

    private int imageIcon;
    private String title;

    public ModelCategory(int imageIcon, String title) {
        this.imageIcon = imageIcon;
        this.title = title;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
