package chap01;
import java.util.Scanner;
// 1,2, ... , n의 합을 구한다(양수만 입력).

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구한다.");
		
		do {
			System.out.print("n의 값: ");
			n = sc.nextInt();
		}while (n <= 0);
		
		int sum = 0; // 합
		
		for(int i = 0; i <= n; i++) {
			sum += i;  // sum에 i를 더한다.
			
			System.out.println("1부터 " + n + "까지의 합은" + sum + "이다.");
		}
	}
}
