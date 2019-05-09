package com.buszek.controller;

import com.buszek.model.Movie;
import com.buszek.model.Seat;
import com.buszek.repository.MovieStubRepository;
import com.buszek.repository.ScreeningStubRepository;
import com.buszek.service.MovieService;
import com.buszek.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class MovieController {

//    @Autowired
//    private MovieRepository movieRepository;


    @Autowired
    private ScreeningStubRepository screeningStubRepository;

    @Autowired
    MovieService movieService;

    @Autowired
    ScreeningService screeningService;

    @GetMapping("/findAvailableMovies")
     public List<Movie> listMoviesAvailableAt(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {

        return movieService.listMoviesAvailableAt(date);
     }

     @GetMapping("/listAvailableSeat")
    public List<Seat> listAvailableSeat(@RequestParam("screeningId") Long screeningId){
        return screeningService.findAvailableSeats(screeningId);
     }
}
