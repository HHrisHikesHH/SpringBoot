package com.hrishikesh.ParkingLot.service;

import com.hrishikesh.ParkingLot.model.Ticket;
import com.hrishikesh.ParkingLot.model.vehicle.*;
import org.springframework.beans.factory.annotation.Autowired;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;

public class ParkingLot {
    @Autowired
    Ticket ticket;
    private final int bike = 3;
    private final int car = 2;
    private final int truck = 1;
    private boolean[] bikes = new boolean[bike];
    private boolean[] cars = new boolean[car];
    private boolean[] trucks = new boolean[truck];

    private int firstAvailable(boolean[] vehicle){
        for(int slot = 0; slot < vehicle.length; slot++)
            if(!vehicle[slot]) {
                vehicle[slot] = true;
                return slot;
            }
        return -1;
    }

    private int bikesParking(){
        return firstAvailable(bikes);
    }

    private int carsParking(){
        return firstAvailable(cars);
    }
    private int trucksParking(){
        return firstAvailable(trucks);
    }

    public String getTicket(Vehicle vehicle, int slot, int floor, String type) {
        return "H_K" + " " + (vehicle.getRegNo()) + " " + slot + " " + floor + " " + type;
    }

    public String generateTicket(Vehicle vehicle, int floor){
        String type = null;
        if(vehicle instanceof Bike){
            type = "Bike";
            int slot = bikesParking();
            if(slot == -1){
                return "Space not available";
            }
            else return getTicket(vehicle, slot, floor, type);
        }else if(vehicle instanceof Car){
            type = "Car";
            int slot = carsParking();
            if(slot == -1){
                return "Space not available";
            }
            else return getTicket(vehicle, slot, floor, type);
        }else if(vehicle instanceof Truck){
            type = "truck";
            int slot = trucksParking();
            if(slot == -1){
                return "Space not available";
            }
            else return getTicket(vehicle, slot, floor, type);
        }
        return null;
    }

    public String freeParking(Vehicle vehicle, int slot){
        if(vehicle instanceof Bike){
            bikes[slot] = false;
        }else if(vehicle instanceof Car){
            cars[slot] = false;
        }else if(vehicle instanceof Truck){
            trucks[slot] = false;
        }
        return "Thank you visit again";
    }
}
