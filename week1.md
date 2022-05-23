알고리즘(algorithm) 

알고리즘(algorithm)은 주어진 문제를 논리적으로 해결하기 위해 필요한 절차, 방법, 명령어들을 모아놓은 것이다. 넓게는 사람 손으로 해결하는 것, 컴퓨터로 해결하는 것, 수학적인 것, 비수학적인 것을 모두 포함한다.


세 값의 최댓값

![f950ce0d8ac974de055def68042ebe6](https://user-images.githubusercontent.com/60682087/169775320-bd9f1668-b752-4132-bfc3-c64267019344.png)

세 문장이 아래로 나란히 있다면 이 문장은 순서대로 실행된다. 이렇게 여러 문장(프로세스) 이 순차적으로 실행되는 구조를 순차적(concatenation) 구조라고 한다. 그런데 (max에 a값을 넣는다.)은 단순한 대입이지만 (b값이 max보다 크면 max에 b값을 넣는다. ), (c값이 max보다 크면 max에 c값을 넣는다.) 은 if문이다. ()안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection) 구조라고 한다. 

키보드로 숫자와 문자열을 입력하는 방법은 다음과 같다. 

```
import java.util.Scanner; // a
  class A{
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in); // b
      stdIn.nextInt(); // c
    }
  }
```

a. java.util 패키지에 있는 Scanner 클래스를 프로그램에 포함시킨다. <br>
b. main 메서드 맨 앞에 작성한다. System.in은 키보드와 연결된 표준 입력 스트림(standard input stream)이다. <br>
c. stdIn.nextInt()가 호출되면 키보드로 입력한 정수값을 얻을 수 있다. <br>

키보드로 입력한 정수값을 변수에 저장하는 과정은 다음과 같다. 입력값은 int형의 범위인 -2,147483,648 ~ 2,147,483,647로 제한한다. 그리고 알파벳이나 기호 등은 입력할 수 없다. stdIn은 키보드와 연결된 표준 입력 스트림(System.in)에서 문자나 숫자를 꺼내는 장치 역할을 한다. 변수명 stdIn은 다른 이름으로 바뀌도 된다. 

세 값의 최댓값을 구하는 순서를 이해하기 쉽게 그림으로 나타내 보겠다. 이런 그림은 여러 종류가 있으며, 여기서는 순서도(flowchart)를 사용한다. 다음은 세 값의 최댓값을 구하는 순서도이다. <br>

![de7564c0de1db25a0b5b47af772c2b1](https://user-images.githubusercontent.com/60682087/169782565-cd3a710d-484f-4b12-8fce-9197657ac0da.png)

세 값의 최댓값을 구하는 알고리즘의 순서도 

키보드로 숫자와 문자열 입력하기 

키보드로 int형의 정숫값을 입력해보았다. 이때 호출하는 메서드(method)는 자료형에 따라 구분해야 한다. 입력할 자료형에 따라 호출해야 하는 메서드는 다음과 같다. 


|메서드|자료형|입력값의 범위|
|------|---|---|
|nextBoolean()|boolean|true 또는 false|
|nextByte()|byte|-128 ~ +127|
|nextShort()|short|-32768 ~ +32767|
|nextInt()|int|-2147483648 ~ +2147483647|
|nextLong()|long|-9223372036854775808 ~ +9223372036854775807|
|nextFloat()|float|+-3.40282347E+38 ~ +-1.40239846E-45|
|nextDouble|double|+-1.79769313486231507E+378 ~ +-4.94065645841246544E-324|
|next()|String|문자열(스페이스, 줄 바꿈 문자로 구분)|
|nextLine()|String|문자열 1줄|



- 这个项目是我为了重新学习Algorithm而做的项目（이 프로젝트는 내가 Algorithm를 다시 공부하기위해서 만든 프로젝트입니다.）
