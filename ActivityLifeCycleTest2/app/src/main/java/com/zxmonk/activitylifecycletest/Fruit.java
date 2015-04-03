package com.zxmonk.activitylifecycletest;

/**
 * Created by Administrator on 2015/4/3.
 */
public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
