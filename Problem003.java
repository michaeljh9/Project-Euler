/* =====================================================================
*
*	PROGRAM NAME :	Project Euler Problem #3
*
*	
*
*	Description:
*		This program is unlike the first two in that simply running it will
*		not simply spit out the answer. It serves as a calculator to help
*		the user come to the solution.
*
*		Problem: The prime factors of 13195 are 5, 7, 13 and 29. What is the
*		largest prime factor of the number 600851475143 ?
*
*		When you run the program, it prompts the user to enter a number. It
*		outputs whether it's prime or composite. If it's composite, it also
*		outputs the first factor it finds.
*		
*		Pass #1:
*		The user needs to input 600851475143. The program outputs 71 as a factor.
*
*		In an external calculator outside of this program, take 600851475143
*		and divide it by 71. 8462696833 is the result. At this point, you 
*		know that (71 x 8462696833) = 600851475143
*
*		Pass #2:
*		Run this program again and put in 8462696833. 839 is a factor.
*
*		By using an external calculator, you find out
*		(71 x 839 x 10086647) = 600851475143
*
*		Pass #3:
*		Run this program again putting in 10086647. 1471 is a factor.
*
*		With this number in a calculator, you learn
*		(71 x 839 x 1471 x 6857) = 600851475143
*
*		Pass #4:
*		Run this program again enter in 6857. You find out it's prime.
*
*	Functions Called :
*		primeTest(number) returns a boolean	
*
*	Parameters:
*		NONE
*
*	Created by: MJH,	
*	7/27/2015:	Initial 1.0 release (now with 100% more documentation!)
*
*
* =====================================================================
*/


import java.util.Scanner;

public class Problem003
{
	public static void main(String[] args)
	{
		
		long number;
		boolean isPrime;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What number would you like to test if it's prime?");
		number = userInput.nextLong();
		
		isPrime = primeTest(number);
		if (isPrime)
		{
			System.out.println(number + " is prime");
		}
		else
		{
			System.out.println(number + " is composite");
			System.out.println(getFactor(number) + " is a factor");
			
		}
	}

	
	/**
	The primeTest method returns a boolean after determining if the argument is prime.
	@return A true is returned if the int is prime.
	*/

	public static boolean primeTest(long number) {
		
		for (long index = 2; index < number; index++)
		{
			if (number % index == 0)
			{
				return false;
			}
		}
		return true;
	}

	/**
	The getFactor method factor returns a factor.
	@return An value in index is returned or 1 if it's prime
	*/
	// only called if it's not prime
	public static long getFactor(long number) 
	{
		for (long index = 2; index < number; index++)
// The loop starts at 2 and works its way up to find what it's divisible by.
// That value is returned to the calling method
		{
			if (number % index == 0)
			{
				return index;
			}
		}
		return 1;
	}
	

}
