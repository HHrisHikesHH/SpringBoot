package com.hrishikesh.ParkingLot.model.vehicle;

import com.hrishikesh.ParkingLot.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Truck implements Vehicle{
    private String regNo;
    private String color;
    private String ticket;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Truck(String regNo, String color) {
        Ticket ticket = new Ticket();
        this.regNo = regNo;
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
