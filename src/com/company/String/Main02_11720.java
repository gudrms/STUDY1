package com.company.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.e
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.dddsdd
public class Main02_11720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		int s = 0;
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			s += a[i]; 
		}
		
		System.out.println(s);
		
		
	}

}
