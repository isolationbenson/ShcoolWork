package com.benson.drink;
  public abstract class DrinkFactory {
    public static Drink DrinkDrink(int type){
    switch (type){
      case  1 :
        return new Coco();
      case  2:
        return  new Sprite();
      case 3:
        return  new SixBoom();
        default:
    }
    return  null;

  }

  public static void main(String[] args) {
    Drink drink1=DrinkFactory.DrinkDrink(1);
    drink1.Drink();

    Drink drink2=DrinkFactory.DrinkDrink(2);
    drink2.Drink();

    Drink drink3=DrinkFactory.DrinkDrink(3);
    drink3.Drink();
  }
}
