package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer(){
        return customer;
    }

    @Override
    public String toString() {
        return "Reservation: " + '\n' +
                "Customer: " + customer.getFirstName() + '\n' +
                "Room: " + room + '\n' +
                "CheckInDate: " + checkInDate + '\n' +
                "CheckOutDate: " + checkOutDate ;
    }
}
