/* write a Java program to compute the sum of the digits of an integer.
 * 	Input Data:
 * 		Input an integer:27
 * 		Expected OutPut:
 * 		The sum of the digits is: 7 
 */

package assignment_core_java;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input one Integer: ");
		int number=scan.nextInt();
		int sum=0;
		while(number>0) {
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("The sum of the digits is: "+sum);
	}

}
