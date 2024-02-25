package com.viktoria.cs.lesson5.task3;

import java.util.Objects;

public class Movie {
    private int id;
    private int yearOfPublishing;
    private int monthOfPublishing;
    private String genre;
    private double rating;

    public Movie(int id, int yearOfPublishing, int monthOfPublishing, String genre, double rating) {
        this.id = id;
        this.yearOfPublishing = yearOfPublishing;
        this.monthOfPublishing = monthOfPublishing;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getMonthOfPublishing() {
        return monthOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Movie movie = (Movie) object;
        return id == movie.id && yearOfPublishing == movie.yearOfPublishing && monthOfPublishing == movie.monthOfPublishing && Double.compare(rating, movie.rating) == 0 && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearOfPublishing, monthOfPublishing, genre, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", yearOfPublishing=" + yearOfPublishing +
                ", monthOfPublishing=" + monthOfPublishing +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
