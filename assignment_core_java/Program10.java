/*Write a Java program to reverse a string. 
 * Enter the string: My name is mithun.
 * 
 * Expected output:
 * Reversed string is : nuhtim si eman ym
 */


package assignment_core_java;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= scan.nextLine();
		StringBuilder sb = new StringBuilder(str); 
		System.out.println("Reversed string is : "+sb.reverse());
		
	}

}
