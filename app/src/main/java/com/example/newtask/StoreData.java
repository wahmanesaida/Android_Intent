package com.example.newtask;

public class StoreData {
    private int image;
    private String name;

    public StoreData(int image, String name){
        this.image=image;
        this.name=name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
