package com.example.tiki_layout;

public class Shoes {
    private int img;
    private String info;
    private String moredetail;

    public Shoes(int img, String info, String moredetail) {
        this.img = img;
        this.info = info;
        this.moredetail = moredetail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMoredetail() {
        return moredetail;
    }

    public void setMoredetail(String moredetail) {
        this.moredetail = moredetail;
    }
}
