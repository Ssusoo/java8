package me.ssu.java8.lambdafunction;

/**
 * 추상 클래스(일반 메소드 추상 메소드 둘 다 사용 가능)
 *  추상 메소드
 *      선언부만 있고 구현부는 없으며 리턴 역시 없다.
 *
 *  추상 클래스 상속시 강제성
 *      추상 클래스로 만든 추상 메소드의 경우 상속 받은 자식 클래스는
 *      추상 메소드를 오버라이딩(재정의) 해 무조건적으로 사용해야 함.
 */

/**
 * 인터페이스(다중 상속)
 *  일반 메소드를 받을 수 없어 추상 클래스보다 더 엄격함.
 *
 *  인터페이스 상속시 더 엄격함.
 *      자식클래스에서 인터페이스를 상속 받으면 메소드를
 *      무조건 사용해야 한다.
 */

// TODO 추상 메소드가 두 개일 때 Compile 에러가 남.
@FunctionalInterface
public interface LambdaFunction {

	// TODO 추상 메소드 한 개 일 때만 함수형 인터페이스임
	abstract void doIt();

	// TODO 자바8부터 적용된 기능(인터페이스임에도 static 정의 가능)
	static void printName() {
		System.out.println("Ssu");
	}

	// TODO 자바8부터 적용된 기능(default 메소드도 가능)
	default void printAge() {
		System.out.println("40");
	}
}
