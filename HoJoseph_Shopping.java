/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 */
package hojoseph_shopping;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Joseph
 */
public class HoJoseph_Shopping {

    public static void main(String[] args) {
                
        Scanner cin = new Scanner(System.in);
        ArrayList<Double> costs = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        
        
        //Creating constant values for the prices of each item
        final double usbCost = 19.99;
        final double keyboardCost = 49.99;
        final double mouseCost = 25.99;
        
        
        //Appending the prices of the item to an Array list
        costs.add(usbCost);
        costs.add(keyboardCost);
        costs.add(mouseCost);
        
        
        //Asks the user for number of each item they would like to purchase and appends it to a list
        System.out.println("\nHow many USB devices would you like to order?");
        int USB = cin.nextInt();
        num.add(USB);
        System.out.println("\nHow many keyboards would you like to order?");
        int keyboard = cin.nextInt();
        num.add(keyboard);
        System.out.println("\nHow many computer mouse would you like to order?");
        int mouse = cin.nextInt();
        num.add(mouse);
        
        //Creates two new variables 
        double subTotal = 0;
        final double tax = 0.13;
        
        /*For loop the two array list I've created
        / Mutiples the number of items with the price of the item 
        / Finally add the total price of the item to the subTotal. 
        */
        for (int i = 0; i < num.size(); i++)
            subTotal += costs.get(i)*num.get(i);
        
        //Create new variable that is the equal to the subTotal after tax.
        double total = subTotal + (subTotal*tax);
        System.out.print("The total comes to $" + total);
        
        
            
            
        
  
    }
    
}
