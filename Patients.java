import java.util.Scanner;
public class Patients {
 // This program will calculate the dosage of a certain medication for a patient using their weight.
 public static void main(String[] args) {
 
 @SuppressWarnings("resource")
 Scanner input = new Scanner(System. in);
 
 /** Algorithm to get dosage:
  * First, get the formula to convert the patient's weight from lbs to kg. The standard conversion is 1lb = 0.453592kg.
  * Next, declare the variable weight for the patient. This weight should be the weight the user enters.
  * Set another variable for the weight to equal its equivalent in kg (using the formula of weight * 0.453592).
  * Then, set 50mg of dosage for every kg of the patients weight. (Weight in kg * 50).
  * Finally print the statement saying the dosage for the patient based on their weight.
  */
 
 double weightlb, weightkg, dosage;
 //Here we are just declaring our 3 variables that we'll use later.
 
 System.out.print("Enter the patient's weight(in pounds):");
 weightlb= input.nextDouble(); 
 //The 2 lines above prompt the user to input the patient's weight in pounds, so we can then do the following.
 
 weightkg = weightlb * 0.453592;
 //This is a conversion from our variable weightlb(weight in pounds) to weightkg (weight in kg), by * it by 0.453592.
 
 dosage = weightkg * 50;
 //Our final variable, dosage, converts our NEW weight (created from the line before) into the recommended dosage by * it by 50.
 
 System.out.println("This patient's recommended dosage for this medicine is " + dosage + "mg!");
 //This prints the statement 'The patient's dosage is...' and our variable dosage which is made up of an input and 2 calculations.
}
}

/**
 * MEMORY TRACE
 * weightlb = The weight in pounds the user inputs
 * weightkg = The weight the user inputed converted to kg
 * dosage = The dosage based on the new weight (in kg) multiplied by 50

 * HANDCHECK
 * Sample weight inputed (after being prompted) - 150lbs
 * 150 * 0.453592 = 68.039kg
 * 68.039kg * 50 = 3,401.95
 * When input is 150, program prints "recommended dosage is 3401.95"
 */


