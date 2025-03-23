package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovies;
    MovieController(){
        cityVsMovie= new HashMap<>();
        allMovies= new ArrayList<>();
    }
    void addMovie(Movie movie, City city){
        List<Movie> movies= cityVsMovie.get(city);
        movies.add(movie);
        cityVsMovie.put(city,movies);
    }
    Movie getMovieByName(String name){
        for(Movie movie:allMovies){
            if((movie.getName()).equals(name)){
                return movie;
            }
        }
        return null;
    }
}
