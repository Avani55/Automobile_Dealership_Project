import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Car[] cars = new Car[] {
      new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
      new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
      new Car(
        "Nissan",
        5000,
        2017,
        "yellow",
        new String[] { "tires", "filter" }
      ),
      new Car(
        "Honda",
        7000,
        2019,
        "orange",
        new String[] { "tires", "filter" }
      ),
      new Car(
        "Mercedes",
        12000,
        2015,
        "jet black",
        new String[] { "tires", "filter", "transmission" }
      ),
    };

    Dealership dealership = new Dealership(cars);  // here we are creating new object of dealership class and created the new car objects value references
    cars[3]= new Car(
      "hyundai",
      12000,
      2015,
      "jet black",
      new String[] { "tires", "filter", "transmission" }
    );

    System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
    System.out.println("Feel free to browse through our collection of cars.\n");
    System.out.println(dealership);
    System.out.println("Which car are you interested in? (0 – 4).\n");
    int index = scan.nextInt();
       
    dealership.sell(index);
    // sell car here...

    scan.close();
  }
}

