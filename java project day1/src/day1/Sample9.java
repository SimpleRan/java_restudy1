package day1;

public class Sample9 {
	
	public static void main(String[] args) {
		// ���� ���ڿ�	
		// String �ڷ����� ���� �޼ҵ� �߿��� ���� ���Ǵ� �͵鿡 ���ؼ� �˾ƺ���
		
		// equals - �ΰ��� ���ڿ��� ���������� ���Ͽ� ������� ����
		
		// String a = "hello";
	//	String b = "java";
	//	String c = "hello";
	//	System.out.println(a.equals(b)); // false ���
	//	System.out.println(a.equals(c)); // true ���
		
		// ���ڿ� a �� ���ڿ� b �� "hello"�� "java"�� ���� ���� �ʴ�. 
		// ���� equals �޼ҵ� ȣ�� �� false �� �����Ѵ�. 
		// ���ڿ� a �� ���ڿ� c �� "hello"�� "hello"�� ���� ����. ���� true �� ������
		// ���ڿ��� ���� ���Ҷ��� �ݵ�� equals �� ����ؾ� �Ѵ�. == �����ڸ� ����� ��� ������ ���� ��찡 �߻��� �� �ִ�.
		
		// String a = "hello";
		// String b = new String("hello");
		
	//	System.out.println(a.equals(b));  // true
  //	System.out.println(a == b);  // false
		
		// ���ڿ� a�� b�� ��� "hello"�� ���� �������� equals �� ȣ������ ���� true �� 
		// == �����ڸ� �̿����� ���� false�� �����Ѵ�. a�� b�� ���� ������ ���� �ٸ� ��ü�̴�. 
		//== �� �ΰ��� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� �������̱� ������ false�� �����Ѵ�
		
		// indexOf - ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� ��ġ(�ε���)�� �����Ѵ�
		// String a = "Hello Java";
		// ���� ���� a ���ڿ����� "Java"��� ���ڿ��� ���۵Ǵ� ��ġ�� �˰� ���� ��� indexOf�� ������ ���� ����� �� �ִ�
		//String a = "Hello Java";
		//System.out.println(a.indexOf("Java"));  // 6 ���
		
		// "Hello Java" ��� ���ڿ����� "Java"��� ���ڿ��� �ϰ���° ����('J')���� �����̴�. 
		// ������� 6���� ���� ������ �ڹٴ� ���ڸ� 0���� ���� �����̴�
		
		// contains - ���ڿ����� Ư�� ���ڿ��� ���ԵǾ� �ִ����� �źθ� �����Ѵ�.
		
		//String a = "Hello Java";
		//System.out.println(a.contains("Java"));  // true ���
		// ���ڿ� a�� "Java"��� ���ڿ��� �����ϰ� �ֱ� ������ true�� ����
		
		// charAt - ���ڿ����� ���� ������ ��ġ(char)�� �����Ѵ�
		// String a = "Hello Java"; 
		// ���� ���� a ���ڿ����� "J"��� ���ڴ� 6��° �ε����� ��ġ�� �����̴�. 
		// 6�̶�� ���ڷ� "J"��� ���ڸ� ������ؼ��� ������ ���� charAt�� ���
		
		//System.out.println(a.charAt(6)); // J ���
		// J��� ���ڴ� �ϰ���° ���������� 6���� ã�� ������ �ڹٴ� ���ڸ� 0���� ���� �����̴�.
		
		// replaceAll - ���ڿ� �� Ư�� ���ڿ��� �ٸ� ���ڿ��� �ٲٰ����Ҵ� ���
		//System.out.println(a.replace("Java", "World")); // Hello World���
		
		// substring - Ư�� �κ��� �̾Ƴ� ��� ���
		//System.out.println(a.substring(0, 4)); //Hell ���
		// ��ó�� substring(������ġ, ����ġ)�� ���� ����ϸ� ���ڿ��� ������ġ���� ����ġ���� ���ڸ�
		// �̾Ƴ��� �ȴ� �� ����ġ�� ������ �ȵȴٴ� ���� �������� ������ġ <= a < ����ġ
		
		// toUpperCase -��� �빮�ڷ� ������ �� ����Ѵ� (��� �ҹ��ڷ� ������ ���� toLowerCase�� ���)
		//System.out.println(a.toUpperCase());
	//	System.out.println(a.toLowerCase());
		
		// split - ���ڿ��� Ư�� �����ڷ� �и��ϴ� �޼ҵ�
		String a = "a:b:c:d";
		String[] result = a.split(":"); 
		
		
		
		
	}
}
