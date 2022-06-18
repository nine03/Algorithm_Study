package chap04;

public class IntStack1 {
	private int max; // 스택 용량 
	private int ptr; // 스택 포인터 
	private int[] stk; // 스택 본체 
	
	// 실행 시 예외 : 스택이 비어 있음 
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	// 실행 시 예외 : 스택이 가득참 
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	// 생성자 
	public IntStack1(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch(OutOfMemoryError e) { // 생성할 수 없음 
			max = 0;
		}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) // 스택이 가득참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
}
