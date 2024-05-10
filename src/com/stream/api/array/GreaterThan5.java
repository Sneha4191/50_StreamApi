package com.stream.api.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GreaterThan5 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		String greaterValue = Arrays.stream(num).filter(n->n>5).mapToObj(String::valueOf).collect(Collectors.joining(","));
		long count = Arrays.stream(num).filter(n->n>5).count();
		System.out.println("Count greater then 5 value is "+greaterValue);

	}

}
