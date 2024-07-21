import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        List<Vehicle> rentedVehicles=new ArrayList<>();
        System.out.println("~~~ Vehicle Rental System ~~~");
        int choice;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = input.next();
                    System.out.print("Enter Rental Days: ");
                    int rentalDays = input.nextInt();
                    Vehicle car = new Car(carModel, rentalDays);
                    rentedVehicles.add(car);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    car.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = input.next();
                    System.out.print("Enter Rental Hours: ");
                    int rentalHours = input.nextInt();
                    Vehicle bike = new Bike(bikeBrand, rentalHours);
                    rentedVehicles.add(bike);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    bike.displayDetails();
                    break;

                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = input.next();
                    System.out.print("Enter Rental Weeks: ");
                    int rentalWeeks = input.nextInt();
                    Vehicle truck = new Truck(truckType, rentalWeeks);
                    rentedVehicles.add(truck);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    truck.displayDetails();
                    break;

                case 4:
                    System.out.println("---Rented Vehicles---");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println("---------------------------");
                    }
                    break;
            }
        } while (choice != 5);

        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}