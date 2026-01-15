package org.example.newbussystem2.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking-staff")
@Data
public class BookingStaff {

    @Id
    private String id;
    private String name;
    private String email;

}
