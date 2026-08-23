package com.flm.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			
			sc=new Scanner(System.in);
			System.out.println("Enter number 1");
			int num1=sc.nextInt();
			System.out.println("Enter number 2");
			int num2=sc.nextInt();
			System.out.println(num1/num2);
			System.out.println("Enter number 3");
			int num3=sc.nextInt();
			System.out.println("Enter number 4");
			int num4=sc.nextInt();
			System.out.println(num3/num4);
		}
		catch(InputMismatchException ex) {
			System.out.println("Only integers numbers allow");
			
		}
		catch(ArithmeticException ex) {
			System.out.println("number not divide by 0");
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("index out of bounds");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Entered finally");
			sc.close();
		}
	}
}
