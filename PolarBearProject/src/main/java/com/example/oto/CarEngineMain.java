package com.example.oto;

import java.util.Scanner;

public class CarEngineMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CRUDEngineCarImp crud = new CRUDEngineCarImp();

        boolean flag = true;

        while (flag) {
            System.out.println("\n===== CAR ENGINE MENU =====");
            System.out.println("1. Save Car");
            System.out.println("2. F1ind Car");
            System.out.println("3. Update Car Brand");
            System.out.println("4. Update Engine CC");
            System.out.println("5. Delete Car");
            System.out.println("6. Find All Cars");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Engine engine = new Engine();
                    Car car = new Car();

                    System.out.print("Enter Car ID: ");
                    car.setId(sc.nextLong());

                    System.out.print("Enter Car Brand: ");
                    car.setBrand(sc.next());

                    System.out.print("Enter Engine ID: ");
                    engine.setId(sc.nextLong());

                    System.out.print("Enter Engine CC: ");
                    engine.setCc(sc.nextFloat());

                    car.setEngine(engine);

                    crud.saveCar(car);
                    System.out.println("Car Saved Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Car ID to Find: ");
                    long findId = sc.nextLong();
                    crud.findCar(findId);
                    break;

                case 3:
                    System.out.print("Enter Car ID to Update Brand: ");
                    long updateId = sc.nextLong();
                    System.out.print("Enter New Brand: ");
                    String brand = sc.next();
                    crud.updateCarBrand(updateId, brand);
                    System.out.println("Car Brand Updated!");
                    break;

                case 4:
                    System.out.print("Enter Car ID to Update Engine CC: ");
                    long carId = sc.nextLong();
                    System.out.print("Enter New CC: ");
                    float cc = sc.nextFloat();
                    crud.updateEngineCC(carId, cc);
                    System.out.println("Engine CC Updated!");
                    break;

                case 5:
                    System.out.print("Enter Car ID to Delete: ");
                    long deleteId = sc.nextLong();
                    crud.deleteCar(deleteId);
                    System.out.println("Car Deleted Successfully!");
                    break;

                case 6:
                    crud.findAll();
                    break;

                case 7:
                    flag = false;
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
