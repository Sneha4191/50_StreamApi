package com.stream.api.array;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = Arrays.stream(n).sum();
		System.out.println("Sum of all elements are "+sum);

	}

}
