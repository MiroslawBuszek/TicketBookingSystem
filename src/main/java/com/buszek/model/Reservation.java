package com.buszek.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Reservation {

    private String name;
    private String surname;
    private LocalDateTime expirationTime;
    private BigDecimal price;
    private Seat seat;
    private Screening screening;

}
