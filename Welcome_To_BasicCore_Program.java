package com.Basic.Program;
import java.util.Scanner;
public class Welcome_To_BasicCore_Program {
	public static void main(String[] args) {

		
		int h_cnt = 0; int t_cnt = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the no of times to flip a coin:");
		int n = Scan.nextInt();
		for (int i = 1; i < n; i++) {
			double flip = Math.floor(Math.random() * 10) % 2;
			if (flip< 0.5) {
				h_cnt++;
			} else {
				t_cnt++;
			}
			
		}
		double headpercentage = (h_cnt* 100) /n;
		double tailpercentage = (t_cnt * 100) /n;
		System.out.println("The percentage of head flips:" + headpercentage);
		System.out.println("The percentage of tail flips:" + tailpercentage);
		
		
	}
}
