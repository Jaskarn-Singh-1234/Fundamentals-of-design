package midtermreview;

import java.util.Scanner;

/**
 * A class that models vending machine items. Items have a name and a price. The possible items are listed in the array.
 * Use this code to answer questions B.1 and B.2 in the midterm review.
 *
 * @author dancye, 2019
 * @author Paul Bonenfant, Feb 2022
 * @author Megha Patel, Feb 2022
 */
public class VendingMachineItem {

    public double price;
    public static String[] items = {"Chocolate Bar", "Sour Candy", "Potato Chips", "Pretzels","Coke"};

    public VendingMachineItem() {
        //intentionally left blank
    }

    /**
     * A getter method to return the item's price
     *
     * @return the cost of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * A setter for the price, allowing us to change the price of an item
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * A method to ask the user to select am item from the vending machine.
     *
     * @param args - not used
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the vending machine, here is a list of the possible items");

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("To re-fill the vending machine, please follow instructions in program 2");
        //there is no program 2 because we haven't created an appropriate design for this code yet!
    }

}
