package models;
import java.time.LocalDateTime;


    public class Bus {

        private int id;
        private String registrationNumber;
        private String route;
        private int busCapacity;
        private boolean available;
        private LocalDateTime departureDate;


        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

        public int getBusCapacity() {
            return busCapacity;
        }

        public void setBusCapacity(int busCapacity) {
            this.busCapacity = busCapacity;
        }

        public LocalDateTime getDepartureDate() {
            return departureDate;
        }

        public void setDepartureDate(LocalDateTime departureDate) {
            this.departureDate = departureDate;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }

