package com.company.String;
//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		System.out.println(a.charAt(0)+0);
		//  charAt(0)을 사용해 첫번째 글자를 char 형태로 받아 0을 더하는 과정
		sc.close();
		
		
		
	} 
}
