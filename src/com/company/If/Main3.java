package com.company.If;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		sc.close();
		
		if(Y % 4 == 0 & Y % 100 !=0  ) {
			System.out.println("1");
		}else if(Y % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
		
}


