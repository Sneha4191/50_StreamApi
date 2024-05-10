package com.stream.api.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MaxMinElements {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6,7,8,9,10};
		
		IntSummaryStatistics stats = Arrays.stream(n).summaryStatistics();
		System.out.println("Maximum of element are "+stats.getMax());
		System.out.println("Minimum of element are "+stats.getMin());
		
		
	}

}
