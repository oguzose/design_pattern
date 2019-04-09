package creational.factory_method.before;

import java.util.ArrayList;


public class CandyStore {

    public static void main(String[] args) {

        getCandyPackage(10, "hard_candy");

    }

    public static Candy getCandy(String type) {
        switch (type) {
            case "hard_candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public static ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
