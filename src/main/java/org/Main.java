package org;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    MovieController movieController;
    TheatreController theatreController;
    Main(){
        movieController= new MovieController();
        theatreController= new TheatreController();
    }
    
    public static void main(String[] args) {
        Main ticketBook = new Main();
        ticketBook.initialize();
        ticketBook.createBooking(City.Bengalur,"Dragon");
        ticketBook.createBooking(City.Bengalur,"Dragon");
    }
    private void initialize(){
        createMovies();
        createTheatre();
    }
    private void createMovies(){
        Movie dragon = new Movie();
        dragon.setMovieId(1);
        dragon.setDuration(128);
        dragon.setName("Dragon");

        Movie avengers = new Movie();
        avengers.setName("Avengers");
        avengers.setDuration(123);
        avengers.setMovieId(2);

        movieController.addMovie(dragon,City.Bengalur);
        movieController.addMovie(avengers,City.Bengalur);
    }
    private void createTheatre(){
        Movie avenger = movieController.getMovieByName("Avenger");
        Movie dragon = movieController.getMovieByName("Dragon");

        Theatre inox= new Theatre();
        inox.setTheatId(1);
        inox.setCity(City.Bengalur);
        inox.setScreen(createScreen());
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShow(1,dragon,inox.getScreen().get(0),8);
        Show inoxEveningShow = createShow(2,dragon,inox.getScreen().get(1),8);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inox.setShows(inoxShows);

        Theatre pvr= new Theatre();
        pvr.setTheatId(2);
        pvr.setCity(City.Delhi);
        pvr.setScreen(createScreen());
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShow(3,avenger,pvr.getScreen().get(0),8);
        Show pvrEveningShow = createShow(4,avenger,pvr.getScreen().get(1),8);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvr.setShows(pvrShows);


    }
}