package day1;

public class Sample9 {
	
	public static void main(String[] args) {
		// ���� ���ڿ�	
		// String �ڷ����� ���� �޼ҵ� �߿��� ���� ���Ǵ� �͵鿡 ���ؼ� �˾ƺ���
		// equals�� �ΰ��� ���ڿ��� ���������� ���Ͽ� ������� ����
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false ���
		System.out.println(a.equals(c)); // true ���
		
		// ���ڿ� a �� ���ڿ� b �� "hello"�� "java"�� ���� ���� �ʴ�. 
		// ���� equals �޼ҵ� ȣ�� �� false �� �����Ѵ�. 
		// ���ڿ� a �� ���ڿ� c �� "hello"�� "hello"�� ���� ����. ���� true �� ������
		// ���ڿ��� ���� ���Ҷ��� �ݵ�� equals �� ����ؾ� �Ѵ�. == �����ڸ� ����� ��� ������ ���� ��찡 �߻��� �� �ִ�.
		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b));  // true
		System.out.println(a == b);  // false
		
		// ���ڿ� a�� b�� ��� "hello"�� ���� �������� equals �� ȣ������ ���� true �� 
		// == �����ڸ� �̿����� ���� false�� �����Ѵ�. a�� b�� ���� ������ ���� �ٸ� ��ü�̴�. 
		//== �� �ΰ��� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� �������̱� ������ false�� �����Ѵ�
	}
}
