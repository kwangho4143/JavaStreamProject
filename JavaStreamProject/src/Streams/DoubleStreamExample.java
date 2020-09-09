package Streams;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {
	public static void main(String[] args) {
		double[] dAry = {2.3 ,4.5 ,8.3, 5.5 , 4.6 };
		DoubleStream dStream = Arrays.stream(dAry);
		double sum = dStream.filter(new DoublePredicate() {

			@Override
			public boolean test(double value) {
				// TODO Auto-generated method stub
				return value <5;
			}
			
		}).sum();
		System.out.println(sum);
		
		
		LongStream lStream = Arrays.stream(new long[] {10,29,38});
		IntStream iStream = Arrays.stream(new int[] {1,2,3});
		DoubleStream ddStream = Arrays.stream(new double[] {1.1,2.2});
	}
}
