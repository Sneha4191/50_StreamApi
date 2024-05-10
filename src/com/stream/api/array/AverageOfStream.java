package com.stream.api.array;

import java.util.Arrays;

public class AverageOfStream {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		
		double average = Arrays.stream(n).average().orElse(0);
		
		System.out.println("Average of elements is "+average);
	}

}
