package com.example.main;

import com.example.vahicle.Vehicle;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Vehicle> vehicles = VehicleQueue.getVehicleQueue();
        System.out.println(VehicleQueue.vehicleController(vehicles));
    }
}
