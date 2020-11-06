package com.benson.study;

public class Enter {
  public static void main(String[] args) {
    Vehicle vehicle=Factory.makeVehicle(1);
    vehicle.move();
    Vehicle vehicle2=Factory.makeVehicle(2);
    vehicle2.move();
  }
}
