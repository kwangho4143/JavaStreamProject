package Streams;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntExample {
	public static void main(String[] args) {
		int ary[]= {0,1,2,3,4,5,6,7,8,9,10};
		
		IntStream iStream = Arrays.stream(ary);
		int total=iStream.filter(value-> value%2==0).sum();
		System.out.println(total);
	}
}
