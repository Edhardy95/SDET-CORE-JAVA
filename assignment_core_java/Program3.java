/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.  
	Test Data: 
	Input first number: 125
	Input second number: 24
	Expected Output: 
	125 + 24 = 149 
	125 - 24 = 101 
	125 x 24 = 3000
	125 / 24 = 5 
	125 % 24 = 5*/
package assignment_core_java;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input First number: ");
		int firstNumer=scan.nextInt();
		System.out.print("Input Second number: ");
		int secondNumber=scan.nextInt();
		int result1=firstNumer+secondNumber;
		int result2=firstNumer-secondNumber;
		int result3=firstNumer*secondNumber;
		int result4=firstNumer/secondNumber;
		int result5=firstNumer%secondNumber;
		System.out.println(firstNumer+" + "+secondNumber+"="+result1);
		System.out.println(firstNumer+" - "+secondNumber+"="+result2);
		System.out.println(firstNumer+" * "+secondNumber+"="+result3);
		System.out.println(firstNumer+" / "+secondNumber+"="+result4);
		System.out.println(firstNumer+" % "+secondNumber+"="+result5);
	}

}
