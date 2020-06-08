## final
`final`은 상수 처리할 때 사용하는 예약어이다
```java
final int a = 3; // 상수
```

## 오버플로와 언더플로
메모리 할당 공간 중 맨 앞 비트는 음/양을 나타내는 부호 => 0(0과 양수), 1(음수)
- 오버플로(overflow) : 최대치보다 큰 숫자를 저장하려고 할 때 발생하는 에러
- 언더플로(underflow) : 최소치보다 작은 숫자를 저장하려고 할 때 발생하는 에러

## new
`new`는 참조형 자료형에 메모리 공간을 할당할 때 사용한다.     
기본형 자료형(int, float 등)은 선언과 동시에 자동으로 메모리에 공간이 할당되지만,     
참조형 자료형은 메모리를 `new`로 할당해주지 않으면 사용할 수 없다.     
**String 자료형은 참조형이면서도 `new`를 사용하지 않는 특이 케이스이다**

## NUL
문자열의 맨 끝에는 `NUL`이 포함된다

## static
`static`이 붙으면 프로그램이 시작될 때 우선 메모리에 할당되기 때문에,     
`new`를 통한 **객체 초기화**가 필요없다.     
**단, static 메소드는 static 멤버변수만 사용가능하다.**

## BufferedReader와 throws Exception
`BufferedReader`를 사용할 때에는, 반드시 `throws Exception`을 사용해야 한다.

## String -> 기본 자료형 형변환
- `int iVal = Integer.valueOf(szBuf);`
- `double dVal = Double.valueOf(szBuf);`
- `char chVal = szBuf.charAt(i);`
  (char는 문자이기 때문에, i번째에 있는 character값을 리턴받는다.)

## String 관련 함수
비교 : `/*비교대상1*/.equals(/*비교대상2*/)`, return형 boolean     
길이 : `/*대상*/.length();`, return형 int     
분리 : `/*대상*/.split(/*기준*/);`, return형 String 배열

## 문자열 배열의 객체 생성
```java
public static void main(String[] args) {
    final int ArrayNum = 5; // 배열의 길이
    ClassExample[] Array = new ClassExample[ArrayNum]; // Array 배열의 길이만 지정
    for(int i=0;i<ArrayNum;i++) {
        Array[i] = new ClassExample(); // 이 때, 객체를 생성하게 됨
    }
    ...
}
```

## abstract
abstarct가 명시된 메소드 -> 추상화 메소드 -> 추상화 메소드가 있는 클래스 -> 추상 클래스(NEW!)     
**추상 클래스는 객체화 할 수 없다.**

## super
super 클래스 == 부모 클래스

## interface
다중 상속할 때 사용     
상수 변수(public static final)와 추상화 메소드(abstract public)만 사용 가능      
`extends` 대신 `implements` 사용

## try-catch
```java
try {
    /*런타임 에러가 날 만한 코드*/
} catch(/*런타임 에러 클래스*/ e) { // e라는 객체 선언해줘야 함
    /*런타임 에러 시 수행할 내용*/
}
```