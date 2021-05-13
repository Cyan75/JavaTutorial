* 생성자
  * 생성자는 생성자함수의 줄임
  * 함수만들듯
  * 클래스이름과 동일
  * return 없음
  * object생성될때 자동으로 호출됨
  * 프로그래머가 임의로 호출 불가능
  * **목적 : 필드(멤버변수) 초기화 하는것**
    * 클래스 안에 있는 멤버(가족)를 initialise
#
```java
class Lion{
    public static void main(String[] args)
    {
        Airplane t = new Airplane(100);
        t.m1();
        System.out.println(t.a + " " + t.b);
    }
}
class Airplane
{
    // ZEROs unless they are initialised in CTOR
    //생성자 없이 initialise가능
    int a = 10, b = 20;
    int fuel = 100;

    //생성자의 initialisation이 가장 우선
    Airplane(int fuel)
    {
        a = 30;
        b = 40;
        System.out.println("ctor called");
    }
}
```
#
* object 마다 다른 변수를 가지고 instantiate 될 수 있도록 해주는 거죠 
  * 비행기의 연료가 100일 수도 있고 1000일 수 도 있는거죠
* 생성자는 변수 

> 컴파일
>  * 인간이 읽을 수 있는 것을 소스코드
>  * 컴퓨터가 알 수 있는 언어를 기계어
>  * 컴파일 : 인간의 언어를 기계언어로 번역하는 행위
>    * 컴파일 : 기계어로 번억하고 프로그램 실행시킴

#
* 생성자 있으면 생성자 안만듦
* 생성자 없으면 만듦
   * 생성자 없는 경우 컴파일 시 default 생성자 자동으로 만듦
   * 인수전달이 없는 생성자를 default 생성자 라고 함

* Method Overloading : 동일한 이름의 method 만드는법
  * 전달되는 인수의 종류가 다름
  * 전달되는 인수의 개수가 다름
  * 리턴되는 타입이 다름

#
```java
class Tiger
{
    int a, b; //field

    void m1(int a, int b)
    {
        //the same variable names
        this.a = a * 10;
        this.b = b * 20;
    }
    void show(){
        System.out.println(a + " " + b);
        System.out.println(this.a + " " + this.b);
    }
}
```
* 멤버 method의 변수명과 class의 변수명 같은경우
  * this 사용하여 field 사용가능

# 
* 클래스를 직접 만드는 일은 회사에서 거의 없음
* 남들이 만든 클래스를 사용하는 경우가 대부분 (98%)
* 남들이 만들어놓은 클래스 잘만들어 놓은것들이 많음 -> 배포
  * 배포하기 전 java 협회? 에서 클래스 잘 만들어졌는지, 문법 잘지켰는지, 문제없는지 검증
  * OK 받고 배포 : 표준클래스
* 자바를 잘한다는 클래스 잘만든다 보다는 **표준 클래스를 잘 활용한다** 에 가까움
* Eclipse에서 class인지 확인하는법: F3
* IntelliJ : ⌘ + click
#
```java
public static void main(String[] args)
    {
        //String is a class
        String str = "lion";
        String str2 = new String("lion"); //String is a class
        System.out.println(Short.MAX_VALUE); //Short is a class
    }
```
* 대문자로 시작하는것은 모두 표준 class이다!
#
* 상속: 기존에 만들어진 코드와 함께 내가 만든 코드를 모두 사용하는것 
  * 두개의 classes 있다고 할때, class A, class B가 연관되어 있을때 
  * class 안: 생성자, field, method
>* 다양한 도형을 만들어주는 `class Andrew`
>* Andre를 상속받아서 모레시계모양 만들 수 있음
>   * 기존에 만들어진 코드와 함께 내가 만든 코드를 모두 사용하는것

```java
class A
{
    void m1()
    {
        System.out.println("draw a star");
    }
}

class B extends A
{
    void m1()
    {
        System.out.println("draw an hourglass");
    }
}
```