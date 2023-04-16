package com.hrishikesh.ParkingLot.model;

import com.hrishikesh.ParkingLot.model.vehicle.Vehicle;


public class Ticket {
  private int floor;
  public String getTicket(Vehicle vehicle, int slot) {

       return "HK_" + (vehicle.getRegNo()) + slot + vehicle.getClass();
   }
}

