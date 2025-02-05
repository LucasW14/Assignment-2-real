package com.csc340.demo;

public class Artist {

    public String name;
    public int albumCount;
    public int fansCount;


    public Artist(String name, int albumCount, int fansCount){
        this.name = name;
        this.albumCount = albumCount;
        this.fansCount = fansCount;
    }

    public String getName(){
        return name;}

    public int getAlbumCount(){
        return albumCount;
    }

    public int getFansCount(){
        return fansCount;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setAlbumCount(int albumCount){
        this.albumCount = albumCount;
    }

    public void setFansCount(int fansCount){
        this.fansCount = fansCount;
    }


}
