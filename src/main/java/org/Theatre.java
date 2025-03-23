package org;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatId;
    String address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public int getTheatId() {
        return theatId;
    }

    public void setTheatId(int theatId) {
        this.theatId = theatId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreen() {
        return screen;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
