
package org.BusBookingSysstem.data.repositories;
import org.BusBookingSysstem.data.models.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PassengerRepository extends MongoRepository<Passenger,String> {

}
