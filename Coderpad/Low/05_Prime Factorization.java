package com.test.innerclass;

import java.io.*;
import java.util.*;

public class Solution
{
	/**
	   * Return an array containing prime numbers whose product is x
	   * Examples:
	   * primeFactorization( 6 ) == [2,3]
	   * primeFactorization( 5 ) == [5]
	   */
  public static ArrayList<Integer> primeFactorization(int x){
	  List<Integer> primeFactors = new ArrayList<>();
	  if (x == 1) return primeFactors;
	  while(x%2==0) {
		  x/= 2;
		  if (!primeFactors.contains(2)) {
			  primeFactors.add(2);
		  }
	  }
	  
	  for ( int i=3 ; i<=x ; i+= 2) {
		  while(x%i == 0) {
			  x/= i;
			  if(!primeFactors.contains(i)) {
				  primeFactors.add(i);
			  }
		  }
	  }
	  
	  return primeFactors;
  }

public static void main(String args[])
  {
	
	System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
	if(primeFactorization(6).equals(Arrays.asList(2,3)) 
			&& 
			primeFactorization(5).equals(Arrays.asList(5))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}
  
  }
}