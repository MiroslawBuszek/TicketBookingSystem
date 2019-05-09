package com.buszek.model;

import java.time.Duration;
import java.util.List;

public class Movie {

    private String titleMovie;

    private Duration lenghtOfMovie;

    private List<Screening> screenings;

    public Movie(String titleMovie, Duration lenghtOfMovie, List<Screening> screenings) {
        this.titleMovie = titleMovie;
        this.lenghtOfMovie = lenghtOfMovie;
        this.screenings = screenings;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public Duration getLenghtOfMovie() {
        return lenghtOfMovie;
    }

    public void setLenghtOfMovie(Duration lenghtOfMovie) {
        this.lenghtOfMovie = lenghtOfMovie;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}
