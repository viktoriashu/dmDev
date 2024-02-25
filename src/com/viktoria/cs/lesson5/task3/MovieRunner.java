package com.viktoria.cs.lesson5.task3;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie(2, 1995, 11, "fff", 4.4 );
        Movie movie2 = new Movie(3, 1995, 11, "fff", 4.4 );
        Movie movie3 = new Movie(4, 1996, 11, "fff", 4.4 );

//        MovieHouse movieHouse = new MovieHouse();
//        List<Movie> movies = new ArrayList<>();
//
//        movieHouse.addMovie(new Movie(1,1995, 12, "vvv", 8.8));
//        movieHouse.addMovie(new Movie(2,1994, 11, "vvv", 8.7));

        MovieHouse movieHouse = new MovieHouse();
        movieHouse.addMovie(movie);
        System.out.println(movieHouse);
//        movieHouse.addMovie(new Movie(2, 1995, 11, "fff", 4.4  ));
        movieHouse.addMovie(movie2);
        System.out.println(movieHouse);
        movieHouse.addMovie(movie3);
        System.out.println(movieHouse);









//        movieHouse.printMap(movieHouse);


    }










}
