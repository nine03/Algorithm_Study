package chap01;
import java.util.Scanner; 
// 1, 2, ... , n의 합을 구한다. 

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.print("n의 값:");
		int n  = sc.nextInt();
		
		int sum = 0; // 합
		int i = 1;
		
		while(i <= n) { // i가 n 이하면 반복한다.
			sum += i; // sum에 i를 더한다.
			i++;    // i값을 1만큼 증가시킨다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "이다.");
	}
}
