package com.javaex.ex06;

public class Song {
    private String title, artist, album, composer;
    private int year, track;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public void setTrack(int track) {
        if (track >= 0) {
            this.track = track;
        } else {
            this.track = 0;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getComposer() {
        return this.composer;
    }

    public int getYear() {
        if (this.year > 0) {
            return this.year;
        } else {
            return 0;
        }
    }

    public int getTrack() {
        if (this.track > 0) {
            return this.track;
        } else {
            return 0;
        }
    }

    public void showInfo() {
        System.out.println(this.getArtist()+", "+this.getTitle()+"("+this.getAlbum()+" track No."+this.getTrack()+", "+this.getComposer()+" 작곡 - "+this.getYear()+"년)");
    }
}
