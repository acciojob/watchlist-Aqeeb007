package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    /////////////////////////////////////////////////////////////////////////////////

    String addMovie(Movie movie){
        String result = movieRepository.addMovie(movie);
        return result;
    }

    String addDirector(Director director){
        String result = movieRepository.addDirector(director);
        return result;
    }

    void addMovieDirectorPair(String movie,String director){
        movieRepository.addMovieDirectorPair(movie,director);
    }

//    public Movie getMovieByName(Movie movie){
//        Movie movie1 = movieRepository.getMovieByName(movie);
//
//        return movie1;
//    }


}
