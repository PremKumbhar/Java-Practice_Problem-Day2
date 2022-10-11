package com.bridgelabz.operatorprogram;

import java.util.Scanner;

public class ArithmaticOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		
		int A1 = (a + b * c);
		int A2 = (c + a / b);
		int A3 = (a % b + c);
		int A4 = (a * b + c);
		
		System.out.println("First Arithmatic Operation : "+A1);
		System.out.println("Second Arithmatic Operation : "+A2);
		System.out.println("Third Arithmatic Operation : "+A3);
		System.out.println("Fourth Arithmatic Operation : "+A4);
		
		if(A1 > A2 && A1 > A3 && A1> A4) {
			System.out.println("Greater Value is : "+A1);
		}
		else if(A2 > A3) {
			System.out.println("Greater Value is : "+A2);
		}
		else if(A3 > A4) {
			System.out.println("Greater Value is : "+A3);
		}
		else {
			System.out.println("Greater Value is : "+A4);
		}
	}
}
