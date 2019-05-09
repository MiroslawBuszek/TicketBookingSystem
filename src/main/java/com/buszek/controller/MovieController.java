package com.buszek.controller;

import com.buszek.model.Movie;
import com.buszek.model.Seat;
import com.buszek.repository.MovieStubRepository;
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
    private MovieStubRepository movieStubRepository;

    String dateToParse = "2019-05-09T19:10:45";

    @GetMapping("/test")
     public List<Movie> listMovies() {
        LocalDateTime tmp = LocalDateTime.parse(dateToParse);
        System.out.println(tmp);
         return movieStubRepository.findAllMovies();
     }

    @GetMapping("/findAvailableMovies")
     public List<Movie> listMoviesAvailableAt(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {

        List<Movie> allMovies =  movieStubRepository.findAllMovies();
        List<Movie> resultMovie = new ArrayList<>();
        for(int i = 0; i < allMovies.size(); i++){
            Movie currentMovie = allMovies.get(i);
            LocalDateTime screeningTime = currentMovie.getScreenings().get(0).getDisplayDate();
            if(screeningTime.isBefore(date)
            && screeningTime.plusMinutes(currentMovie.getLenghtOfMovie().toMinutes()).isAfter(date) ){
                resultMovie.add(allMovies.get(i));
            }
        };
        return resultMovie;
     }

     @GetMapping("/listAvailableSeat")
    public List<Seat> listAvailableSeat(@RequestParam("screeningId") Long screeningId){
        return null;
     }

//    @GetMapping(name = "test")
//    public String test() {
//        movieRepository.save(new Movie("Rambo", Duration.ofMinutes(96l)));
//        return "hello";
//    }

}
