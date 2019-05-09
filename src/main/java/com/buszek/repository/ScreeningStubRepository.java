package com.buszek.repository;

import com.buszek.model.Reservation;
import com.buszek.model.Screening;
import com.buszek.model.Seat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningStubRepository {
    List<Screening> screenings = new ArrayList<>();

    ScreeningStubRepository() {
        screenings.add(new Screening(
                1L,
                LocalDateTime.now(),
                "1",
                ScreeningStubRepository.generateSeats(10, 10)
        ));
        screenings.add(new Screening(
                2L,
                LocalDateTime.of(2019, 5, 9, 19, 00),
                "2",
                ScreeningStubRepository.generateSeats(6, 10)
        ));
        screenings.add(new Screening(
                3L,
                LocalDateTime.of(2019, 5, 9, 20, 00),
                "3",
                ScreeningStubRepository.generateSeats(12, 16)
        ));
    }

    public List<Screening> findAllScreenings() {
        return screenings;
    }

    public Screening findScreeningByIdWithoutReservations(Long id) {
        for (int i = 0; i < screenings.size(); i++ ){
           if( screenings.get(i).getId().equals(id)){
               //return screenings.get(i);
               return new Screening(screenings.get(i).getId(),
                       screenings.get(i).getDisplayDate(),
                       screenings.get(i).getRooms(),
                       null);
           }
        }
        return null;
    }

    public Screening findScreeningById(Long id) {
        for (int i = 0; i < screenings.size(); i++ ){
            if( screenings.get(i).getId().equals(id)){
                //return screenings.get(i);
                return screenings.get(i);
            }
        }
        return null;
    }

    private static List<Seat> generateSeats(int rows, int seatsInRow) {

        List<Seat> generateOfSeats = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                generateOfSeats.add(new Seat(j, i, Math.random() > 0.5 ? null : new Reservation()));
            }
        }
        return generateOfSeats;

    }
}
