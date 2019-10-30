package com.example.netflixui.models;

import java.util.List;

public class Movie {

    private Long id;
    private String movieName;
    private List<Category> category;
    private MovieType movieType;
    private MovieVerified verified;
    private int releaseYear;
    private User user;

    public Movie(String movieName, List<Category> category, MovieType movieType, MovieVerified verified, int releaseYear, User user) {
        this.movieName = movieName;
        this.category = category;
        this.movieType = movieType;
        this.verified = verified;
        this.releaseYear = releaseYear;
        this.user = user;
    }

    public Movie(String movieName , int releaseYear, List<Category> category) {
        this.movieName = movieName;
        this.category = category;
        this.releaseYear = releaseYear;
    }

    public Movie(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieVerified getVerified() {
        return verified;
    }

    public void setVerified(MovieVerified verified) {
        this.verified = verified;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", category=" + category +
                ", movieType=" + movieType +
                ", verified=" + verified +
                ", releaseYear=" + releaseYear +
                ", user=" + user +
                '}';
    }
}
