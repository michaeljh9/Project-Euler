/* =====================================================================
*
*	PROGRAM NAME :	Project Euler Problem #1
*
*	
*
*	Description:
*		After running this code, the solution to the program will appear
*		in the console output.
*
*		Problem: If we list all the natural numbers below 10 that are
*		multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
*		multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*
*	This program makes three arrays. The first two are named multiplesOf3 
*	and multiplesOf5 and these store the multiples of 3 and 5 leading up to 1000.
*	If you were to add up all the elements of these two arrays, the problem
*	you encounter is that there will be some duplicates. 15 is an example of a 
*	number that will appear in both arrays. Therefore, a third array is created
*	to be added all up and subtracted from this total to compensate. 
*		
*
*	Functions Called :
*		NONE	
*
*	Parameters:
*		NONE
*
*	Created by: MJH,	
*	7/20/2015:	Initial 1.0 release
*	7/27/2015: 	Added documentation
*
* =====================================================================
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Problem001 {
	public static void main(String[] args) {
		int[] multiplesOf3 = new int[335];
		int[] multiplesOf5 = new int[205];
		int[] multiplesOf15 = new int[66];
		
		int sum1 = 0, sum2 = 0, sum3 = 0, upperLimit;
		
		
		
		
		for (int index = 0; index < 333; index++)
		{
			multiplesOf3[index] = 3 * (index + 1);
			// The following line is used for debugging to make sure the array is properly created. Comment it when finished
//			System.out.println(multiplesOf3[index]);
		}
		
		for (int index = 0; index < 199; index++)
		{
			multiplesOf5[index] = 5 * (index + 1);
			// The following line is used for debugging to make sure the array is properly created. Comment it when finished
//			System.out.println(multiplesOf5[index]);
			
		}
		
		for (int index = 0; index < 66; index++)
		{
			multiplesOf15[index] = 15 * (index + 1);
//			The following line is used for debugging to make sure the array is properly created.
//			Comment out when it's working correctly
//			System.out.println(multiplesOf15[index]);
		}
		/**If the elements of multiplesOf5 and multiplesOf3 are added up, they include the duplicate entries as a result of
		being multiples of 15. We add up the elements the multiplesOf15 and subtract that sum  from the sum of multiplesOf3
		and multiplesOf5
		
		*/	
		for (int index = 0; index < 333; index++)
		{
			sum1 += multiplesOf3[index];
			
		}
		
		for (int index = 0; index < 199; index++)
		{
			sum2 += multiplesOf5[index];
		}
		
		for (int index = 0; index < 66; index++)
		{
			sum3 += multiplesOf15[index];
		}
		
		System.out.println("The sum is " + (sum1 + sum2 - sum3));

	}

}
