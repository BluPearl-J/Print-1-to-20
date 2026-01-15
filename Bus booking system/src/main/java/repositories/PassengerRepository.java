package repositories;

import models.Passenger;

import java.util.List;

public interface PassengerRepository {

       Passenger  save(Passenger passenger);
        Passenger findById(int id);
        List<Passenger> findAll();
        void deleteById(int id);
        void deleteAll();
        void delete(Passenger passenger);
        long count();
    }

