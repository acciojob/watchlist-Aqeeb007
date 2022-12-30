package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {

    public class pair{
        Movie movie;
        Director director;

        public pair(Movie movie, Director director) {
            this.movie = movie;
            this.director = director;
        }
    }
    ///////DB////////////////////////////////////////////////////////////////////////////////////////////
    HashMap<String,Movie> movieMap;
    HashMap<String,Director> directorMap;
    HashMap<String, List<String>> directorMoviePair;

    public MovieRepository(HashMap<String, List<String>> directorMoviePair) {
        this.directorMoviePair = new HashMap<String, List<String>>();
        this.movieMap = new HashMap<>();
        this.directorMap = new HashMap<>();

    }

    ////////////////////////////////////////////////////////////////////////////////////////

    String addMovie(Movie movie){
        String name = movie.getName();
        movieMap.put(name,movie);
        return "Movie Added";
    }

    String addDirector(Director director){
        String name = director.getName();
        directorMap.put(name,director);
        return "Director Added";
    }


    void addMovieDirectorPair(String movie,String director){
        if (movieMap.containsKey(movie) && directorMap.containsKey(director)) {
            List<String> currentMovieByDirector = new ArrayList<>();
            if (directorMoviePair.containsKey(director)) {
                currentMovieByDirector = directorMoviePair.get(director);
            }
            currentMovieByDirector.add(movie);
            directorMoviePair.put(director,currentMovieByDirector);
        }
    }

//    public Movie getMovieByName(Movie movie){
//
//
//    }

}
