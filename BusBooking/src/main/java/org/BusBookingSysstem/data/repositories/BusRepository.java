package org.BusBookingSysstem.data.repositories;
import org.BusBookingSysstem.data.models.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusRepository extends MongoRepository<Bus,String> {

}
