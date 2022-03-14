package ru.netology.domain;

public class Movies {

    private int id;
    private int movieId;
    private String genre;
    private String title;


    public Movies(int id, int movieId, String genre, String title) {
        this.id = id;
        this.movieId = movieId;
        this.genre = genre;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}