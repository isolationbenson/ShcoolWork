package com.benson.study;

public class Factory {
  public  static  Vehicle makeVehicle (int type){
    if (type == 1){
      return  new Car();
    }else if(type ==2){
      return  new Truck();
    }else {
      return null;
    }
  }


}
