package me.ssu.java8.highorderfuntion;

/**
 * 고차 함수(High-Order-Function)
 *
 *  함수가 함수를 매개변수로 받을 수 있고
 *  함수를 리턴할 수도 있다.
 */
@FunctionalInterface
public interface HighOrderFunction {

	int doIt(int number);
}
