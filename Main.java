package Drink_hw;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        HotDrinkWithTemperature hotDrink1 = new HotDrinkWithTemperature("Tea", 25, 200, 90);
        HotDrinkWithTemperature hotDrink2 = new HotDrinkWithTemperature("Coffee", 35, 100, 80);
        HotDrinkWithTemperature hotDrink3 = new HotDrinkWithTemperature("Macachino", 50, 150, 80);
        HotDrinkWithTemperature hotDrink4 = new HotDrinkWithTemperature("Milk cofe", 250, 100, 60);
        HotDrinkWithTemperature hotDrink5 = new HotDrinkWithTemperature("Kapuchino", 200, 100, 60);
        

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        HotDrinkWithTemperature product1 = hotDrinksMachine.getProduct("Tea", 25, 200, 90);
        HotDrinkWithTemperature product2 = hotDrinksMachine.getProduct("Coffee", 35, 100, 80);
        HotDrinkWithTemperature product3 = hotDrinksMachine.getProduct("Macachino", 50, 150, 80);
        HotDrinkWithTemperature product4 = hotDrinksMachine.getProduct("Milk cofe", 250, 100, 60);
        HotDrinkWithTemperature product5 = hotDrinksMachine.getProduct("Kapuchino", 200, 100, 60);
    }
}
 