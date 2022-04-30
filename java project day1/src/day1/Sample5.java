package day1;

public class Sample5 {
	
	public static void main(String[] args) {
		// 조건문
		// 불 연산은 다음처럼 조건문의 판단 기준으로 많이 사용한다.
		int base = 180;
		int height = 185;
		boolean itTall = height > base;
		
		if (itTall) {
			System.out.println("키가 큽니다.");
			
		int i = 3;
		boolean isOdd = i % 2 == 1;
		System.out.println(isOdd);  //true출력
		
		// i % 2 == 1은 i를 2로 나누었을때 나머지가 1인지를 묻는 조건문이다 i는 3이므로 3을 2로 나눈 나머지는 1이 되어 참이 된다.
		}
	}
}
