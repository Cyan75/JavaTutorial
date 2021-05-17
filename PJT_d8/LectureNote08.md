#

* new: 메모리 달라고 하는것
* static `a` : class 만들때부터 a의 메모리 하나 만들어짐, 메모리가 고정됨
  * static 나오면 무조건 **메모리가 하나 만들어져버린다** 라고 생각하면 됩니다.
* non-static `b` : new 해서 만드는 b는 new할때마다 메모리 만들어짐

* ex61)
```java
class Tiger{
    static int a = 0;
    int b = 0;
    Tiger(){
        a++;
        b++;
        }
    }
}
public class Client{
    public static void main(String[] arg){
        System.out.println(Tiger.a); // a의 메모리상 위치는 고정됨
        Tiger t1 = new Tiger(); //b는 obj 만들때(new 할때)마다 새로운 b가 만들어짐
        System.out.println(t1.a + " " + t1.b); //a = 1, b = 1
        Tiger t2 = new Tiger();
        System.out.println(t2.a + " " + t2.b); //a = 2, b = 1
        Tiger t3 = new Tiger();
        System.out.println(t3.a + " " + t3.b); //a = 3, b = 1
    }
}
```
> 컴파일 되었을때 메모리 모습은
> ```java
>static int a; //클래스 바깥에 나가버린다고 볼 수 있음
>class Tiger{    
>    int b;
>} 
> ```


* ex62)
```java
public class Hello{  //class 만으로는 메모리 안만들어짐
    
    int a;  //메모리 x
    static b;  // 메모리 o
    void m1(); //메모리 x
    static void m2(); // 메모리 o
    static void main(String[] arg){   //static: 메모리 만들어짐
    m1(); //메모리 안만들어진 상태이므로 error
    m2(); //static 이므로 가능
    }
}
```

   * class만으로는 메모리 생성 불가능(운영체제는 메모리 못만듦)
      * main 은 함수 **entry point**
      * 객체 만들기 전까지 메모리 못부름
      * 하지만 static 사용하면 메모리 만들라고 강제할 수 있음
   * static 함수 안에서는 static 변수, static 함수만 사용할 수 있음
      

* ex63)
```java
class Tiger{
    void m1(){
        System.out.println(1);
    }
    void m2(){
        Tiger t = new Tiger(); // class안의 함수에서 본 class의 obj 생성 할 수 있는가?: YES
        t.m1(); //1 출력
    }
}
public class Hello{  //class 만으로는 메모리 안만들어짐 
    void m3(){
        System.out.println(2);
    }
   static void main(String[] arg){
       Tiger t1 = new Tiger
       t1.m1(); //1 출력
       t2.m2(); //1 출력
       
       
       m3(); //static 아니기 때문에 사용 불가능
       Hello h = new Hello(); //자체 객체 생성 가능
       h.m3(); //

    }
}
```
* ex64)
 ```java
 abstract class A{
     void m1(){
         System.out.println(1);
     }
     void m2(){
         System.out.println(2); //overriden by derived method
     }
      abstract void m3();
         //not defined: 할일이 없는 백수입니다.
 }
 class B extends A{
     void m2(){
         System.out.println(22);
     }
     void m3(){
         System.out.println(33);  // 상속하는 class에서 백수(abstract)멤버 반드시 define 해주어야 함
     }
 }
 public class Hello{
     public static void main(String[] arg){
         A a = new B();
         a.m1();
         a.m2();
     }
 }
 ```
 * `abstract` : 백수에요. 할일이 없어요. 미완성
 * 
 * `abstract` method는 `abstract`class안에서만 존재할 수 있음
 * `abstract` class : 제 class안에는 `abstract` method가 하나 있어요
 * 상속하는 class에서 `abstract` method 반드시 정의해주어야 함
 * abstact method = pure virtual function 
 * 내가 안만들고 자식이 만듦


* ex66)
 ```java
 abstract class A{ //A 는 구현되지 않음
     abstract void m1(); 
 }
 class B extends A{
     void m1(){
     }
 }
 public class Hello {
     public static void main(String[] args){
         //
         A a = new A(); //A혼자로는 객체생성 x
     }
 }
 ```


* ex67)
```java
 interface A{ // 이러한 경우  abstract class 대신 interface라고 함
     // 스마트폰
     abstract void m1();// 추상함수
     abstract void m2(); 
     abstract void m3();
 }
 class B implements A{  //오직 A의 구현을 위한 class extends를 implements로 교체
    //아이폰, 안드로이드, 윈도우폰, ...
     public void m1(){
         System.out.print(1);
         }
     public void m2(){
         System.out.print(2);
         }
     public void m3(){
         System.out.print(3);
         }
 }
 public class Hello {
     public static void main(String[] args){
        }
 }
 ```

