package com.buszek.service;


import com.buszek.model.Seat;
import com.buszek.repository.MovieStubRepository;
import com.buszek.repository.ScreeningStubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningService {

    @Autowired
    private ScreeningStubRepository screeningStubRepository;

    public List<Seat> findAvailableSeats(Long screeningId) {

        List<Seat> resultList = new ArrayList<>();

        for (Seat seat : screeningStubRepository.findScreeningById(screeningId).getReservations()) {
            if (seat.getReservation() == null) {
                resultList.add(seat);
            }
        }
        return resultList;
    }
}
