package test;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of 2 number
		int a , b , c;
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter the 1st number to add :");
		a = sc.nextInt();
		System.out.println("Enter the 2nd number to add :");
		b = sc.nextInt(); 
		c = a + b;
		System.out.println ("Sum of 2 number is :"+c);
	}

}
