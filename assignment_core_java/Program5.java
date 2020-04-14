//Write a Java program to swap two variables.
package assignment_core_java;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int j=10;
		System.out.println("Value of i,j before swapping i= "+i+" and j= "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("Value of i,j after swapping i= "+i+" and j= "+j);
	}

}
