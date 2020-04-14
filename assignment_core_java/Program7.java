package assignment_core_java;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int number=scan.nextInt();
		String binaryNumber=Integer.toBinaryString(number);
		System.out.println("Binary conversion of decimal "+number+" = "+binaryNumber);
		
		//2nd method
		String str="";
		int temp=number;
		while(number!=0) {
			int rem=number%2;
			str= rem+str;
			number=number/2;
		}
		System.out.println("Binary conversion of decimal "+temp+" = "+str);
		
		

	}

}
