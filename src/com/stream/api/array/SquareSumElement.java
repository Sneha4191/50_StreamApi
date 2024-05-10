package com.stream.api.array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareSumElement {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		// Square + Sum of all elements
		long square = Arrays.stream(num).map(n->n*n).sum();
		System.out.println("Square and Sum of all elements are "+square);
		
		//Boolean value if odd element  
		boolean oddNumber = Arrays.stream(num).anyMatch(n->n%2!=0);
		System.out.println(oddNumber);
		
		//find all odd elements from array
		String odd = Arrays.stream(num).filter(n -> n % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println("odd numbers are "+odd);
		
		//convert all elements to binary representation
		
		String binary = Arrays.stream(num).mapToObj(Integer::toBinaryString).reduce(" ", (str1,str2)->str1 + ""+ str2 );
		System.out.println("Binary represenentation of elements are"+binary);

		// Find and print the index of the first occurrence of element 5
		int firstIndexOf = IntStream.range(0,num.length).filter(i->num[i]==5).findFirst().orElse(-1);
		System.out.println("index of the first occurrence of element 5 are "+firstIndexOf);
		//int firstIndex = IntStream.range(0, num.length).filter(i->num[i]==5).findFirst().orElse(-1);
	}

}
