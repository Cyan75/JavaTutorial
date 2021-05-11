

* 표준 Type : 메모리 달라고 하는 명령어  가능한 적은 양의 메모리를 달라고 하는 명령어를 쓰면 유리
  * byte : 1개 
  * short : 2개, 음수, 양수 모두가능
  * int : 4개
  * long : 8개
  * char : 2개, 음수 불가능, 문자 한개
    * String : 문자열(표준 x)
  * float : 4개
  * double : 8개
  * boolean : 1개

```java
package pack
public class Hello
{
    public static void main (String[] arg)
    {
        short a;
        char b;
        char c = 65;    //문제는 되지 않지만 원 용도는 문자 저장용
        char d = 'A';   //d는 실제 65라는 값을 가짐, 결과적으로 c,d 는 같은 값을 가짐
                        //문자 하나는 single quotation
                        //문자가 변환기 거쳐 숫자로 환산하여 메모리에 저장
                        // 영어는 ASCII, 한글은 유니코드
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println(c);  //A
        System.out.println(d);  //A
        System.out.println((int)d);  //65 
                                     //d 너는 원래는 char 인데 지금 이 순간만은 char가 아닌 int야
        char gg = '한';
        System.out.println(gg); // 한 >> 유니코드 54620
        System.out.println((int)gg); // 54620
    }
}
```

* 메모리 전구 8개로 생각
* 각 전구는 on/off 둘 중 하나의 상태만 가짐: bit 상태
  * 삶과 죽음, 흐름과 멈춤
  * 전구 1개인 경우 1bit 상태
  * 전구 4개인 경우 4bit 상태
  * 전구 8개인 경우 8bit 상태 = 1byte
* int는 4 byte 이므로 32 bit를 달라고 하는것과 같음

```java
public class Hello
{
    public static void main (String[] arg)
    {
        int aa = 30;
        float bb = 34.56f; //float은 숫자 마지막에 f붙여주어야 함
        System.out.println(aa);
        System.out.println(bb);
        double cc = 34.56; //소수점 숫자 중 f 없는 경우 double임
        System.out.println(cc);
    }
}
```

* 논리 연산자
  * OR(||) : 둘중 하나라도 true 이면 return true
  * AND(&&) : 둘다 true 여야만 return true
```java
public class Hello
{
    public static void main (String[] arg)
    {
        //                  레벨       key    둘중 하나만 참인 경우 성문 open되는 게임
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);

        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);

        int level = 50;
        int key = 2;
        //                      false      true
        System.out.println(level > 60 || key != 0);
        //                      true      true
        System.out.println(level > 40 && key != 0);
    }
}
```

* 제어문(if, for, while, switch): 컴퓨터에게 물어보고 답을 얻는다
  * 공통점은 (){}
  * 제어문 안에 제어문 사용 가능
  * 
  1. if 문
   ```java
  if(true) 
  {  
      System.out.println("shown");
  }
  if(false) 
  {  
      System.out.println("not shown");
  }
  ``` 
  ```java
  int num2 = 52;
  if (num2 % 2 == 0)
  {
      //짝수인경우
      if(num2 % 5 == 0)
      {
          //5의 배수인 경우
      }
  }
  ```


  2. for 문
  ```java
  for(true) 
  {  
      System.out.println("shown");
  }
  ```  
  3. while 문
   
  4. switch 문
