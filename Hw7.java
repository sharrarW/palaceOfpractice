import java.util.Scanner;
public class Hw7 {
	/*
	 * In this class, I will be building a program that accomplishes multiple things.
	 * This program will read in a DNA strand (sequence of letters)
	 * Then it will convert them into an RNA strand (using if/else statements)
	 * It will find the 'start' and 'end' codons (by searching the strings)
	 * Then will print every subsuquent codon (3 letters) in between the first 2 codons.
	*/
	
    public static void main (String[] args) {
    	String dnaStrand;
    	System.out.println("Enter the DNA strand: ");
    	Scanner sc = new Scanner (System.in);
    	dnaStrand = sc.next();
    	//Standard main setup, and reading in the DNA strand
    	translate(transcribe(dnaStrand));
    	//Calling method "translate", and passing it what is returned from "transcribe" method
  
}
    public static String transcribe(String dnaStrand) {
    	//This method will take the DNA strand we got, and change it to an RNA strand
    	
    	String rnaStrand=dnaStrand;
    	//Setting rnaStrand to dnaStrand.
    	//Because we can't change the string contents, we'll add the letters to it
    	for (int i=0; i<dnaStrand.length();i++) {
    		if (dnaStrand.charAt(i)=='A' || dnaStrand.charAt(i)=='a') {
    			rnaStrand+='U';
    		}
    		else if (dnaStrand.charAt(i)=='C' || dnaStrand.charAt(i)=='c') {
    			rnaStrand+='G';
    		}
    		else if (dnaStrand.charAt(i)=='G' || dnaStrand.charAt(i)=='g') {
    			rnaStrand+='C';
    		}
    		else if (dnaStrand.charAt(i)=='T' || dnaStrand.charAt(i)=='t') {
    			rnaStrand+='A';
    		}
    	}
    	//In this for loop, we change the letter depending on what the element is
    	String mRNAstrand=rnaStrand.substring(dnaStrand.length(), rnaStrand.length());
    	//Because we added the letters to rnaStrand, we take only the RNA part by taking its substring
    	//And set its substring to a new variable, because finding the substring every time would be tiring
    	return mRNAstrand;
    	
    }
    public static void translate(String mRNAstrand) {
    	/*This method will take our new RNA strand and find its codons
    	We'll have the first and last codon (1st/last block of 3 letters)
    	And we'll have all the codon(s) (blocks of 3) between them if possible
    	*/
    	
    	System.out.println(mRNAstrand);
    	String startCodon=mRNAstrand.substring(0,3);
    	//Finding start codon (taking char 0-3)
    	
    	String stopCodon=mRNAstrand.substring(mRNAstrand.length()-3,mRNAstrand.length());
    	//Finding end codon (taking from # of char-3 to last char)
    	
    	String rangeString=mRNAstrand.substring(3, mRNAstrand.length()-3);
    	//Getting the string between start codon and end codon.
    	
    	int rangeLength=rangeString.length();
    	//System.out.println(rangeLength);
    	
    	/*This if statement checks if the middle length is divisible by 3, and if so;
    	 * It uses a for loop to section off each block of 3 characters
    	 * Then prints each block labeled accordingly.
    	 */
		int count=0, j=0; 
    	if (rangeLength%3==0) {
    		for (int i=0; i<rangeLength;i+=3) { 
    			j+=3;
    			String codon = rangeString.substring(i, j);
    			count++;
    			System.out.println("Codon #" + count + " is " + codon);
    		}
    	    //Out of for loop.	
    	}
    	//Out of if statement.
    	else {
    		System.out.print("ERROR: Please enter a strand whose length can be evenly divided by 3");
    	}
    	//Else statement to get a new strand divisible by 3.
    }
}
/**
 * MEMORY TRACE
 * dnaStrand = user input, the String representing DNA strand
 * rnaStrand = dnaStrand, the String used when transcribing DNA strand. Adds letters to dnaStrand
 * mRNAstrand = RNA part of rnaStrand, gets rid of the DNA strand from rnaStrand.
 * startCodon = First 3 letters of RNA strand, represents first codon in strand
 * stopCodon = Last 3 letters of RNA strand, represents last codon in strand.
 * rangeString = Letters between start and endCodon, String
 * rangeLength = length of rangeString, Int used to check if divisible by 3
 * count = a counter to label each codon.
 * 
 * HANDCHECK
 * "Enter DNA Strand:
 * AGCTATATACGA
 * A=U, G=C, C=G, T=A
 * UCGAUAUAUGCU
 * Start codon is UCG
 * Stop is GCU
 * In between lies AUAUAU, 6 characters which is divisible by 3
 * Codon 1 is AUA, Codon 2 is UAU
 * 
 * 
 * 
 * 
 */
