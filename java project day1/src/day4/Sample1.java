package day4;

public class Sample1 {

	public static void main(String[] args) {
		// Ŭ����
		// ���⼭�� Ŭ������ ���� �������� ������ �ϱ⺸�ٴ� ���� ������ Ŭ������ 
		// �ۼ��ϴ� �Ϳ������� �����Ͽ� ���ݾ� Ŭ������ �Ը� Ű������ ������� Ŭ������ �����غ���.
		
		// 1. ��ü�� ���Ͽ�
		// Animal Ŭ������ ������ ���� Sample.java ���Ͽ� �ۼ�����
		class Animal {
		}
		class Sample {
			public static void main(String[] args) {
			}
		}
		// Animal Ŭ������ Sample.java ���Ͽ� �ۼ��� ���� å�� ������ ������ ���ؼ��̴�.
		// ���� Ŭ������ Ư���� ��찡 �ƴ϶�� ���ϴ����� �ϳ��� �ۼ��Ѵ�. ��, ���� ��쿡
		// AnimalŬ������ Animal.java ���Ͽ� �ܵ����� �ۼ��ϴ� ���� �Ϲ����� ����̴�.
		// ������ �� å�� ��κ��� ������ Sample.java ���ϸ��� �ۼ��Ͽ� ���� �� �� �ֵ��� ������
		
		// ��  Animal Ŭ������ ���� ������ ������ Ŭ�����̴�. 
		// Ŭ������ ���� �ְ� ������ ���� ��������� Ŭ�����̴�. ������ ��������� Ŭ������ 
		// ���� �߿��� ����� ������ �ִ�. �� ����� �ٷ� ��ü(object)�� ����� ����̴�.
		
		// ��ü�� ������ ���� ���� �� �ִ�. 
	
		//class Animal1 {
		//}
		
		//public class Sample {
		//	public static void main (String[] args) {
		//		Animal cat = new Animal1();
		//	}
		//}
		
		// new�� ��ü�� ������ �� ����ϴ� Ű�����̴�. �̷��� �ϸ� Animal Ŭ������ �ν��Ͻ�(instance)��
		// cat, �� Animal�� ��ü�� ���������. 
		// ����Ʋ�� Ŭ����, ����Ʋ�� ���� ������� ���ڴ� ��ü�� ������ �� �ִ�. �� �׸��� ���� 
		// Ŭ������ ��ü�� � �������� ���� ���� ���̴�.

		// ��, ������ ���� ������ ���� ���� ��ü(cat, dog, horse, ...)���� 
		// Animal Ŭ������ ���� �� �ִ�.
		
		//Animal1 cat = new Animal1();
		//Animal1 dog = new Animal1();
	//	Animal1 horse = new Animal1();
		// ....
		
		// ��ü ���� (Instance variable)
		// Animal�� ������ Ŭ������ ���� �� �������Ѻ��� Animal Ŭ������ ���� �������
		// ������ �̸��� ����� �������� ���� �����ϱ� 
		//class Animal {
			String name;
		}
		
		public class sample {
			public static void main(String[] args) {
				Animal cat = new Animal();
			}
		}
		// Animal Ŭ������ name�̶�� String������ �߰��ߴ�. �̷��� Ŭ������ ����� ������
		// ��ü������� �Ѵ�. ��ü������ �ν��Ͻ� ����, �������, �Ӽ��̶�� �Ѵ�. 
		// Ŭ������ ���� �����Ǵ� ���� ��ü, �׸��� �� Ŭ������ ����� ������ ��ü������� �����ϸ� ����.
		
		// ��ü������ ��������� ���� ��ü ������ ����� ����. ���� ��ü������ �����̹Ƿ� ���� ������
		// �� �ִ�. �����ϱ� ���� ��ü ������ ���� � ���� ������ �ִ��� ���� ����غ���.
		
		// ��ü������ ����Ϸ��� ��ü ������ ��� �����ؾ� �ϴ����� ���� �˾ƾ� �Ѵ�. 
		// ��ü������ ������ ���̵�Ʈ������(.)�� �̿��Ͽ� ������ �� �ִ�.
		
		// ��ü. ��ü����
		
		// ��, Animal cat = new Animal() ó�� cat�̶�� ��ü�� �����ߴٸ� �� Cat��ü��
		// ��ü���� name���� ������ ���� ������ �� �ִ�. 
		
		// cat.name // ��ü :cat ��ü����: name 
		// ���� ��ü ������ � ���� ���ԵǾ� �ִ��� ������ ���� ����غ���.
		class Animal {
			String name;
		}
		public class Sample {
			public static void main (String[] args) {
				Animal cat = new Animal();
				System.out.println(cat.name);
			}
			
		}
		// cat.name�� ����� ��� null�� ���Դ�. null�� ���� �Ҵ�Ǿ� ���� ���� ���¸� ���Ѵ�. 
		// ��ü ������ name�� ���������� �ƹ��� ���� ������ ���� �ʾұ� ������ null�̶�� ���� ���
		
		// �޼ҵ� 
		// ���� ��ü������ �����ϴ� ����� ���� ������ �Ҵ�Ǿ� ���� ���� ���¿� ���ؼ� �˰� �Ǿ���. 
		// ���� ��ü������ ���� �����ϴ� ����� ���ؼ� �˾ƺ���. ��ü������ ���� �����ϴ� �������
		// ���������� ������ ���� �������� �޼ҵ带 �̿��ϴ� ����� ���� �˾ƺ���
		// Ŭ�������� ��ü ������ ���Ҿ� �޼ҵ�(Method)��� ���� �ִ�. 
		// �޼ҵ�� Ŭ���� ���� ������ �Լ��� �ǹ��ϴµ� ���� �Լ���� ������ �ʰ� �޼ҵ���Ѵ�.
		// �޼ҵ带 �̿��Ͽ� Animal Ŭ������ ��ü ������ name �� ���� ������ 
		// �Ʒ��� ���� setName �޼ҵ带 �߰��� ����.
		class Animal {
		    String name;

		    public void setName(String name) {
		        this.name = name;
		    }
		}

		public class Sample {
		    public static void main(String[] args) {
		        Animal cat = new Animal();
		        System.out.println(cat.name);
		    }
		}
		// Animal Ŭ������ �߰��� setName �޼ҵ�� ������ ���� ������ �޼ҵ��̴�
		
		//�Է�: String name
		// ���: void (���ϰ� ����)
		// ��, �Է����� name�̶�� ���ڿ��� �ް� ����� ���� ������ �޼ҵ��̴�. 
		// �޼ҵ��� ����¿� ���� �ڼ��� ������ ���� �忡 �غ�Ǿ� �ִ�.
		
		// �̹����� setName �޼ҵ��� ���θ� ���캸��. setName �޼ҵ�� ������ ������ ������ �ִ�.
		//	this.name = name;
		// �� ���忡�� this�� ���ؼ� �����ϴ� ���� �� �߿��ϴ�. �� ���忡 ���� ������ ��� �����ϰ� 
		// �ϴ��� �켱 �� �޼ҵ带 ȣ�� �ϴ� ����� ���ؼ� ���� �˾ƺ���. 
		// ��ü ������ �����ϱ� ���ؼ� ��ü.���� �� ���� ��Ʈ������(.)�� ������ �� �־��� �Ͱ� ���������� 
		// ��ü�� �޼ҵ带 ȣ���ϱ� ���ؼ��� ��ü.�޼ҵ� �� ȣ���ؾ� �Ѵ�.
		// 	cat.setName("boby");
		
		// ���⼭ setName �޼ҵ��� �Է����� "boby"�� ���� ���ڿ��� �����ؾ� �Ѵ�. 
		// �ֳ��ϸ� setName�޼ҵ�� �Է��׸����� ���ڿ��� �ʿ�� �ϱ� �����̴�.
		
		// setName�޼ҵ带 ȣ���� �� �ֵ��� main�޼ҵ带 ������ ���� ������ ����.
		
			class Animal {
			    String name;
	
			    public void setName(String name) {
			        this.name = name;
			    }
			}
	
			public class Sample {
			    public static void main(String[] args) {
			        Animal cat = new Animal();
			        cat.setName("boby");  // �޼ҵ� ȣ��
			        System.out.println(cat.name);
			    }
			}
		
		
		// �̷��� �����ϸ� cat.name�� ����ϱ� ���� setName �޼ҵ尡 ���� ȣ�� �� ���̴�.
		//	��, ���� �Ʊ� ������ ��� ������ setName �޼ҵ��� ���� ������ �ٽ� ����.	
			
		//	this.name = name;
			
		// 	main�޼ҵ忡�� cat.setName("boby") �� ���� "boby"��� �Է°����� setName 
		//	�޼ҵ带 ȣ���߱� ������ setName�Լ��� �Է��׸� name���� "boby"��� ���ڿ��� ���޵� ���̴�.

		// ���� setName �޼ҵ��� this.name = name; ������ ������ ���� �ؼ��Ǿ� �� ���̴�.
			
		//	this.name = "boby";
			
		// setName �޼ҵ� ���ο� ���� this�� Animal Ŭ������ ���ؼ� ������ ��ü�� ��Ī�Ѵ�. 
		//	���� Animal cat = new Animal() �� ���� cat�̶�� ��ü�� ����� 
		//	cat.setName("boby") �� ���� cat��ü�� ���� setName �޼ҵ带 ȣ���ϸ� 
		//	setName �޼ҵ� ���ο� ����� this�� �ٷ� cat ��ü�� ��Ī�Ѵ�.
		
		// ���� this.name = "boby"; ������ �ٽ� ������ ���� �ؼ��ȴ�.
		
			//cat.name = "boby";
			
		// cat.name �� ���� �ϸ� ��ü ������ ������ �� ������ �츮�� �˰� �ִ�. 
		// ��ü ������ ���� �����ϴ� ����� ���� ����. �׳� ������ ���� �����ϴ� �Ͱ� �������� ����̴�.
			
		// 	��ü.��ü���� = ��
			
		// ���� cat.name = "boby"��� ������ ��ü cat�� ��ü���� name�� "boby"��� ���� �����Ѵ�.			
		// �ٽ� main �޼ҵ带 �ٽ� �����غ���. ������ ���� ���ڿ��� ��µǴ� ���� Ȯ���� �� ���� ���̴�.
		// cat.name�� ���� null�� �ƴ϶� "boby"���� Ȯ���� �� �ִ�.	
			
		// ��ü ������ �������� �ʴ´�
			// �̹����� main�޼ҵ带 ������ ���� ���� �� ����.
			class Animal {
			    String name;

			    public void setName(String name) {
			        this.name = name;
			    }
			}

			public class Sample {
			    public static void main(String[] args) {
			        Animal cat = new Animal();
			        cat.setName("boby");

			        Animal dog = new Animal();
			        dog.setName("happy");
			    }
			}
			// cat��ü���� "boby"��� �̸��� �����ϰ� dog��ü���� "happy"��� �̸��� �����ߴ�.
			// �̷��� �ϸ� setName �޼ҵ忡 ���� ������ ���� ������ �ι� ����� ���̴�.
			
			// cat.name = "boby";
			// dog.name = "happy";
			
			// �̷� ��� dog.name = "happy" ��� ������ ���߿� ����ǹǷ� 
			// cat.name�� ���� "happy"��� ������ ��������� ������?
			// Animal Ŭ������ ��ü���� name�� cat��ü�� dog��ü�� ���� �����Ǵ� ������� �Ƹ��� �׷����̴�.
			
			// ������ ���� Ȯ���� ����.
			class Animal {
			    String name;

			    public void setName(String name) {
			        this.name = name;
			    }
			}

			public class Sample {
			    public static void main(String[] args) {
			        Animal cat = new Animal();
			        cat.setName("boby");  // �޼ҵ� ȣ��

			        Animal dog = new Animal();
			        dog.setName("happy");

			        System.out.println(cat.name);
			        System.out.println(dog.name);
			    }
			}
			
			// ����� ������ ���� ��µǾ���.
			
				// boby
				// happy
			// ����� ���� name ��ü ������ �������� �ʴ´ٴ� ���� Ȯ���� �� �ִ�.
			// �� �κ��� ���� �ʹ��ʹ� �߿��ؼ� �����ϰ� �� �����ص� ����ġ�� �ʴ�. 
			// Ŭ�������� ���� �߿��� �κ��� �� �����ص� �� ��ü ������ ���� ���������� �����ȴٴ� ���̴�. 
			// ��� �� ���� �ٷ� Ŭ���� ������ �����̱⵵ �ϴ�. ��ü ������(Object Oriented)�̶�� 
			// ���� �ǹ̵� ���þ� ���� �ᱹ �� ��ü ������ ���� ���������� �����Ǳ� ������ ������ ���̴�.
			
	//	
}
}
