스택(stack) <br>
스택은 데이터를 일시적으로 저장하기 위해 사용하는 자료구조로, 데이터의 입력과 출력 순서는 후입선출(LIFO, Last In First Out)이다. (가장 나중에 넣은 데이터를 가장 먼저 꺼낸다). <br>
스택에 데이터를 넣는 작업을 푸시(push)라 하고, 스택에서 데이터를 꺼내는 작업을 팝(pop)이라고 한다. 테이블에 겹겹이 쌓은 접시처럼 데이터를 넣는 작업도 꺼내는 작업도 위쪽부터 수행한다. 이렇게 푸시와 팝을 하는 위치를 꼭대기(top)라 하고, 스택의 가장 아랫부분을 바닥(bottom)이라고 한다.

스택 만들기 <br>
스택 본체용 배열 : stk <br>
푸시된 데이터를 저장하는 스택 본체의 배열이다. 인덱스 0인 요소가 스택의 바닥(bottom)이다. 가장 먼저 푸시된 데이터를 저장하는 곳은 stk[0]이다.

```
class IntStack {
    int max; // 스택 용량
    int ptr; // 스택 포인터
    int[] stk; // 스택의 본체
}
```

스택 용량 : max <br>
스택의 용량(스택에 쌓을 수 있는 최대 데이터 수)을 나타내는 필드이다. 이값은 배열 stk의 욧솟수와 같다.

스택 포인터 : ptr <br>
스택에 쌓여 있는 데이터 수를 나타내는 필드이다. 이 값은 스택 포인터(stack pointer)라고 한다.

생성자 IntStack <br>
생성자는 스택 본체용 배열을 생성하는 등 준비 작업을 수행한다. 생성 시 스택은 비어 있으므로(데이터가 하나도 쌓여 있지 않은 상태) 스택 포인터 ptr 값을 0으로 한다. 그리고 매개변수 capacity로 전달받은 값을 스택 용량을 나타내는 max에 복사하고 요솟수가 max인 배열 stk의 본체를 생성한다. 따라서 스택 본체의 개별 요소는 바닥부터 stk[0], stk[1], ... stk[max - 1]이 된다.

푸시 메서드 push <br>
스택에 데이터를 푸시하는 메서드이다. 스택이 가득 차서 푸시할 수 없는 경우 예외 OverflowIntStackException을 던진다(throw). <br>
예외 처리를 빼면 실질적으로는 1행만으로 된 메서드이다. 전달받은 데이터 x를 배열 요소 stk[ptr]에 저장하고, 스택 포인터를 증가(increment)시킨다. 메서드의 반환값은 푸시한 값이다. 클래스 IntStack의 생성자와 메서드를 사용하여 스택 작업을 수행하면 스택 포인터 ptr 값은 반드시 0 이상 max이하가 된다. 따라서 스택이 가득 찼는지에 대한 검사는 관계 연산자(>=)가 아니라 등가 연산자(==)를 사용하여 다음과 같이 수행할 수 있다.

```
if(ptr == max)
```

그러나 프로그래밍 실수와 같은 원인으로 인하여 ptr 값이 잘못 입력되면 max를 초과할 수도 있다. 하지만 위와 같이 부등호로 판단하면 스택 본체 배열의 상한과 하한을 벗어나서 접근하는 것을 막을 수 있다. 간단한 코드 수정이지만 이런 노력으로 프로그램의 안정성을 높일 수 있다.

팝 메서드 pop <br>
스택의 꼭대기에서 데이터를 팝(제거)하고 그 값을 반환하는 메서드이다. 스택이 비어 있어 팝을 할 수 없는 경우 예외 EmptyIntStackException을 던진다(throw). 스택 포인터 ptr의 값을 감소시키고(decrement) 그때 stk[ptr]에 저장되어 있는 값을 반환한다.

피크 메서드 peek <br>
스택의 꼭대기에 있는 데이터를 몰래 엿보는 메서드이다. 스택이 비어 있는 경우 예외 EmptyIntStackException을 던진다(throw). 스택이 비어 있지 않으면 꼭대기의 요소 stk[ptr - 1]의 값을 반환한다. 이때 데이터의 입력과 출입이 없으므로 스택 포인터는 변환하지 않는다.

검색 메서드 indexOf <br>
스택 본체의 배열 stk에 x와 같은 값의 데이터가 포함되어 있는지, 포함되어 있다면 배열의 어디에 들어 있는지를 조사하는 메서드이다. 검색은 꼭대기 쪽에서 바닥 쪽으로 선형 검색을 수행한다. 배열 인덱스가 큰쪽에서 작은 쪽으로 스캔한다. 검색에 성공하면 찾아낸 요소의 인덱스를 반환하고, 실패하면 -1을 반환한다.

스택의 모든 요소를 삭제하는 메서드 clear <br>
clear 메서드는 스택에 쌓여 있는 모든 데이터를 삭제하는 메서드이다. 스택에 대한 푸시와 팝 등 모든 작업은 스택 포인터를 바탕으로 이루어진다. 따라서 스택의 배열 요솟값을 변경할 필요가 없다. 모든 요소의 삭제는 스택 포인터 ptr값을 0으로 하면 끝난다. 

용량을 확인하는 메서드 capacity <br>
capacity 메서드는 스택의 용량(max의 값)을 반환하는 메서드이다. max값을 그래도 반환한다.

데이터 수를 확인하는 메서드 size <br>
size 메서드는 현재 스택에 쌓여 있는 데이터 수(ptr의 값)를 반환하는 메서드이다.

스택이 비어 있는지 검사하는 메서드 IsEmpty <br>
IsEmpty 메서드는 스택이 비어 있는지 검사하는 메서드이다. 스택이 비어 있으면 true, 그렇지 않으면 false를 반환한다. 

스택이 가득 찼는지 검사하는 메서드 IsFull <br>
IsFull 메서드는 스택이 가득 찼는지 검사하는 메서드이다. 스택이 가득 찼으면 true, 그렇지 않으면 false를 반환한다.

스택 안에 있는 모든 데이터를 표시하는 메서드 dump <br>
스택에 쌓여 있는 모든 데이터를 바닥에서 꼭대기 순으로 표시하는 메서드이다. 스택이 비어 있으면 '스택이 비어 있습니다.'라고 표시한다.


- 这个项目是我为了重新学习Algorithm而做的项目（이 프로젝트는 내가 Algorithm를 다시 공부하기위해서 만든 프로젝트입니다.）