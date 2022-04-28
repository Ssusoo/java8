package me.ssu.java8._1.highorderfuntion;

public class HighOrder {

	public static void main(String[] args) {

		// TODO 순수한 형태-1
		HighOrderFunction highOrderFunction = new HighOrderFunction() {
			@Override
			public int doIt(int number) {
				// 입력 받은 값이 동일한 경우 리턴
				return number + 10;
			}
		};

		// TODO 람다식
		HighOrderFunction highOrderFunctionLambda = number -> {
			return number + 10;
		};

		// TODO 값은 값이 나와야 함수형 프로그램임.
		System.out.println(highOrderFunction.doIt(1));  // 11
		System.out.println(highOrderFunction.doIt(1));  // 11

		// TODO 순수하지 않은 형태-2
		HighOrderFunction notHighOrderFunction = new HighOrderFunction() {

			int baseNumber = 10;

			@Override
			public int doIt(int number) {
				baseNumber++;   // 10
				return number + baseNumber; // 10 + 11
			}
		};

		// TODO 값은 값이 넣었는데 다른 값이 나오면 함수형 프로그래밍이 아님.
		System.out.println(notHighOrderFunction.doIt(10));  // 10(number) + 11(baseNumber, 10+1) = 21
		System.out.println(notHighOrderFunction.doIt(10));  // 10(number) + 12(baseNumber, 11+1) = 22
	}
}