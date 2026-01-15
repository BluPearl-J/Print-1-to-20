package org.BusBookingSysstem.controllers;

import org.BusBookingSysstem.data.models.Bus;
import org.BusBookingSysstem.data.models.Booking;
import org.BusBookingSysstem.services.BookingStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/staff")
    public class BookingStaffController {

        @Autowired
        private BookingStaffService bookingStaffService;


        @PostMapping("/bus")
        public ResponseEntity<Bus> addBus(@RequestBody Bus bus) {
            Bus savedBus = bookingStaffService.addBus(bus);
            return ResponseEntity.ok(savedBus);
        }

        @PutMapping("/bus/{busId}")
        public ResponseEntity<Bus> modifyBusDetails(@PathVariable String busId, @RequestBody Bus updatedBus) {
            Bus bus = bookingStaffService.modifyBusDetails(busId, updatedBus);
            if (bus != null) {
                return ResponseEntity.ok(bus);
            }
            return ResponseEntity.notFound().build();
        }


        @DeleteMapping("/bus/{busId}")
        public ResponseEntity<String> deleteBus(@PathVariable String busId) {
            boolean deleted = bookingStaffService.deleteBus(busId);
            if (deleted) {
                return ResponseEntity.ok("Bus deleted successfully");
            }
            return ResponseEntity.notFound().build();
        }

        @GetMapping("/bookings")
        public ResponseEntity<List<Booking>> viewAllBookings() {
            List<Booking> bookings = bookingStaffService.viewAllBookings();
            return ResponseEntity.ok(bookings);
        }
    }


