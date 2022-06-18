package chap01;
import java.util.Scanner;
//입력한 정숫값이 양수인지 음수인지 0인지 판단한다. 

public class JudgeSign123A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.:");
		int n = sc.nextInt();
		
		if(n == 1)
			System.out.println("이 수는 1입니다.");
		if(n == 2)
			System.out.println("이 수는 2입니다.");
		if(n == 3)
			System.out.println("이 수는 3입니다.");
	}
}
