package test;

import java.util.Scanner;

public class swap {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		System.out.println("Enter the b value");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("");
	}

}
