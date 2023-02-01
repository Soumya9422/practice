package test;

import java.util.Scanner;

public class palendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,c;
		int a = 101 ;
		int d = 0 ;
		b=a;
		while (a>0)
		{
			c=b%10;
			d=(c*10)+c;
			a=a/10;
			
		}
		if (b==d)
		{
			System.out.println("its a palandrom number");
		}
		else
		{
			System.out.println("its not a palandrom number");
		}
	}

}
