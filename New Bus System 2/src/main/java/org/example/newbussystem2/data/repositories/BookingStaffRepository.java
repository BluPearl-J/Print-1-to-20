package org.example.newbussystem2.data.repositories;



import org.example.newbussystem2.data.models.BookingStaff;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingStaffRepository extends MongoRepository<BookingStaff, String> {
}