package org.BusBookingSysstem.data.repositories;

import org.BusBookingSysstem.data.models.Booking;
import org.BusBookingSysstem.data.models.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String> {
}
