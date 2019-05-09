package com.buszek.model;

import java.time.LocalDateTime;
import java.util.List;

public class Screening {


    private Long id;
    private LocalDateTime displayDate;
    private String roomName;
    private List<Seat> seats;

    public Screening(Long id, LocalDateTime displayDate, String roomName, List<Seat> seats) {
        this.id = id;
        this.displayDate = displayDate;
        this.roomName = roomName;
        this.seats = seats;
    }

    public LocalDateTime getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(LocalDateTime displayDate) {
        this.displayDate = displayDate;
    }

    public String getRooms() {
        return roomName;
    }

    public void setRooms(String roomName) {
        this.roomName = roomName;
    }

    public List<Seat> getReservations() {
        return seats;
    }

    public void setReservations(List<Seat> reservations) {
        this.seats = reservations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
