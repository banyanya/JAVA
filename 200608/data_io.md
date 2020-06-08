# 데이터 입출력

## 클래스, 함수
- BufferedReader : 데이터를 입력받는 클래스
- InputStreamReader : 데이터를 입력받는 **방식**을 정해주는 클래스
- .readLine() : 입력되는 줄 전체를 string 형태로 반환해주는 함수
- .close() : **BufferedReader** 사용 후 해당 함수로 객체를 종료해주어야 함

- BufferedWriter : 컴퓨터가 데이터를 출력하는 클래스
- FileWriter : 파일에 데이터를 작성하는 클래스
- File(주소) : 사용할 파일의 주소를 매개변수로 입력받아, 해당 파일의 정보를 가지는 클래스
- .write() : 실제로 파일에 출력하는 함수

## 키보드 데이터 입력 1
```java
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
String input = scan.next();
```

## 키보드 데이터 입력 2
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true) {
    String str = br.readLine();
}
br.close();
```

## 데이터 -> 파일 (출력)
```java
BufferedWriter bw = new BufferedWriter(new FileWriter(new File(address)));
bw.write(출력할 문장);
bw.close();
```

## 파일 -> 데이터 (입력)
```java
BufferedReader br = new BufferedReader(new FileReader(new File(address)));
String str = br.readLine();
br.close();
```


# 클래스와 다형성

## 첫번째 예시
```java
class A {
    public void x() {return a;}
}
class B extends A {
    public void x() {return b;}
    public void y() {return c;}
}
public static void main(String[] args) {
    A cls = new B();
    System.out.println(cls.x());
}
```
1. B는 A를 **상속**받은 클래스이다.
2. B 클래스는 x()함수를 **오버라이딩**했다.
3. 57번째 줄에서 결과값은 **b**이다.
   (A의 껍데기를 가지고 있지만, 껍데기일 뿐 내용은 B)
4. 결과적으로 cls객체는 A의 멤버나, B에서 오버라이딩한 멤버만을 사용할 수 있다.
   (우선순위 : 오버라이딩 > 기존 멤버)

## 두번째 예시
``` java
class A {
    public void x() { return a; }
}
class B extends A {
    public void x() { return b; }
}
class C extends A {
    public void x() { return c; }
}
public static void main(String[] args) {
    A cls1 = new B();
    A cls2 = new C();

    System.out.println(cls1.x()); // 출력값은 b
    System.out.println(cls2.x()); // 출력값은 c
}
```
cls1과 cls2라는 두 개의 객체가 동일한 데이터 타입(A)으로 존재하면서,     
**오버라이딩을 통하여** 메소드가 각각의 클래스(B, C)에 정의되어 있는 (서로 다른)방식으로 동작된다