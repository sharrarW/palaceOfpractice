/**This program will tell the user the shipment cost of their package given weight and miles with a fixed shipping rate.
 * ALGORITHM:
 * 1) Ask user for the weight of package, and number of miles to ship
 * 2) Set up if/else-if for possible weights, which should convert to the fixed rates.
 * 3) Set up if/else-if for possible shipment miles, which will take our fixed rates and multiply them accordingly.
 * 4)Print statement saying how much the total cost is, including the calculation of rate(depending on weight) per 400 miles.
 */

import java.util.Scanner;
public class Shipping {
    public static void main(String[] args) {
	    double weight, miles, rate, price;
	    //Here I am just declaring the variables to be used later
		
	    rate = 0.0;
		price = 0.0;
		//I am just initializing the variables for now. These will of course change soon.
		
		Scanner in = new Scanner (System. in);
		System.out.println("Please enter the weight of the package:");
		weight = in.nextDouble();
		//This is asking the user to input the weight of the package
		
		if (weight <=2) {
			rate = 1.59;
		}
		else if (weight <=5) {
			rate = 3.10;		
		}
		else if (weight <=9) {
			rate = 4.25;
		}
		else if (weight >9) {
			rate = 5.00;
		}
		else {
			System.out.println("You didn't enter a number, did you?");
		}
		//This entire part (lines 21-35) is taking the possible weights the user may input, and converting them into our variable rate
		//which corresponds to the fixed rates we have.
		
		in.nextLine();
		
		System.out.println("Please enter the shipping distance in miles:");
		miles = in.nextDouble();
		
		if (miles <=400 ) {
			price = rate*1.0;
		}
		else if (miles <=800) {
			price = rate*2.0;
		}
		else if (miles <=1200) {
			price = rate*3.0;
		}
		//This part is taking the number of miles we get, and for every 400 miles we are basically multiplying our rate that many times. 
		System.out.println("Your shipping price will be $" +price+". This was calculated by using the base cost of $" +rate+" per 400 miles.");
}
}

/**
 * MEMORY TRACE
 * weight = The weight of the package to be entered by user.
 * miles = The # of miles for shipping to be entered by user.
 * rate = The fixed rates of shipment, that depend on the weight entered.
 * price = The total price of the shipment, factoring in the miles and the rate.
 
 * HANDCHECK
 * Sample weight entered: 7 (lbs)
 * Sample miles entered: 800 miles
 * Since 7 is >5, <9, rate is 4.25.
 * Since there are 800 miles, multiply 4.25 *2
 * Total price is $8.50!
 * When the same numbers are entered in the program, program prints "Your shipping price will be $8.5..."
 */




