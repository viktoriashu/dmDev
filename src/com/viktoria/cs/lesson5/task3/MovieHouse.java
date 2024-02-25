package com.viktoria.cs.lesson5.task3;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.util.*;
import java.util.stream.Collectors;

public class MovieHouse {
    //отсортированный ассоциативный массив,
    //где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.

    //Это map, LinkedHashMap?

    //Movie будут или листом или сэтом

    private final Map<Integer, Set<Movie>> map = new LinkedHashMap<>();
    //может set, чтобы дубликатов по ид не было. или введи проверку


    public MovieHouse() {
    }

    public void addMovie(Movie movie) {

        if (map.containsKey(movie.getYearOfPublishing())) {
            map.put(movie.getYearOfPublishing(), map.get(movie.getYearOfPublishing()));
        } else {
            map.put(movie.getYearOfPublishing(), new Set<Movie>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Movie> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Movie movie) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Movie> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }
            });
        }

    }


    public void printMap(MovieHouse movieHouse) {
        map.values().forEach(movies -> {
                    ;
                }
                );




//        System.out.println("MovieHouse: " + map);
//        System.out.println("MovieHouse.keySet(): " + map.keySet());
//
//        for (Integer integer : map.keySet()) {
//            System.out.println(integer + " имеет");
//            for (Set<Movie> movies : map.values()){
//                System.out.println(movies.toString());
//            }





//            Iterator<Movie> iterator = map.get(integer).iterator();
//            while (iterator.hasNext()){
//                Movie movie = iterator.next();
//                System.out.println("  " + movie);
//            }
//            for (Movie movies : map.get(integer)) {
//                System.out.println("  " + movies);
//            }

    }

    @Override
    public String toString() {
        return "MovieHouse{" +
                "map=" + map +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MovieHouse that = (MovieHouse) object;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}

//    @Override
//    public String toString() {
//        return "MovieHouse{" +
//                "map=" + map.entrySet().stream()
//                .map(e -> e.getKey() + " "
//                + e.getValue().toString()).collect(Collectors.joining("\n"))+  +
//                '}';
//    }
//    @Override
//    public String toString() {
//        for (Map.Entry<Integer, Set<Movie>> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            for (Set<Movie>> entry2 : )
//        }
//            return "{" + entry.getKey() + "=" + entry.getValue() + "}";
//
//    }

    //норм





    //список должен быть, и в него добавляется фильм, и он должен возвращать список фильмов
//        map.values().add(Collections.singletonList(movie));


    //        Map<Integer, Movie> addMovie = new LinkedHashMap<>();
//        addMovie.put(movie.getId(), movie);



