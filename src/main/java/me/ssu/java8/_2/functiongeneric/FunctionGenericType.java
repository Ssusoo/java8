package me.ssu.java8._2.functiongeneric;

import java.util.function.Function;

/**
 * Function<T, R>
 *  어떤 값 T를 받고 리턴은 R로 둘의 값이
 *  다른 이유는 타입이 다를 수 있기 때문에
 *  T와 R로 정의되어 있음.
 */
public class FunctionGenericType implements Function<Integer, Integer> {

	// TODO T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
	@Override
	public Integer apply(Integer integer) {
		return integer + 10;
	}

	// TODO 함수 조합용 메소드-1
	@Override
	public <V> Function<V, Integer> compose(Function<? super V, ? extends Integer> before) {
		return Function.super.compose(before);
	}

	// TODO 함수 조합용 메소드-2
	@Override
	public <V> Function<Integer, V> andThen(Function<? super Integer, ? extends V> after) {
		return Function.super.andThen(after);
	}
}
