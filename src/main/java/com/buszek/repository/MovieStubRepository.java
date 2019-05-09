package com.buszek.repository;

import com.buszek.model.Movie;
import com.buszek.model.Screening;
import com.buszek.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MovieStubRepository {

    List<Movie> movies = new ArrayList<>();

    MovieStubRepository(@Autowired
                                ScreeningStubRepository screeningStubRepository) {
        movies.add(new Movie(
                "Rambo 6",
                Duration.ofMinutes(96),
                Arrays.asList(screeningStubRepository.findScreeningByIdWithoutReservations(1l))));
        movies.add(new Movie("Planeta małp", Duration.ofMinutes(126),
                Arrays.asList(screeningStubRepository.findScreeningByIdWithoutReservations(2l))));
        movies.add(new Movie("T-34", Duration.ofMinutes(90),
                Arrays.asList(screeningStubRepository.findScreeningByIdWithoutReservations(3l))));
    }

    public List<Movie> findAllMovies() {
        return movies;
    }
}
