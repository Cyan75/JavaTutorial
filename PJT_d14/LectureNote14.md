### Thread

* 입력, Thread
```java
class Tiger extends Thread{
    public void run(){
        Thread t = new Lion();
    }
}
class Lion extends Thread{
    public void run(){

    }
}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("start");
        Thread t = new Tiger();
        t.start();

        new Scanner(System.in).nextInt();
        System.out.println("end");
    }
}
```
* blocking 함수: 프로그램이 더이상 진행하지 않고 멈추어있음
  * 조건을 달아서 성립되는 경우 실행하도록
  * `sleep(0)` thread.start() : thread 실행 block하는 함수
  * `accept()` connect() : 외부에서 (통신)접속하는 경우 접근을 block 하는 경우
  
