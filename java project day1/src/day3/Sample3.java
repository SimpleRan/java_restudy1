package day3;

public class Sample3 {

	public static void main(String[] args) {
		// ��������
		// Q1
		// ���� �ڵ��� ��� ����� �����ϱ�? (������ �ؼ��ϰ� Ǯ���.)
		// public class Sample {
		//    public static void main(String[] args) {
		//        String a = "write once, run anywhere";
		//        if (a.contains("wife")) {
		//            System.out.println("wife");
		 //       } else if (a.contains("once") && !a.contains("run")) {
		 //           System.out.println("once");
		 //       } else if (!a.contains("everywhere")) {
		 //           System.out.println("everywhere");
		  //      } else if (a.contains("anywhere")) {
		 //           System.out.println("anywhere");
		  //      } else {
		  //          System.out.println("none");
		        }
		    }
		
		// anywhere 
	//	Q2
	//	while���� ����� 1���� 1000������ �ڿ��� �� 3�� ����� ���� ���� ����.
		//public class Sample {
		 //   public static void main(String[] args) {
		 //       int result = 0;
		 //       int i = 1;
		   //     while (i <= 1000) {
		     //       if (i % 3 == 0) { 
		   //             result += i;
		   //         }
		   //         i += 1;
		   //     }
		   //     System.out.println(result); 
		 //   }
		//}
		// 166833
		
	// Q3.
	// while�� �Ǵ� for ���� ����Ͽ� ������ ���� ��(*)�� ǥ���ϴ� ���α׷��� �ۼ��� ����.
	//	public static void main1(String[] args) {
	  //      int i = 0;
	  //      while (true) {
	  //          i += 1;  
	   //         if (i > 5) {  
	   //             break;
	  //          }
	   //         for (int j = 0; j < i; j++) {  
	   //             System.out.print('*');  
	    //        }
	    //        System.out.println("");  
	     //   }
	    //}

		// Q4.
		// for���� ����� 1���� 100������ ���ڸ� ����� ����.
		 //   public static void main11(String[] args) {
		 //       for (int i = 1; i < 101; i++) {
		 //           System.out.println(i);
		 //       }
		 //   }
		
		// Q5.
		// for each ���� ����Ͽ� A �б��� ��� ������ ���� ����.

		// A �б޿� �� 10���� �л��� �ִ�. �� �л����� �߰���� ������ ������ ����.		
		// int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		// for each ���� ����Ͽ� A �б��� ��� ������ ���� ����.
		public static void main111(String[] args) {
			int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
			int total = 0;
			for (int mark: marks) {  
				total += mark;  
			}
			float average = (float) total / marks.length;  
			System.out.println(average);  
				}
			}
