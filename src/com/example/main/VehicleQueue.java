package com.example.main;

import com.example.vahicle.Vehicle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VehicleQueue {

    public static Queue<Vehicle> vehicleController(Queue<Vehicle> vehicles) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wciśnij 1, jeśli chcesz dodać informacje o pojeździe." +
                "\nWciśnij 2, jeśli chcesz poddać kontroli pojazd." +
                "\nJesli chcesz zakończyć, naciśnij 0.");
        String number = input.nextLine();

        if ("1".equals(number)) {
            System.out.println("Wprowadź dane pojazdu:");
            System.out.println("Typ:");
            String type = input.nextLine();
            System.out.println("Marka:");
            String brand = input.nextLine();
            System.out.println("Model:");
            String model = input.nextLine();
            System.out.println("Rok produkcji:");
            int year = input.nextInt();
            input.nextLine();
            System.out.println("Przebieg:");
            long mileage = input.nextLong();
            input.nextLine();
            System.out.println("Nr VIN:");
            String VINnumber = input.nextLine();
            vehicles.offer(new Vehicle(type, brand, model, year, mileage, VINnumber));
        } else if ("2".equals(number)) {
            vehicles.poll();
        } else if ("0".equals(number)) {
            input.close();
        }
        return vehicles;
    }

    public static Queue<Vehicle> getVehicleQueue() {
        Queue<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle1 = new Vehicle("samochód osobowy", "BMW", "X4", 2018, 200000, "VBT256233");
        Vehicle vehicle2 = new Vehicle("motocykl", "Honda", "CB1100 EX", 2015, 350000, "VTR56232656");
        Vehicle vehicle3 = new Vehicle("samochód ciężarowy", "MAN", "TGX D38", 2017, 750000, "VCR121212");
        Vehicle vehicle4 = new Vehicle("samochód osobowy", "Audi", "RS8", 2018, 400000, "VCW212121");
        vehicles.offer(vehicle1);
        vehicles.offer(vehicle2);
        vehicles.offer(vehicle3);
        vehicles.offer(vehicle4);

        return vehicles;
    }
}
