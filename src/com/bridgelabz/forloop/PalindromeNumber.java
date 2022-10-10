package com.bridgelabz.forloop;

public class PalindromeNumber {
	public static void main(String[] args) {
	    int num = 3553, reversedNum = 0, remainder;
	   // System.out.println("Original Number: " + num);
	    int originalNum = num;

	    // run loop until num becomes 0
	    for(int i = 0; i <= num; i++) {
	    
	      // get last digit from num
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;

	      // remove the last digit from num
	      num /= 10;
	    }
	    if(originalNum == reversedNum) {
	    	System.out.println(originalNum + " is palindrome number");
	    }
	    else {
	    	System.out.println(originalNum + " is not palindrome number");
	    }

	  }
}
