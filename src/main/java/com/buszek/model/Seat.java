package com.buszek.model;

public class Seat {

    private int number;
    private int row;
    private Reservation reservation;

    public Seat(int number, int row, Reservation reservation) {
        this.number = number;
        this.row = row;
        this.reservation = reservation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
