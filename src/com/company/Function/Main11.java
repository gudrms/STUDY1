package com.company.Function;

public class Main11 {
	long sum(int[] a) {
		long sum =0;
		
		for(int i = 0; i<a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}
}
