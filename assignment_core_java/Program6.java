/*Write a Java program to add two binary numbers. 
	Input Data: 
	Input first binary number: 10  
	Input second binary number: 11 
	Expected Output :
	Sum of two binary numbers: 101 */

package assignment_core_java;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input first binary number: ");
		String x=scan.next();
		System.out.print("Input second binary number: ");
		String y=scan.next();
		
		int num1=Integer.parseInt(x, 2);
		int num2=Integer.parseInt(y, 2);
		int sum=num1+num2;
		System.out.println("");
		
		System.out.println("first binary number: "+Integer.toBinaryString(num1));
		System.out.println("first binary number: "+Integer.toBinaryString(num2));
		System.out.println("Sum of binary number: "+Integer.toBinaryString(sum));
	}

}
