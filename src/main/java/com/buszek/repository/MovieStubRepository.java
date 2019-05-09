package com.buszek.repository;

import com.buszek.model.Movie;
import com.buszek.model.Room;
import com.buszek.model.Screening;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MovieStubRepository {
    List<Movie> movies = new ArrayList<>();

    MovieStubRepository(){
        movies.add(new Movie(
                "Rambo 6",
                Duration.ofMinutes(96),
                Arrays.asList(new Screening(
                        1L,
                        LocalDateTime.now(),
                        new Room("1", new ArrayList<>(), new ArrayList<>()),
                        new ArrayList<>()
                ))));
        movies.add(new Movie("Planeta małp", Duration.ofMinutes(126),
                Arrays.asList(new Screening(
                        2L,
                        LocalDateTime.of(2019,5,9,19,00),
                        new Room("2", new ArrayList<>(), new ArrayList<>()),
                        new ArrayList<>()
                ))));
        movies.add(new Movie("T-34", Duration.ofMinutes(90),
                Arrays.asList(new Screening(
                        3L,
                        LocalDateTime.of(2019,5,9,20,00),
                        new Room("3", new ArrayList<>(), new ArrayList<>()),
                        new ArrayList<>()
                ))));
    }

    public List<Movie> findAllMovies(){
        return movies;
    }
}
