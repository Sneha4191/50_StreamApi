package com.stream.api.array;

import java.util.Arrays;

public class GreaterThen7FirstEle {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		long firstElement = Arrays.stream(num).filter(n->n>7).findFirst().orElse(-1);
		System.out.println("Greater then 7 elements is "+firstElement);

	}

}
