import java.util.Scanner;
public class Hw6 {
	/**This program will accept a number of loans, and do various things with the use of multiple methods.
	 * The loans will be put into arrays
	 * The arrays allow us to then manipulate them 
	 */
	
	public static void main(String[] args) {
	//We'll use main to declare everything from our important variables to calling all methods
		
        System.out.println("Enter # of loans: ");
        //Reading in number of loans, to establish how large the array will be.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1=new int [n];
        int[] array2= new int [n];
        double[] array3=new double [n];
        //This array3 will be used for the findWorst/findBest methods.
        
        readLoansInfo(array1,array2);
        sumLoans(array1, array2);
        findWorst(array1, array2, array3);
        findBest(array3);
        printArrays(array1, array2);
        //These are all the methods we are calling.
	}
	
	public static void readLoansInfo(int[] array1, int[] array2) {
		//This method will read in the loan information (2 values per line) and put each value into a seperate array for later.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter loan data: ");
		for (int i=0; i<array1.length; i++) {
			int loan1,loan2;
	        loan1=sc.nextInt();
	        loan2=sc.nextInt();	
	        array1[i]=loan1;
	        array2[i]=loan2;}
		//This for loop is used to put in the data into the corresponding array. As 'i' goes up (by 1) the array index does too.
	}
	
	public static void sumLoans(int[] array1, int[] array2) {
		//Part 1 of this method will sum up the total amount of loans
		//Part 2 will sum up the total amount returned, and subtract from our previous sum.
		
		int sum=0, sum2=0;
		for (int i=0; i<array1.length; i++) {
			sum += array1[i];
		}
		//This for loop keeps adding each value to 'sum'
		System.out.println("The bank payed a total of $"+sum);
		for (int i=0; i<array2.length; i++) {
			sum2 +=array2[i];
		}
		//This for loop does the same for our second sum
		System.out.println("The bank was not returned $"+(sum-sum2));
		//Prints the part 2 of this method (sum-sum2)
	}
	
	public static void findWorst(int[] array1, int[]array2, double[] array3) {
		//This method will calculate the percentage of $ returned from the loan
		//Then this method finds the worst percentage of them all
		
		double loanPct=0.0;
		for (int i=0; i<array1.length; i++) {
			loanPct=((float)array2[i]*100)/array1[i];
			array3[i]=loanPct;
		}
		//The for loop is used to place each percentage into our unused array3
		//The calculation to find percentage is essentially (num2*100)/num1
		double min=array3[0];
		int worstIndex=0;
		for (int i=0; i<array3.length; i++) {
			if (min > array3[i]) {
				worstIndex = i;
			}
		}
		//This for loop is used to find the index of smallest %. Done so by comparing indexes side by side.
		System.out.println("Index of Worst = " + worstIndex);
	}
	
	public static void findBest(double[] array3) {
		//This method does the same job as our previous method, but instead finds the best percentage.
		
		double min=array3[0];
		int bestIndex=0;
		for (int i=0; i<array3.length; i++) {
			if (min < array3[i]) {
				bestIndex = i;
			}
		}
		//Same loop as findWorst method, but looking for index of highest % here.
		System.out.println("Index of Best = " + bestIndex);
	}
	
	  public static void printArrays(int[] array1, int[] array2){
		  //Finally, this last method prints the list of loan amounts and the amount returned
		  
		  System.out.println("Loan Amounts         Amounts returned");
		  for (int i=0; i<array2.length; i++) {
		    System.out.printf("%2d  %18d \n", array1[i], array2[i]);
		  }
		  }
		}

/** MEMORY TRACE
 * n = user input, # of loans
 * loan1 = user input, amount loaned (1st value)
 * loan2 = user input, amount returned (2nd value)
 * array1 = [n], array to hold the first loan values
 * array2 = [n], array to hold the second loan values
 * array3 = [n], array to hold percentages for Worst/Best methods
 * sum = sum of array1 elements, used for sumLoans
 * sum2 = sum of array2 elements, also used for sumLoans
 * loanPct = (num2*100/num1), loan percent, used for putting each value in array3
 * 
 * HAND CHECK
 * 2 loans entered
 * loan data = 500,100
 * 2nd loan data = 150, 50
 * Bank payed a total of (500+150) 650
 * Bank wasn't returned (650-(100+50)) 500
 * Percentages = 100*100/500 = %20...50*100/150 = %33.33
 * MIN % = 20
 * MAX % = 33.33
 * Loan amounts = 500, 150
 * Amounts returned = 100, 50
 * 
 */
	
	
