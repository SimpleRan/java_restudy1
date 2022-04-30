package day1;

public class Sample2 {

	public static void main(String[] args) {
		// 숫자연산
		// 자바의 사칙연산은 실생화렝서 일반적으로 사용하는 사칙연산과 다를바가 없다. 
		// 자바는 +, -, *, /기호를 이용하여 두 숫자간 사칙연산을 수행한다.
		// 다음과 같이 사칙연사능ㄹ 수행하는 자바프로그램을 작성해보자
		
		int a = 10;
		int b = 5;
		System.out.println(a+b);    // 15
		System.out.println(a-b);	// 5
		System.out.println(a*b);	//50
		System.out.println(a/b);	// 2
		// 작성후 실행해보면 출력됨을 확인
		
		// 프로그래밍을 접해본 적 없는 독자라면 %연산자는 본적이 없을 것이다. 
		// %는 나머지 값을 반환하는 연산자이다. 7을 3으로 나누면 나머지는 1이 될 것이고 3을 7로 나누면 나머지는 3이다.
		// 직접 확인해보자 
		System.out.println(7 % 3); // 1 출력 
		System.out.println(3 % 7); // 3 출력
		
		
		
	}

}
