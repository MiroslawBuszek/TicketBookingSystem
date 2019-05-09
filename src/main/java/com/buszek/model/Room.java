package com.buszek.model;

import java.util.List;

public class Room {

    private String name;
    private List<Seat> seats;
    private List<Screening> screenings;

    public Room(String name, List<Seat> seats, List<Screening> screenings) {
        this.name = name;
        this.seats = seats;
        this.screenings = screenings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}
