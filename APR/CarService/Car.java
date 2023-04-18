import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Car {
    public static Scanner scn = new Scanner(System.in);
    public static HashMap<String, HashMap<String, Integer>> cars = new HashMap<>();

    static {
        HashMap<String, Integer> service = new HashMap<>();
        service.put("BS01", 2000);
        service.put("CF01", 1000);
        service.put("GS01", 3000);
        service.put("CL01", 5000);
        car.cars.put("SUV", service);
        service.clear();

        service.put("BS01", 2000);
        service.put("CF01", 1000);
        service.put("GS01", 3000);
        service.put("CL01", 5000);
        car.cars.put("Hutch", service);
        service.clear();
        service.put("BS01", 2000);
        service.put("CF01", 1000);
        service.put("GS01", 3000);
        service.put("CL01", 5000);
        car.cars.put("Sudan", service);
        
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("for Adding car type :- add");
            System.out.println("for taking service type :- service");
            String str = car.scn.next();
            if (str.equals("add")) {
                System.out.println("Enter car name");
                String carname = car.scn.next();
                System.out.println("Enter car serviceCode");
                String serviceCode = car.scn.next();
                System.out.println("Enter service charge");
                int charge = car.scn.nextInt();

                AddCars car = new AddCars(carname, serviceCode, charge);
                System.out.println("Car added Successfully");

            } else if (str.equals("service")) {
                System.out.println("Enter car name");
                String carname = car.scn.next();
                if (car.cars.containsKey(carname)) {
                    int cost = 0;
                    System.out.println(cost);
                    while (true) {

                        System.out.println("Enter your choice service");
                        String service = car.scn.next();
                        if (car.cars.get(carname).containsKey(service)) {
                            cost += car.cars.get(carname).get(service);
                            System.out.println("Service Charge is " + car.cars.get(carname).get(service));
                        } else if (service.equals("NO")) {
                            break;
                        } else {
                            System.out.println("This service not available");
                        }
                    }
                    System.out.println("Total Charge is " + cost);

                } else {
                    System.out.println("This cars Facility are not vailable");
                }

            } else {
                break;
            }
        }
        System.out.println(car.cars);

    }
}
