

* 함수 인수전달을 하는 것 보다 하지 않는 것을 권장, 구태여 전달할 필요 없음

* ex73)
```java

package pack;

public class Baduk
{
    AI ai;
    Baduk(AI ai)
    {
        this.ai = ai;
        System.out.println("start game");
    }
    void play(){
        ai.play();
    }
    void end(){
        ai.end();
        System.out.println("end game");
    }
    public static void main(String[] args)
    {
        System.out.println("hello");
        Baduk baduk1 = new Baduk(new AlphaGo());
        baduk1.play();
        Baduk baduk2 = new Baduk(new BetaGo());
        baduk2.play();
        //baduk.play(new GammaGo());
    }

}

interface AI
{
    void play();
    void end();
}

class AlphaGo implements AI
{
    public void play()
    {
        System.out.println("vs. AlphaGo");
    }
    public void end(){
        System.out.println("calculating...");
    }
}

class BetaGo implements AI
{
    public void play()
    {
        System.out.println("vs. BetaGo");
    }
    public void end(){
        System.out.println("calculating...");
    }
}


class GammaGo implements AI
{
    public void play()
    {
        System.out.println("vs. GammaGo");
    }
    public void end(){
        System.out.println("calculating...");
    }
}

```
* ex75)

```java 
package pack;

public class Hello
{
    public static void main(String[] args){
        System.out.println("tiger1");
        try{
            System.out.println(4/0);
        }catch (Exception e){
            //TODO : handle exception
        }
    }
}
```
* `try-catch`
  * try 문제 없으면 catch 안으로 가지 않음
  * 이상현상 발생 시 catch 안으로 가고 프로그램 중단되지 않음

* `throw`
  * 프로그래머가 직접 예외 발생시킴

* `throws Exception`
  * 예외 처리는 함수를 호출한 놈이 해결하세요
  
  ```java
  public class Hello{
      public static void main(String[] args)
      {
          Tiger t = new tiger();
          t.f1();
          System.out.println();
          try {
              //unhandledException
          }catch(Exceptio e){
              =
          }
      }
  }
  ```


