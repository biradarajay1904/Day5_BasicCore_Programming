package com.Basic.Program;
import java.util.Scanner;
public class Welcome_To_BasicCore_Program {
	public static void main(String[] args) {

		
		double result = 0, num = 0, j;
		int n;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("enter the harmonic you want to find: ");
		n = sc.nextInt();

		
		for (j = 1; j <= n; j++) {
			num = num + (1 / j);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

}
}
