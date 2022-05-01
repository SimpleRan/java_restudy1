package day1;

public class Sample10 {

	public static void main(String[] args) {
		// 문자열 포매팅
		// 문자열에서 또 하나 알아야 할 것으로 문자열 포메팅(Formatting)이 있다
		// 예를 들어 "현재 온드는 18도 입니다" 
		// 시간이 지나서 20도가 되면 다음 문장을 출력한다
		// "현재 온도는 20도 입니다"
		// 위 두 문자열은 모두 같은데 20이라는 숫자와 18이라는 숫자만 다르다. 이렇게 문자열 안의
		// 특정한 값을 바꿔야 할 경우가 있을 때 이것을 가능하게 해주는 것이 바로 포매팅기법이다.
		// 쉽게 말해 문자열 포매팅이란 문자열 안에 어떤 값을 삽입하는 방법이다. 
		
		// 1. 숫자 바로 대입
		System.out.println(String.format("I eat %d apples", 3));
		// 포매팅은 Sting.format 메소드를 사용하며 위 예제에서 보듯 문자열 안에 정수 3을 삽입하는 방법
		// 문자열 안에서 숫자를 넣고 싶은 자리에 %d 문자를 넣어주고 , 삽입할 숫자는 3은 두번째 파라미터로 전달
		// 여기에서 %d는 문자열 포맷 코드라고 부른다.
		
		// 2. 문자열에 바로 대입
		System.out.println(String.format("I eat %s apples.", "five"));
		// 위 예제에서는 문자열 안에 또 다른 문자열을 삽입하기 이해 앞에서 사용한 문자열포맷코드 %d가 아닌
		// %s를 썻다 . 숫자를 넣기위해서는 %d를 써야하고 문자열을 넣기위해서는 %s를 써야한다.
		
		//3. 숫자값을 나타내는 변수로 대입
		//int number = 3;
		//System.out.println(String.format("I eat %d apples.", number));
		// 1번처럼 숫자를 바로 대입하나 위ㅔ 예제처럼 숫자값을 나타내는 변수를 대입하나 결과는 같다.
		
		// 4. 2개 이상의 값 넣기
		int number = 10;
		String  day = "three";
		System.out.println(String.format("I eat %d apples. so I was sick for %s days", number, day));
		// 위와 같이 2개 이상의 값을 넣으려면 파라미터로 여려개를 전달하면 된다. 
		
		// 문자열 포맷 코드 -문자열 포매팅 예제에서는 대입해 넣는 자료형으로 
		// 정수와 문자열을 사용했으나 이 외에도 다양한 것을 대입할 수 있다
		
		// %s	문자열(String)
		// %c	문자 1개(character)
		// %d	정수(Integer)
		// %f	부동소수(floating-point)
		// %o	8진수
		// %x	16진수
		// %%	Literal % (문자 % 자체)
		
		// 여기에 재밌는 것은 %s 포맷 코드인데, 이 코드는 어떤 형태의 값이든 변환해 넣을 수 있다. 
		
		System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
		System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
		
		// [포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다]
		System.out.println(String.format("Error is %d%%.", 98));
		
		// 포맷 코드와 숫자 함께 사용하기
		// 1. 정렬과 공백
		System.out.println(String.format("%10s", "hi"));
		System.out.println(String.format("%5s", "hi"));
		// 앞의 예문에서 %10s는 전체 길이가 10개인 문자열 공간에서 대입되는 값을 오른쪽으로 정렬하고
		// 그 앞의 나머지는 공백으로 남겨두라는 의미이다
		// 반대쪽인 왼쪽 정렬은 %-10s가 될 것이다. 
		System.out.println(String.format("%-10sjane", "hi"));
		// hi를 왼쪽을 정렬하고 나머지는 공백으로 채웠다
		
		// 2.소수점 표현하기		
		System.out.println(String.format("%.4f", 3.42134234)); 
		// 3.42134234를 소수점 네 번째 까지만 나타낼 수 있다. '.'의 의미는 소수점 포인트를 말하고
		// 그 뒤 숫자 4는 소수점 뒤에 올 숫자의 개수를 말한다.
		System.out.println(String.format("%10.4f", 3.42134234));
		
		// System.out.printf
		// String.format 메소드는 포매팅된 문자열을 리턴한다. 따라서 포메팅된 문자열을 출력하려면
		// 다음처럼 system.out.println 메소드를 함게 사용해야한다
		System.out.println(String.format("I eat %d apples.", 3));
		// System.out.printf 메소드를 사용하면 String.format 메소드 없이도 
		// 동일한 형식으로 포매팅된 문자열을 출력할 수 있다
		System.out.printf("I eat %d apples.", 3);
		//String.format 과 System.out.printf의 차이는 전자는 문자열을 리턴하는 메소드이고
		// 후자는 문자열을 출력하는 메소드라는 점이다. 상황에 맞게 선택하여 사용하자.
		
	}

}
