package com.buszek.service;

import com.buszek.model.Movie;
import com.buszek.repository.MovieStubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class MovieService {

    @Autowired
    private MovieStubRepository movieStubRepository;

    public List<Movie> listMoviesAvailableAt(LocalDateTime date) {

        List<Movie> allMovies = movieStubRepository.findAllMovies();
        List<Movie> resultMovie = new ArrayList<>();
        for (int i = 0; i < allMovies.size(); i++) {
            Movie currentMovie = allMovies.get(i);
            LocalDateTime screeningTime = currentMovie.getScreenings().get(0).getDisplayDate();
            if (screeningTime.isBefore(date)
                    && screeningTime.plusMinutes(currentMovie.getLenghtOfMovie().toMinutes()).isAfter(date)) {
                resultMovie.add(allMovies.get(i));
            }
        }
        return resultMovie;

    }
}
