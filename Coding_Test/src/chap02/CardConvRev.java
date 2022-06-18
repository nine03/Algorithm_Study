package chap02;
import java.util.Scanner;
// 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타낸다.

public class CardConvRev {
	// 정숫값 x를 r진수로 변환하여 배열d에 아랫자리부터 넣어주고 자릿수를 반환한다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		return digits;
	}
}
