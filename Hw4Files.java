import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
// These are all the imports we need to successfully save file inputs/outputs.
/**
 * In this program, we will read in data from a file, calculate monthly payments given its text and save it on another file.
 * First we have to get ready all of the elements needed to read a file, and set up our way of saving all the console output elsewhere.
 * Then, we create variables based off what the user has given us, and use them in our loop to make our calculations.
 * Finally we print all our of statments with the calculations out, which get saved to our output file.
 */

  public class Hw4Files {
	  public static void main(String[] args) throws IOException {
    	// First, we create a File object to represent our input file
		  
        File myfile = new File("fileTest.txt");
        //Then, get a scanner object, and connect it to a File object.
        
        PrintStream out = new PrintStream(new FileOutputStream("HW4-Data.txt"));
        System.setOut(out);
        //This code allows us to save our following output into a new text file called HW4-Data.
        
        Scanner infile = new Scanner(myfile);
        double rate, pmt, equation, interestPmt, totalInterest=0;
        int loan, months;
        // These variables correspond to the data in our text file.
        
        //Now we begin our loop, which will read all each set of numbers in the text file and calculate monthly payments accordingly.
        for (int i=1; i<6; i++) {
          rate = infile.nextDouble();
          loan = infile.nextInt();
          months = infile.nextInt();
          //Initialzing these to read from the file.
          
          //This section is the calculation of the given numbers, based on the fixed monthly payment forumla. 
          
          rate=rate/100;
          // This is to turn the percentage into the appropriate decimal value.
          equation = Math.pow(1+rate, months);
          //This is the part of the equation that repeats-((1+r)^2). I put this in a variable to make it easier for myself.
          pmt = ((rate*equation)/(equation-1))*loan;
          //Whole equation put together
          interestPmt = (pmt*months) - loan;
          //The interest only calcultion.
          totalInterest+=interestPmt;
          // This is so we can sum up all the interest-only calculations for later.
          
          System.out.printf("Your monthly payment is $%.2f for " + months + " months.\n", pmt);
          System.out.printf("Your total interest payment is $%.2f\n", interestPmt);  
        }// Fell out of the 'for' loop.
        
        infile.close(); //We must close our input file.
        System.out.printf("The total interest of all loans is $%.2f\n", totalInterest);
    }
  }
  
  /**MEMORY TRACE
   * rate = File data = Interest rate
   * loan = File data = Principle amount being taken
   * months = File data = # of months for the loan.
   * equation = One part of the big formula for monthly payments
   * pmt = The fixed monthly payments
   * interestPmt = The amount payed in interest.
   * totalInterest = Sum of amounts payed only in interst for all loans.
   * 
   * HANDCHECK
   * Using the formula and a calculator for the first set of numbers {3.34 10,000 6}, I got 1866.33, which corresponds to what my program got too.
   */
  

