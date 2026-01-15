package org.example.newbussystem2.controllers;


import org.example.newbussystem2.Services.BookingStaffServices;
import org.example.newbussystem2.data.models.Booking;
import org.example.newbussystem2.data.models.BookingStaff;
import org.example.newbussystem2.data.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/staff")

public class BookingStaffController {

    @Autowired
    private BookingStaffServices bookingStaffServices;


    @PostMapping("/bus")
    public ResponseEntity<Bus> addBus(@RequestBody Bus bus) {
        Bus savedBus = bookingStaffServices.addBus(bus);
        return ResponseEntity.ok(savedBus);
    }

    @PutMapping("/bus/{busId}")
    public ResponseEntity<Bus> modifyBusDetails(@PathVariable String busId, @RequestBody Bus updatedBus) {
        Bus bus = bookingStaffServices.modifyBusDetails(busId, updatedBus);
        if (bus != null) {
            return ResponseEntity.ok(bus);
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/bus/{busId}")
    public ResponseEntity<String> deleteBus(@PathVariable String busId) {
        boolean deleted = bookingStaffServices.deleteBus(busId);
        if (deleted) {
            return ResponseEntity.ok("Bus deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> viewAllBookings() {
        List<Booking> bookings = bookingStaffServices.viewAllBookings();
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/ping")
    public ResponseEntity<String> staffRoot() {
        return ResponseEntity.ok("Staff API is up and running!");
    }


    @GetMapping
    public ResponseEntity<List<BookingStaff>> getAllStaff() {
        List<BookingStaff> staffList = bookingStaffServices.getAllStaff();
        return ResponseEntity.ok(staffList);
    }


    @PostMapping
    public ResponseEntity<BookingStaff> addStaff(@RequestBody BookingStaff staff) {
        BookingStaff savedStaff = bookingStaffServices.addStaff(staff);
        return ResponseEntity.ok(savedStaff);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookingStaff> updateStaff(@PathVariable String id, @RequestBody BookingStaff staff) {
        BookingStaff updated = bookingStaffServices.updateStaff(id, staff);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStaff(@PathVariable String id) {
        boolean deleted = bookingStaffServices.deleteStaff(id);
        if (deleted) {
            return ResponseEntity.ok("Staff deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }
}


