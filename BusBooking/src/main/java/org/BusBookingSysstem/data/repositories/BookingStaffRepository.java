package org.BusBookingSysstem.data.repositories;

import org.BusBookingSysstem.data.models.BookingStaff;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingStaffRepository extends MongoRepository<BookingStaff, String> {
}
