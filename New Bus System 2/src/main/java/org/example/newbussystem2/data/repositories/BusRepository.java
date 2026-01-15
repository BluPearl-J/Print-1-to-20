package org.example.newbussystem2.data.repositories;

import org.example.newbussystem2.data.models.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus,String> {

}