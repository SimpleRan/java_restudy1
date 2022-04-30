package day1;

public class Sample7 {

	public static void main(String[] args) {
		// 문자열
		// 문자열이란 문장을 뜻한다. 예를 들면 다음과 같은 것들이 문자열이다.
	//	"Happy Java"
	//	" a "
	//	"123"
		
		// 자바에서 문자열을 나나태는 자료형은 String이다.
		// 즉 위의 문자열을 자바에서 표현하려면 다음과 같이 사용해야한다.
		// String a = "Happy Java";
		// String b = "a";
		// String c = "123";
				
		// 다음과 같이 표현해도 된다
		String a = new String("Happy Java");
		String b = new String ("a");
		String c = new String("123");
		
		// new 키워든ㄴ 객체를 만들때 사용한다.
		// 하지만 보통 문자열을 표현할 때는 가급적 첫번째(리터럴표기)을 사용하는 것이 좋다.
		// 첫번째처럼 하면 가독성에 이점이 있고 컴파일 시 최적화에 도움을 주기 때문이다.
		
		// 리터럴 표기
		// String a = "happy java" 와 String a = new String("happy java")는 
		// 같은 값을 갖게 되지만 완전히 동일하지는 않다. 첫번째 방식을 리터럴(literal) 표기라고 하는데 
		// 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다. 
		// 위 예에서 리터럴 표기법은 "happy java" 라는 문자열을 intern pool 이라는 곳에 저장하고 
		// 다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다. 
		// 두번째 방식은 항상 새로운 String 객체를 만든다.
	}

}
