package com.hrishikesh.ParkingLot;

import com.hrishikesh.ParkingLot.model.vehicle.Truck;
import com.hrishikesh.ParkingLot.service.ParkingLot;
import com.hrishikesh.ParkingLot.model.vehicle.Bike;
import com.hrishikesh.ParkingLot.model.vehicle.Car;
import com.hrishikesh.ParkingLot.model.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ParkingLotApplication {
	private static final int floors = 2;
	private static ParkingLot[] parkingLots = new ParkingLot[floors];
	private static List<Vehicle> vehicles = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(ParkingLotApplication.class, args);
		System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");

		for (int floor = 0; floor < floors; floor++){
			parkingLots[floor] = new ParkingLot();
		}

		while(true){
			try {
				Vehicle vehicle = null;
				System.out.println("Add vehicle or remove vehicle? true = add");
				boolean action = sc.nextBoolean();
				if (action) {
					System.out.println("Welcome to ParkingLot \n" +
							"please enter the below info of ur vehicle \n" +
							"bike \t car \t truck");
					System.out.println("Vehicle type");
					String v = sc.next();
					System.out.println("Registration number");
					String r = sc.next();
					System.out.println("color");
					String c = sc.next();

					if (v.equals("bike")) {
						vehicle = new Bike(r, c);
					} else if (v.equals("car")) {
						vehicle = new Car(r, c);
					} else if (v.equals("truck")) {
						vehicle = new Truck(r, c);
					}
					String response = null;
					int floor = 0;
					for (; floor < floors; floor++) {
						response = parkingLots[floor].generateTicket(vehicle, floor);
						if (!response.equals("Space not available")) break;
					}
					vehicle.setTicket(response);
					vehicles.add(vehicle);
					System.out.println(response);
				} else if (!action) {
					displayAll();
					System.out.println("select the vehicle to be removed");
					int slot = sc.nextInt();
					String[] info = vehicles.get(slot).getTicket().split(" ");
					System.out.println(freeTheParking(info, slot, vehicles.get(slot)));
				}
			}
			catch(Exception exception){
				System.out.println("Program Shutting down");
				break;
			}
		}
	}

	private static String freeTheParking(String[] info, int idx, Vehicle vehicle) {
		int floor = Integer.parseInt(info[3]);
		int slot = Integer.parseInt(info[2]);
		return parkingLots[floor].freeParking(vehicle, slot);
	}

	public static void displayAll(){
		for(Vehicle v: vehicles)
			System.out.println(v.getTicket());
	}
}
