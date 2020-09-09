package Streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromArrayExample {
	public static void main(String[] args) {
		int intAry[] = {3,6,4,9,7};
		IntStream iStream = Arrays.stream(intAry);
		iStream.filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value>5;
			}
		}).forEach(System.out::println);
		
		//long cnt = iStream.count();더이상 처리할 반복자가 없기 떄문에 에러발생

		
		iStream = Arrays.stream(intAry);
		long cnt = iStream.sum();
		System.out.println("총합:"+ cnt);
		
		
		
		iStream = Arrays.stream(intAry,0,4); //0부터 4전까지 값들만 사용
		cnt = iStream.peek(t -> System.out.println(t)).count();
		System.out.println("cnt:"+ cnt);
		
		
		
	
	}

}
