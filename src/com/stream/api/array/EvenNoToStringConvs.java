package com.stream.api.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenNoToStringConvs {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		String evenNumber = Arrays.stream(num).filter(n->n%2==0).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println("String of even Number is "+evenNumber);
	}

}
