package com.example.netflixui.models;

import java.util.Set;

public class Category {
    private Long id;

    private String categoryName;

    private Set<Movie> movies;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
