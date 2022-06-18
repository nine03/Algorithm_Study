package chap01;

import java.util.Scanner; // a 전체 프로그램 앞머리 (클래스 선언보다 앞)에 작성한다.
// 3개의 정숫값을 입력하고 최댓값을 구한다.

public class Max3 {
	 public static void main(String[] args) {
		 Scanner stdIn = new Scanner(System.in); // b main 메서드의 앞머리 (키보드 값을 입력 받는 c보다 앞)에 작성한다.
		 stdIn.nextInt(); // 키보드로 입력한 값 중 '정수값' 을 얻어낸다. 
		 
		 System.out.println("세 정수의 최댓값을 구합니다.");
		 System.out.println("a의 값: ");
		 System.out.println("b의 값: ");
		 System.out.println("c의 값: ");
		 
		 int a = stdIn.nextInt();
		 int b = stdIn.nextInt();
		 int c = stdIn.nextInt();
		 
		 int max = a; // max에 a값을 넣는다.
		 if(b > max) max = b; // b값이 max보다 크면 max에 b값을 넣는다. 
		 if(c > max) max = c; // c값이 max보다 크면 max에 c값을 넣는다. 
		 
		 System.out.println("최댓값은 " + max + "입니다.");
	}
}
