package com.example.dpandstatus.hindi_status;

public class ModelHindiStatus {

    private String title;
    private int imageIcon;

    public ModelHindiStatus(String title, int imageIcon) {
        this.title = title;
        this.imageIcon = imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }
}
