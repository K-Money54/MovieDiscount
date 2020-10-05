/*
 * Programmer: Kayden Dunlop
 * Date: September 25, 2020
 * Purpose: to print the cost of an item
 */
		
import java.util.Scanner;
		
public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);
                  
        double cost = 14.5;
        
        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();
        
        if(age < 13 || age >= 65) {
        	cost = cost - 3;
        	
        } 
        
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();
        
        if (hasCoupon) {
        	cost = cost - 2;
        }
              
        // Print the cost of a movie ticket
        System.out.println("Your ticket costs $" + cost + ".");
    }
}
