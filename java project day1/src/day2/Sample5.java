package day2;

public class Sample5 {

	public static void main(String[] args) {
		// switch/case �� - if ���� ��������� �� �� ����ȭ�� ���� �Ǵܹ��̴�.

		// switch/case ���� ������ ������ ����
		// switch(�Էº���) {
	    // case �Է°�1: ...
	    //     break;
	    // case �Է°�2: ...
	    //     break;
	    // ...
	    // default: ...
	    //     break;
		//	}
		// �Էº����� ���� ��ġ�ϴ� case �Է°�(�Է°�1, �Է°�2, ...)�� �ִٸ� 
		// �ش� case���� ���� ������� ����ȴ�. case������ break ��� ������ �ִµ� 
		// �ش� case���� ���� �� �� switch���� ���������� ���� ���̴�. 
		// ���� break ���� ���� �ִٸ� �� ������ case ���� ����ȴ�.
		
		// switch/case ���� ���� �� �������ִ� ������ ���� ����.
		public class Sample {
			public static void main(String[] args) {
				int month = 8;
				String monthString = "";
				switch (month) {
					cass 1 : monthString ="January";
							 bareak;
					cass 2 : monthString ="February";
							 bareak;
					cass 3 : monthString ="March";
							 bareak;
					cass 4 : monthString ="April";
							 bareak;
					cass 5 : monthString ="May";
							 bareak;
					cass 6 : monthString ="June";
							 bareak;
					cass 7 : monthString ="July";
							 bareak;
					cass 8 : monthString ="August";
							 bareak;
					cass 9 : monthString ="September";
							 bareak;
					cass 10 : monthString ="October";
							 bareak;
					cass 11 : monthString ="November";
							 bareak;
					cass 12 : monthString ="December";
							 bareak;
					default : monthString ="Invalid month";
							 bareak;
				}
				System.out.println(monthString);
			}
		}
		// switch���� �Է��� 1�̸� "January"��� ���ڿ���, 12�� "December"��� ���ڿ��� ��µǴ� 
		// �����̴�. ���� ���� month�� 8�� �����Ǿ� �ֱ� ������ "August"��� ���ڿ��� ��µ� ���̴�. 
		// �� switch���� month�� ���� 1�̸� case 1: ������ ����ǰ� 2�̸� case 2: ������, 
		// 3�̸� case 3: ... �̷������� ����ǰ� �ȴ�. ���� month�� 
		// 1���� 12������ ���ڰ� �ƴ� �ٸ� ���� ����Ǿ� �ִٸ� default: ������ ����ȴ�.

		// ���� ���� �Է°��� ����ȭ�Ǿ� �ִ� ��� if�����ٴ� switch/case���� ���°��� 
		// ���������� �� �� �����ϴ�
		
		//�� switch/case���� if else ������ ������ ���������� if else ������ �ۼ��� 
		// ��� �ڵ带 switch ������ ������ ���� ����.
	}

}
