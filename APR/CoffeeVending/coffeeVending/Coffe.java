package coffeeVending;

import java.util.Scanner;

public class Coffe {
          public static long milk = 2000, water = 1000, coffee_beans = 100, wallet = 0;

          public static void main(String[] args) {
                    Scanner scn = new Scanner(System.in);
                    while (true) {
                              System.out.println("Please Enter you Choice like \nLatte\nEspresso\nCappuccino");
                              String order = scn.next();
                              if (order.equals("Espresso")) {
                                        if (Coffe.water >= 250 && Coffe.coffee_beans >= 16) {
                                                  coffeeVending.Espresso esp = new Espresso();

                                                  System.out.println(esp.orderReady());
                                                  System.out.println("Remainin Stcks are :- ");
                                                  System.out.println("Milk :- " + Coffe.milk + "\nWater :- "
                                                                      + Coffe.water + "\nCoffe Beans :-"
                                                                      + Coffe.coffee_beans);
                                                  System.out.println("Waller Balance is : " + Coffe.wallet);
                                        } else {
                                                  System.out.println("Sorry For That Stocks are not available");
                                                  break;
                                        }
                              } else if (order.equals("Latte")) {
                                        if (Coffe.water >= 350 && Coffe.coffee_beans >= 20 && Coffe.milk >= 75) {
                                                  coffeeVending.Latte esp = new Latte();

                                                  System.out.println(esp.orderReady());
                                                  System.out.println("Remainin Stocks are :- ");
                                                  System.out.println("Milk :- " + Coffe.milk + "\nWater :- "
                                                                      + Coffe.water + "\nCoffe Beans :-"
                                                                      + Coffe.coffee_beans);
                                                  System.out.println("Waller Balance is : " + Coffe.wallet);
                                        } else {
                                                  System.out.println("Sorry For That Stocks are not available");
                                                  break;
                                        }
                              } else if (order.equals("Cappuccino")) {
                                        if (Coffe.water >= 200 && Coffe.coffee_beans >= 12 && Coffe.milk >= 100) {
                                                  coffeeVending.Cappuccino esp = new Cappuccino();

                                                  System.out.println(esp.orderReady());
                                                  System.out.println("Remainin Stcks are :- ");
                                                  System.out.println("Milk :- " + Coffe.milk + "\nWater :- "
                                                                      + Coffe.water + "\nCoffe Beans :-"
                                                                      + Coffe.coffee_beans);
                                                  System.out.println("Waller Balance is : " + Coffe.wallet);
                                        } else {
                                                  System.out.println("Sorry For That Stocks are not available");
                                                  break;
                                        }
                              }
                    }
          }

}