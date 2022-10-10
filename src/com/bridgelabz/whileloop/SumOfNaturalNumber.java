package com.bridgelabz.whileloop;

public class SumOfNaturalNumber {
	public static void main(String[] args) {

        int num = 55, sum = 0;
        int i = 1;

       while( i <= num)
        {
            // sum = sum + i;
            sum += i;
            i++;
        }
        System.out.println("Number is : "+num);
        System.out.println("Sum of number is = " + sum);
    }
}
