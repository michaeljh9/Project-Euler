/* =====================================================================
*
*	PROGRAM NAME :	Project Euler Problem #2
*
*	
*
*	Description:
*		After running this code, the solution to the program will appear
*		in the console output at the last entry.
*
*		Problem: Each new term in the Fibonacci sequence is generated by adding
*		the previous two terms. By starting with 1 and 2, the first 10 terms will be:
*			1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
*		By considering the terms in the Fibonacci sequence whose values do not
*		exceed four million, find the sum of the even-valued terms.
*
*	This program first creates a text file named Problem002_fibonacci.txt
*	containing the fibonacci numbers up to 5702887. This is done in the first
*	while loop. The text file is done being written to at System.out.println
*	command saying it was written successfully.
*	The second while loop reads each line and adds it up to the sum accumulator
*	if it's even. The System.out.prinln call is used for making sure the correct
*	terms were added to the accumulator with the final answer being the very last
*	entry 
*		
*
*	Functions Called :
*		NONE	
*
*	Parameters:
*		NONE
*
*	Created by: MJH,	
*	7/22/2015:	Initial 1.0 release
*	7/27/2015: 	Added documentation
*
* =====================================================================
*/


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Problem002 {

	public static void main(String[] args) throws IOException
	{
		int number = 1, previousNumber = 0, previousPreviousNumber = 0; // for the fibonacci algorithm
		String filename = "Problem002_fibonacci.txt";
		PrintWriter outputfile = new PrintWriter(filename);
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		double sum = 0;
		int entry = 1;
		
// First write the methods that put the fibonacci numbers in a text file
// NOTE: this following algorithm prints the first number bigger than 4M. However
// it doesn't matter that it does this because it's odd. anyway
		
		while (number < 4000000)
		{
			previousPreviousNumber = previousNumber;
			previousNumber = number;
			number = previousPreviousNumber + previousNumber;

			outputfile.println("\n" + number);
			
		}
		System.out.println("File written successfully.");
		outputfile.close();
		
// Now read the file and add them up if they're even
		while (entry < 4000000)
		{
			entry = inputFile.nextInt();
			if (entry % 2 == 0)
			{
				sum += entry;
			}
			System.out.println(entry + " " + sum);
		}
		
		
	}
}