package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    //////////////////////////////////////////////

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovies(@RequestBody() Movie movie){
        String result = movieService.addMovie(movie);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody() Director director){
        String result = movieService.addDirector(director);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie") String movie ,@RequestParam("director")String director){
        movieService.addMovieDirectorPair(movie,director);
        return new ResponseEntity<>("Pair Added",HttpStatus.ACCEPTED);
    }

//    @GetMapping("/get-movie-by-name/{name}")
//    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") Movie movie){
//        Movie movie1 = movieService.getMovieByName(movie);
//
//        return new ResponseEntity<>(movie1,HttpStatus.OK);
//    }
}
