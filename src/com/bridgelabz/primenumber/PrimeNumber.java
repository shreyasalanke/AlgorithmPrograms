package com.bridgelabz.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String[] args)
	   {		
		System.out.println("\nPalindrome Numbers 1 to 1000 ");  
		  for (int i = 1; i <= 1000; i++) {  
		   if (Palindrome(i) == true) {  
		    System.out.print(i + " ");  
		   }  
		  }  
		  System.out.println("\nPrime Numbers 1 to 1000 ");  
		  for (int i = 1; i <= 1000; i++) {  
		   if (Prime(i) == true) {  
		    System.out.print(i + " ");  
		   }  
		  }  
		 }   
	 public static boolean Palindrome(int num) {  
		  int num1 = num;  
		  int rem;  
		  int result = 0;  
		  while (num > 0) {  
		   rem = num % 10;  
		   num = num / 10;  
		   result = (result + rem) * 10;  
		  }  
		  result /= 10;  
		  if (result == num1) {  
		   return true;  
		  } else {  
		   return false;  
		  }  
		 }  
		 public static boolean Prime(int num) {  
		  if (num < 2) {  
		   return false;  
		  }  
		  int div = num / 2;  
		  for (int i = 2; i <= div; i++) {  
		   if (num % i == 0) {  
		    return false;  
		   }  
		  }  
		  return true;  
		 }  
		} 