package me.ssu.java8.lambdafunction;

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