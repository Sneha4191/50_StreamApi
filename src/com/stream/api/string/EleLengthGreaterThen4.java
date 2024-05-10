package com.stream.api.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EleLengthGreaterThen4 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Eve");
		//List<String> filterNames = names.stream().filter(name->name.length()>4).map(String::toUpperCase).collect(Collectors.toList());
		
		List<String> filterNames = names.stream()
				.filter(name->name.length() > 4)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("Elements are "+filterNames);
	}

}
