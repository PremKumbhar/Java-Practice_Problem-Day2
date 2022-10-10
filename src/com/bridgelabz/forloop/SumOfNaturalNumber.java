package com.bridgelabz.forloop;

public class SumOfNaturalNumber {
	public static void main(String[] args) {

        int num = 55, sum = 0;

       for(int i = 0; i <= num; i++)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Number is : "+num);
        System.out.println("Sum of number is = " + sum);
    }
}
