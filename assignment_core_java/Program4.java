/*Write a Java program that takes a number as input and prints its multiplication table upto 10.
	Test Data:
	Input a number: 8
	Expected Output :
	8 x 1 = 8
	8 x 2 = 16
	8 x 3 = 24
	...
	8 x 10 = 80*/
package assignment_core_java;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input a Number: ");
		int number=scan.nextInt();
		for (int i=1;i<11;i++) {
			int result=number*i;
			System.out.println(number+" * "+i+"="+result);
		}
	}
}
