package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {


	//public static void main(String[] args) {
		// for each 문
		// for each는 J2SE 5.0 부터 추가되었다. for each 라는 키워드가 
		// 따로 있는 것은 아니고 동일한 for를 이용한다. 하지만 조건식 부분의 문법이 조금 다르다.

		// 다음은 이전에 공부했던 평범한 for 문이다.
		//String[] numbers = {"one", "two", "three"};
	//	for(int i = 0; i<numbers.length; i++) {
	//		System.out.println(numbers[i]);
		}
		// 위 for문은 다음처럼 for each구조로 변경할 수 있다.
	//	for(String number: numbers) {
	//		System.out.println(number);
	//	}

		// for each문의 구조는 다음과 같다
		// for((type var: iterate) {
	    // 	body-of-loop
	    // }
		
		// 위에서 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 
		// 순차적으로 var에 대입되어 for문이 수행된다. iterate로 사용할 수 있는 
		// 자료형은 루프를 돌릴수 있는 자료형(배열 및 ArrayList 등)만 가능하다.
		
		// 다음은 위 예제를 ArrayList로 구현한 예제이다. 
		// for문의 사용법은 String[] 배열을 사용했을 때와 완전히 동일하다.
		
			public static void main(String[] args) {
				ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));
				for(String number : numbers) {
					System.out.println(number);
				}
			}
		}
		// 단, for each 문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 
		// 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.
