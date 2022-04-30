package day1;

public class Sample9 {
	
	public static void main(String[] args) {
		// 내장 문자열	
		// String 자료형의 내장 메소드 중에서 자주 사용되는 것들에 대해서 알아보자
		// equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false 출력
		System.out.println(a.equals(c)); // true 출력
		
		// 문자열 a 와 문자열 b 는 "hello"와 "java"로 서로 같지 않다. 
		// 따라서 equals 메소드 호출 시 false 를 리턴한다. 
		// 문자열 a 와 문자열 c 는 "hello"와 "hello"로 서로 같다. 따라서 true 를 리턴함
		// 문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.
		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b));  // true
		System.out.println(a == b);  // false
		
		// 문자열 a와 b는 모두 "hello"로 같은 값이지만 equals 를 호출했을 때는 true 를 
		// == 연산자를 이용했을 때는 false를 리턴한다. a와 b는 값은 같지만 서로 다른 객체이다. 
		//== 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false를 리턴한다
	}
}
