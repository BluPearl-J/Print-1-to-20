package org.example.newbussystem2.data.models;

import java.time.LocalDateTime;
import lombok.Data;

    @Data
    public class Booking {
        private String bookingId;
        private Passenger passengerId;
        private Bus bus;
        private LocalDateTime bookingTime;
        private boolean isbooked;
    }

