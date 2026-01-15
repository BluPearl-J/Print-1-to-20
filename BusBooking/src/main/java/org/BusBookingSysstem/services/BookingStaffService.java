package org.BusBookingSysstem.services;

import org.BusBookingSysstem.data.models.Bus;
import org.BusBookingSysstem.data.models.Booking;
import org.BusBookingSysstem.data.repositories.BusRepository;
import org.BusBookingSysstem.data.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingStaffService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private BookingRepository bookingRepository;

    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Bus modifyBusDetails(String busId, Bus updatedBus) {
        Optional<Bus> existingBus = busRepository.findById(busId);
        if (existingBus.isPresent()) {
            Bus bus = existingBus.get();
            bus.setRoute(updatedBus.getRoute());
            bus.setBusCapacity(updatedBus.getBusCapacity());
            bus.setAvailable(updatedBus.isAvailable());
            bus.setDepartureDate(updatedBus.getDepartureDate());
            return busRepository.save(bus);
        }
        return null;
    }


    public boolean deleteBus(String busId) {
        if (busRepository.existsById(busId)) {
            busRepository.deleteById(busId);
            return true;
        }
        return false;
    }
    public List<Booking> viewAllBookings() {
        return bookingRepository.findAll();
    }
}
