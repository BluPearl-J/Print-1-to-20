package Models;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean hasPaid;
    LocalDateTime dateOfPayment;
    LocalDateTime dateOfBooking;
    public Ticket(int id, Vehicle vehicle, Offence offence, boolean hasPaid) {}

    public Ticket(String title) {
        this.title = title;
    }
}
