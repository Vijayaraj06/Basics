package preDefinedClases;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		double c=a+b;
		System.out.println("value of c is "+c);

	}

}
