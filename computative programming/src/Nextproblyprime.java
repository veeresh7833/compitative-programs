
//Java program to find prime number greater than a 
//given number using built in method 
import java.util.*; 
import java.math.*; 

public class Nextproblyprime {
	// Function to get nextPrimeNumber 
	static long nextPrime(long n) 
	{ 
		BigInteger b = new BigInteger(String.valueOf(n)); 
		return Long.parseLong(b.nextProbablePrime().toString()); 
	} 

	// Driver method 
	public static void main (String[] args) 
					throws java.lang.Exception 
	{ 
		for(long i=10;i<100;i++)
		{
		//long n = 17;
			long s=nextPrime(i);
			i=s;
		System.out.println(s); 
		}
	} 
} 
