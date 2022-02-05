package com.examples.tourguideapp.model;

import java.io.Serializable;

public class itemCategory implements Serializable {
    int Image;
    String Name;
    String Discretion;

    public itemCategory(int image, String name, String discretion) {
        Image = image;
        Name = name;
        Discretion = discretion;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDiscretion() {
        return Discretion;
    }

    public void setDiscretion(String discretion) {
        Discretion = discretion;
    }
}
