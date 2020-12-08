package com.coder.pad;

import java.text.DecimalFormat;
public class SquareRoot 
{
	/* Problem Name is &&& Square Root &&& PLEASE DO NOT REMOVE THIS LINE. */
	/*
	 * Instructions to Candidate
	 * This is **NOT** a math problem. You are required to code up a simple mathematical technique to find the square root of a number.
	 * The Newton-Raphson method can be used to find the square root of a number N as follows
	 ** Make an initial guess
	 ** Update the guess using the below formula
	 ** New Estimate = Current Estimate - ( F(Current Estimate) / F'(Current Estimate) ), where
	     F(Current Estimate) = Current Estimate * Current Estimate - N
	     F'(Current Estimate) = 2*Current Estimate
	 ** Repeat till you are close enough
	 * Run this code in the REPL to observe its behaviour. The
	   execution entry point is main().
	 * Consider adding some additional tests in doTestsPass()
	 */
	/*
	 *   double squareRoot( double x )
	 *   returns square root of the given double
	 *
	 */
	public static double squareRoot(double x)
	{
		double ce=1;
		double temp=0;

		if(x==0)
			return 0;
		DecimalFormat dc = new DecimalFormat("#0.00000");

		while(!dc.format(temp).equals(dc.format(x))){
			ce = ce - (derivative(ce,x)/firstderivative(ce));
			temp = ce * ce;
		}
		return ce;
	}

	public static double derivative( double ce,double N )
	{

		return (ce*ce)-N;
	}

	public static double firstderivative( double ce )
	{

		return 2*ce;
	}

	/*
	 * boolean doTestsPass()
	 * Returns true if tests pass, false otherwise
	 */
	public static boolean doTestsPass()
	{
		double[] inputs = {2, 4, 100};
		double[] expected_values = { 1.41421, 2, 10 };
		double threshold = 0.001;

		for(int i=0; i < 3; i++)
		{
			if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
			{
				System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
				return false;
			}
		}
		System.out.println( "All tests passed");
		return true;
	}

	public static void main( String args[])
	{
		doTestsPass();
	}
}
