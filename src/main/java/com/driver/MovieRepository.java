package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MovieRepository {

    HashMap<String,Movie> movieHashMap = new HashMap<>();
    HashMap<String,Director> directorHashMap = new HashMap<>();

    String addMovie(Movie movie){
        String name = movie.getName();
        movieHashMap.put(name,movie);
        return "Movie Added";
    }

}
