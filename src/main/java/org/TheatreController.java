package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheat;
//    List<Theatre> allTheat;
    TheatreController(){
        cityVsTheat=new HashMap<>();
//        allTheat= new ArrayList<>();
    }
    void addTheatre (Theatre theat, City city){
        List<Theatre> theatres= cityVsTheat.getOrDefault(city, new ArrayList<>());
        theatres.add(theat);
        cityVsTheat.put(city, theatres);
    }
    Map<Theatre, List<Show>> getAllShow(Movie movie, City city){
        Map<Theatre, List<Show>> theatVsShow = new HashMap<>();
        List<Theatre> theat= cityVsTheat.get(city);
        for (Theatre the: theat){
            List<Show> shows= the.getShows();
            List<Show> givenMovieShow = new ArrayList<>();
            for(Show show: shows){
                if(show.movie.getMovieId()== movie.movieId){
                    givenMovieShow.add(show);
                }
            }
            if(!givenMovieShow.isEmpty()){
                theatVsShow.put(the, givenMovieShow);
            }
        }

        return theatVsShow;
    }
}
