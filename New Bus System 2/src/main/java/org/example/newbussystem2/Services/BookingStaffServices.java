package org.example.newbussystem2.Services;


import org.example.newbussystem2.data.models.Booking;
import org.example.newbussystem2.data.models.BookingStaff;
import org.example.newbussystem2.data.models.Bus;
import org.example.newbussystem2.data.repositories.BookingRepository;
import org.example.newbussystem2.data.repositories.BusRepository;
import org.example.newbussystem2.data.repositories.BookingStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingStaffServices {

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


    @Autowired
    private BookingStaffRepository bookingStaffRepository;

    public List<BookingStaff> getAllStaff() {
        return bookingStaffRepository.findAll();
    }

    public BookingStaff addStaff(BookingStaff staff) {
        return bookingStaffRepository.save(staff);
    }


    public BookingStaff updateStaff(String id, BookingStaff updatedStaff) {
        Optional<BookingStaff> existing = bookingStaffRepository.findById(id);
        if (existing.isPresent()) {
            BookingStaff staff = existing.get();
            staff.setName(updatedStaff.getName());
            staff.setEmail(updatedStaff.getEmail());
            return bookingStaffRepository.save(staff);
        }
        return null;
    }

    public boolean deleteStaff(String id) {
        if (bookingStaffRepository.existsById(id)) {
            bookingStaffRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

