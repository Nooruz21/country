package com.example.hw53mounth;

public class Model {
    private String name;
    private int image;

    public Model(String name, int image) {
        this.name = name;
        this.image = image;
    }

    private Integer keyId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Model(String name, int image, Integer keyId) {
        this.name = name;
        this.image = image;
        this.keyId = keyId;
    }
}
