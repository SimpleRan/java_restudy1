package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {


	//public static void main(String[] args) {
		// for each ��
		// for each�� J2SE 5.0 ���� �߰��Ǿ���. for each ��� Ű���尡 
		// ���� �ִ� ���� �ƴϰ� ������ for�� �̿��Ѵ�. ������ ���ǽ� �κ��� ������ ���� �ٸ���.

		// ������ ������ �����ߴ� ����� for ���̴�.
		//String[] numbers = {"one", "two", "three"};
	//	for(int i = 0; i<numbers.length; i++) {
	//		System.out.println(numbers[i]);
		}
		// �� for���� ����ó�� for each������ ������ �� �ִ�.
	//	for(String number: numbers) {
	//		System.out.println(number);
	//	}

		// for each���� ������ ������ ����
		// for((type var: iterate) {
	    // 	body-of-loop
	    // }
		
		// ������ iterate�� ������ ���� ��ü�̰� iterate ��ü���� �Ѱ��� 
		// ���������� var�� ���ԵǾ� for���� ����ȴ�. iterate�� ����� �� �ִ� 
		// �ڷ����� ������ ������ �ִ� �ڷ���(�迭 �� ArrayList ��)�� �����ϴ�.
		
		// ������ �� ������ ArrayList�� ������ �����̴�. 
		// for���� ������ String[] �迭�� ������� ���� ������ �����ϴ�.
		
			public static void main(String[] args) {
				ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));
				for(String number : numbers) {
					System.out.println(number);
				}
			}
		}
		// ��, for each ���� ���� �ݺ�ȸ���� ��������� �ִ� ���� �Ұ����ϰ�, 
		// 1���Ǿ� ���������� �ݺ��ɶ��� ��밡���ϴٴ� ������ �ִ�.
