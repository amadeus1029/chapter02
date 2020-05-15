package com.javaex.ex09;

public class Song {
    private String name, title, album, composer;
    private int year, track;
    private String code;

    public Song() {
    }

    public Song(String name, String title, String album, String composer, int year, int track) {
        this.name = name;
        this.title = title;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }
    public Song(String name, String title, String album, String composer, int year, int track, String code) {
        this(name,title,album,composer,year,track);
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public void showInfo() {
        System.out.println
                (
                        "이름: " + this.name +
                                "제목: " + this.title +
                                "앨범: " + this.album +
                                "트랙" + this.track + "번" +
                                "발매년도: " + this.year +
                                "- 작곡: " + this.composer

                );
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                ", composer='" + composer + '\'' +
                ", year=" + year +
                ", track=" + track +
                '}';
    }
}
