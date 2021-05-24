## Design Pattern
* 23가지 패턴으로 프로그램 짜면 적절히 우리가 사용할 수 있는 형태로 설계됨 -> framework
* upcasting : 자식 class가 부모 class type으로 캐스팅 되는 것

### Framework(골격)
  * 가장 simple한 framework는 4개 함수로 구성할 수 있음
  * tetris game 만든다고 합시다.
    1. initialise()x=10,y=20  
    * while로 묶임  
        2. dataUpdate() x++, y--  
        3. draw()
    4. cleanUp() : 사용한 메모리 지워줌  
    * 하드웨어, 네트워크 등등  
  * 가장 기본이 되는 공통요소 

### Patterns :  3일정도에 하나씩 뭔지 찾아보기
  1. 전략패턴(strategy pattern) : 특정 알고리즘 정의 , 각 알고리즘 캡슐화, 해당 계열안에서 알고리즘끼리 상호교체가능
  1. 옵저버패턴(observer pattern) : 옵저버의 목록을 객체에 등록하여 상태변화 있을때 마다 method 통하여 객체가 각 옵저버에게 통지하도록
  1. 싱글톤 패턴 : 객체 한개 생성까지는 허용, 두번째 객체부터 못만들도록


### 데이타 은닉 
* 객체 지향에서는 class 외부에서 멤버 사용하는것을 꺼림
* class의 역할을 보여주면 됨. 내부의 기능에 대해 드러내지 않음.
* `private` 생성자, 메쏘드, 필드
* 바깥에서 사용하기 싫어!!!


### Singleton
```java
class Apple
{
    private static Apple ins = null;

    private Apple()
    {
    } //객체 만드려고 하는데 바깥에서 생성자 호출이 안되네요

    //static: memory 자동으로 만들어버림
    //null : 객체 받은적 없음
    public static Apple getInstance()
    {
        if (ins == null)
        {
            ins = new Apple();
        }
        return ins;
    }

    void m1()
    {
        System.err.println("call method");
    }
}
class Banana{ }
public class Hello
{
    public static void main(String[] args)
    {
        Apple a1 = Apple.getInstance();
        Apple a2 = Apple.getInstance();//동일한 객체, ins != null
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());//같은 주소
        a1.m1();
        a2.m1();
        System.out.println((a1 == a2) ? "o" : "x");// == : 두 객체가 동일한지 물어보는 것.
        Banana b1 = new Banana();
        Banana b2 = new Banana();
        System.out.println((b1 == b2) ? "o" : "x");
    }
}
```

### 파일 입출력
* 파일 쓰기
```java
import java.io.*;
public class Hello
{
    public static void main(String[] args)
    {
        try
        {
            Writer w = new FileWriter("anotherTest.txt");
            for (int i = 0; i < 6; ++i)
            {
                for (int j = 0; j < 8; ++j)
                {
                    if ((i + j) % 2 == 0)
                    {
                        // even
                        w.write("o ");
                    }
                    else
                    {
                        // odd
                        w.write("x ");
                    }
                }
                w.write("\n");
            }
            w.close();
        } catch (Exception e)
        {
            //TODO : handle exception
        }
    }
}
```
* 파일 읽기: **-1**은 읽을 것이 없다는 뜻
```java
import java.io.*;

public class Hello
{
    public static void main(String[] args)
    {
        try
        {
            Reader r = new FileReader("anotherTest.txt");
            while (true)
            {
                int readData = r.read();
                if (readData == -1) //nothing to read
                {
                    System.out.println("all read.");
                    break;
                }
                System.out.println((char) readData);
            }
            r.close();// 읽던 쓰던 file 닫아주어야 함
        } catch (Exception e)
        {
            //TODO : handle exception
        }
    }
}
```

#### Annotation
* compiler에게 typo 발생할 시 에러 띄워달라는 표시를 하기위한 것.
* overriding할 함수에 적어놓으면 함수의 이름이 달라 overriden 안되었을때 에러 표시해줌
```java
class A
{
    void greenColour(){}
}
//greenColour overriding 시도
//typo occurred
//not aware of the typo
class B extends A
{
    @Override
        //혹시 typo 발생시 error 발생시킬것
    void redColour(){}
}
```