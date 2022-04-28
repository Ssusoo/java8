package me.ssu.java8._2.functiongeneric;

import java.util.function.Function;

public class FunctionGeneric {

	public static void main(String[] args) {
		// TODO 클래스로 받아서 하는 방법-1
		FunctionGenericType functionGenericType = new FunctionGenericType();

		// TODO apply : T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
		System.out.println(functionGenericType.apply(1)); // 11

		// TODO 익명 내부 클래스로 하는 방법-2
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer integer) {
				return integer + 10;
			}
		};

		// TODO apply : T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
		System.out.println(function.apply(2));  // 12

		// TODO 람다로 하는 방법-3
//		Function<Integer, Integer> functionLambda = integer -> integer + 10;
		Function<Integer, Integer> functionLambda = (i) -> i + 10;

		// TODO apply : T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
		System.out.println(functionLambda.apply(100));  // 110
	}
}
