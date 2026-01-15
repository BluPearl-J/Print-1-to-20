package org.BusBookingSysstem.data.models;
import lombok.Data;
import java.time.LocalDateTime;
@Data
public class Bus {
    private String id;
    private String registrationNumber;
    private String route;
    private int busCapacity;
     private boolean available;
    private LocalDateTime departureDate;

    }


