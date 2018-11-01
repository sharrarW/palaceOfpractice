import java.io.*;
import java.util.Scanner;

public class Hw8 {
	/**
	 * This comprehensive program will take data from a file and do multiple things with it
	 * After reading contact information (names and #s) into parallel arrays
	 * Then in one method it will take the array information and sort names and corresponding #s
	 * In another method the program will print every area code from the phone #s
	 * Finally it will allow the user to search a name, and give back the name and number-
	 * if the person exists in the list of contacts.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//In main, we will bring our file contacts in, then declare our 2 arrays
		//From there we'll call our 4 different methods.
		
		File filename= new File("Contacts.txt");
		Scanner infile = new Scanner(filename);
		
		int SIZE = 10;
		String[] names= new String [SIZE];
		String[] nums = new String [SIZE];
		
		fillArrays(infile, names,nums);
		sortContacts(names, nums);
		printArea(nums);
		findContact(names, nums);
	}
	
	public static void fillArrays (Scanner infile, String[] names, String[] nums) {
		//This method will simply read our 2 lines of data into 
		for (int i=0; i<names.length; i++) {
			names[i] = infile.nextLine();
			nums[i] = infile.nextLine();
		}

				}
	public static void sortContacts(String[] names, String[] nums) {
		//In this method we will sort our arrays using the selection sort
		for (int i=0; i<names.length-1; i++) {
			for (int j=i+1; j<names.length; j++) {
			    if (names[i].compareTo(names[j]) > 0) {
			       String temp=names[j]; 
			       names[j]=names[i]; 
			       names[i]=temp;
			       //Swapping the names
			       String temp2 = nums[j];
			       nums[j] = nums[i];
			       nums[i]= temp2;
			       //This 2nd part swaps the numbers
			    }
			}
		}
	}
	
	public static void printArea(String[] nums) {
		//This method will print out every area code of every phone number
		System.out.println("AREA CODES ARE: ");
		for (int i = 0; i<nums.length; i++) {
			System.out.println(nums[i].substring(1,4));
			//Substring 0-4 to include the parentheses
		}
	}
	public static void findContact(String[] names, String[] nums) {
		//This method will be used to let the user search the contacts 
		//for a specific contact.
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Whats the name you are searching for?");
		String name = sc.next();
		for (int i=0; i<names.length;i++) {
			if (names[i].equals(name)) {
				System.out.println(names[i] + " " + nums[i]);
				//This prints back the name of the person being searched
				//With that person's phone number.
				break;
		}
			
		}
		
	}
}
/**
 * MEMORY TRACE
 * names, array of names taken from the Contacts file
 * nums, the corresponding phone numbers put in a seperate array
 * SIZE, int representing the size of the array, also size of the file
 * temp/temp2, temporary place holders for swapping the nums and names.
 * 
 * HANDCHECK
 * CONTACTS
 * Joe Stein 917 598 9980
 * Sir Benjamin 516 890 8876
 * Mistar Goofy 347 871 1232
 * 
 * (Lexicographically) J comes before S
 * M before S
 *  
 * NEW ORDER:
 * Joe Stein 917 598 9980
 * Mistar Goofy 347 871 123
 * Sir Benjamin 516 890 8876
 * 
 * AREA CODES (first 3 digits of phone #'s)
 * 917
 * 347
 * 516
 * 
 * WHAT TO SEARCH?
 * Search: Mistar
 * Mistar Goofy 347 871 123
 */

