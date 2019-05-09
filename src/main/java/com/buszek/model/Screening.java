package com.buszek.model;

import java.time.LocalDateTime;
import java.util.List;

public class Screening {


    private Long id;
    private LocalDateTime displayDate;
    //private Movie movies;
    private Room rooms;
    private List<Reservation> reservations;

    public Screening(Long id, LocalDateTime displayDate, Room rooms, List<Reservation> reservations) {
        this.id = id;
        this.displayDate = displayDate;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public LocalDateTime getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(LocalDateTime displayDate) {
        this.displayDate = displayDate;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
