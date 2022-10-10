package com.bridgelabz.forloop;

public class ReverseNumber {
	public static void main(String[] args) {
	    int num = 4545, reversed = 0;
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    for(int i = 0; i <= num; i++) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
}
