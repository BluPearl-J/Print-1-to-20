package org.example.newbussystem2.data.repositories;

import org.example.newbussystem2.data.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String> {
}