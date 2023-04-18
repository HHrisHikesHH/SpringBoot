
import java.util.HashMap;

public class AddCars {
          private String cartype;
          private String serviceCode;
          private int charge;

          public AddCars(String cartype, String serviceCode, int charge) {
                    this.cartype = cartype;
                    this.serviceCode = serviceCode;
                    this.charge = charge;
                    HashMap<String, Integer> service = new HashMap<>();
                    service.put(serviceCode, charge);
                    car.cars.put(cartype, service);
          }

          public void getResult() {
                    System.out.println("Okk Checked");
          }
}
