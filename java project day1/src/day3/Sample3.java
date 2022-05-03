package day3;

public class Sample3 {

	public static void main(String[] args) {
		// 연습문제
		// Q1
		// 다음 코드의 출력 결과는 무엇일까? (눈으로 해석하고 풀어보자.)
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
	//	while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
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
	// while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
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
		// for문을 사용해 1부터 100까지의 숫자를 출력해 보자.
		 //   public static void main11(String[] args) {
		 //       for (int i = 1; i < 101; i++) {
		 //           System.out.println(i);
		 //       }
		 //   }
		
		// Q5.
		// for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.

		// A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.		
		// int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		// for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
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
