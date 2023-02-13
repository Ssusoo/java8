package me.ssu.java8._1.lambdafunction;

/**
 * 람다 함수 : 익명 함수(Anonymous functions)
 *  람다 대수는 이름을 가질 필요가 없다.
 *
 *  람다 장점
 *      코드의 간결성, 불필요한 반복문의 삭제가 가능하며 복잡한 식을 단순하게 표현할 수 있다.
 *      지연연산 수행, 지연연상을 수행함으로서 불필요한 연산을 최소화할 수 있다.
 *      병렬처리 가능, 멀티 쓰레드를 활용해 '병렬처리'를 사용할 수 있다.
 *
 *  람다 단점
 *      람다 stream 사용 시 단순 for문 혹은 while문 사용시 성능이 떨어진다.
 */
public class LambdaFunctionBasic {

	public static void main(String[] args) {
		// TODO 자바 8이전에는 인터페이스 사용방법
		//  익명 내부 클래스라고 불렀음.
		LambdaFunction runSomething = new LambdaFunction() {
			@Override
			// abstract void doIt();
			public void doIt() {
				System.out.println("Hello");
				System.out.println("Lambda");
			}
		};

		// TODO 람다 표현식으로 위에 코드를 죽일 수 있음(한 줄일 때)
		LambdaFunction runSomethingLambdaOne = () -> System.out.println("Hello");

		// TODO 람다 표현식 구현부가 두 줄일 때
		LambdaFunction runSomethingLambdaTwo = () -> {
			System.out.println("Hello");
			System.out.println("Lambda");
		};

		// TODO 람다 실행
		runSomething.doIt();
		runSomethingLambdaOne.doIt();
		runSomethingLambdaTwo.doIt();
	}
}