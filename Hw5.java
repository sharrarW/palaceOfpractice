import java.util.Scanner;
public class Hw5 {
	/**
	 * This class uses multiple methods to welcome user, accept the grades for a number of students, and averages the grades then gives its appropriate letter.
	 * First we have to make another method for the welcome message, and call it in 'main'.
	 * Next in main, make a loop for any # of students to enter their 5 grades.
	 * Then we have to make a method to accept the 5 grades, average them and print the average.
	 * Make a new method to take average and give it an appropriate letter grade.
	 */
public static void main (String args[]) {
	welcome();
	//This takes us to our welcome method which displays a welcome method.
	System.out.println("How many students are to be processed?");
	
	Scanner sc = new Scanner(System.in); 
	int i, num = sc.nextInt();
	//Asking the user to input the # of students and initializing i for the loop.
	
	for (i=1; i<=num; i++) {
		System.out.println("Enter 5 grades for student #" + i + ": ");
		double grade1,grade2,grade3,grade4,grade5;
		grade1 = sc.nextDouble();
		grade2 = sc.nextDouble();
		grade3 = sc.nextDouble();
		grade4 = sc.nextDouble();
		grade5 = sc.nextDouble();
		average(grade1, grade2, grade3, grade4, grade5);
	}	
	//This asks for the 5 grades, then passes it to the average method.
}
public static void welcome() {
	System.out.println("Welcome to the grade world, where your grades get averaged!");
}
//The method that displays our welcome message to the user.

public static void average(double grade1, double grade2, double grade3, double grade4, double grade5) {
	double avg;
	avg = (grade1+ grade2+ grade3+ grade4+ grade5)/5;
	System.out.printf("This student's average is %.2f \n", avg);
	letterGrade(avg);
}
//This method averages the given grades, then  prints that average. Also passes average to next method.

public static void letterGrade(double avg ) {
	char letter;
	if (avg>=90) {
		letter = 'A';
	}
	else if (avg >= 80) {
		letter = 'B';
	}
	else if (avg >=70) {
		letter = 'C';
	}
	else if (avg >=60) {
		letter = 'D';
	}
	else {
		letter = 'F';
	}
	System.out.println("The letter grade is: " + letter + "\n");	
}
//This method takes the average from the previous method, and prints its corresponding letter grade.
}

/** MEMORY CHECK
 * num = User inputs number of students to process
 * i = Starts at 1. Counter for our 'for' loop. 
 * grade 1,2,3,4,5 = User inputs their 5 grades.
 * avg = the average of the 5 grades entered.
 * letter = our only character variable. Letters A-F assigned based on given average.
 * 
 * HANDTRACE
 * Enter : 1 student to process.
 * Grades: 90, 85, 97, 75, 65.
 * 90+85+97+75+65 = 412
 * 412/5 = 82.4
 * AVERAGE IS 82.4
 * 82.4 < 90 ... 82.4 > 80 = Letter grade is B
 */
