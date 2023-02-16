package com.hrishikesh.ParkingLot.model.vehicle;

import com.hrishikesh.ParkingLot.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Car implements Vehicle{
    private String regNo;
    private String color;
    private String ticket;

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

    public Car(String regNo, String color) {
        Ticket ticket = new Ticket();
        this.regNo = regNo;
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNo='").append(regNo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", ticket='").append(ticket).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override


    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
