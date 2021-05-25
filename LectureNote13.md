## Design Pattern

### Decoration Pattern
* 클래스를 상속받아 포함관계 형성함
* 요소를 하나하나 얹어가는
```java
class Coffee
{
    int num = 30;

    int price()
    {
        System.out.println("order a coffee");
        return num; //30
    }
}

class Sugar extends Coffee
{
    Coffee a;        //1번의 a를 백업하는곳 a = new A();
    int num = 20; //can have a variable with existing name of the parent class

    Sugar(Coffee a)
    {
        this.a = a;
    }

    @Override
    int price()
    {
        System.out.println("add sugar");
        return num + a.price(); //20 + 30
    }
}

class Cream extends Coffee
{
    Coffee a;        //a를 백업하는곳 a = new B(a);
    int num = 10;

    Cream(Coffee a)
    {
        this.a = a;
    }

    @Override
    int price()
    {
        System.out.println("add cream");
        return num + a.price(); //10 + 30
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        Coffee customer = new Coffee();
        customer = new Sugar(customer);
        customer = new Cream(customer);
        customer = new Sugar(customer);
        System.out.println(customer.price());
    }
}
```

> 우클릭 generate generate getter and setter

> 컨테이너 라는것을 표현하고 싶을때 "< >" 사용 :  generic type
> * 컨테이너 사용할 때 <>안에 사용하고자 하는 type 명시하여 사용할 것
>  * 컨테이너 안에는 객체만 사용할 수 있음(표준타입 바로사용 불가능)
```java
class Tiger<T>{
    private int data;

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }
}
public class Hello
{
    public static void main(String[] args)
    {
        Tiger<Integer> t1 = new Tiger<Integer>();
        //LinkedList<Integer> mm = new LinkedList<Integer>(); 와 동일한 형태
        t1.setData(10);
        System.out.println(t1.getData());
        Tiger<String> t2 = new Tiger<String>();
        t2.setData("tiger");
        System.out.println(t2.getData());
        Tiger<Float> t3 = new Tiger<Float>();
        t3.setData(3);
        System.out.println(t3.getData());
        Tiger<Boolean> t4 = new Tiger<Boolean>();
        t4.setData(true);
        System.out.println(t4.getData());
    }
}    
```
### Thread
* CPU 하나라고 가정
  * CPU가 하는 연산은 단 하나 : addition(+)
* 동시에 여러 작업을 어떻게 하는가(메모장, 그림판, 문서편집, 음악, 웹 등등의 응용프로그램)
  * 각 응용프로그램의 코드가 각각 있을것
  * CPU는 각 코드의 일부를 실행
  * 어떤 코드를 얼마나 실행시키는지는 OS(운영체제)마음
  * 각 응용프로그램을 쪼개서 실행하는중이지만 너무빨라서 (한줄당 1 pico sec정도) 동시에 실행중인것 처럼 보임 : 멀티태스킹
* OS 의 job scheduling : Main 2줄, Apple 4줄, Orange 2줄 ... 
  * main
  * thread1 : apple
  * thread2 : orange
  * ...
* 동시다발적으로 실행되는것처럼 보이는 프로그래밍 : **thread** programming 또는 병렬 프로그래밍
* 하나하나 처리하는것 처럼 보이는 것 하나를 thread라고 한다
* 직렬프로그래밍 : 하나끝내고 다음것

#### Thread Program의 형식
```java
//ex101)
class Tiger extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; ++i){
            System.out.println("tiger" + i);
            //sleep(0)은 쉬지 말라는 뜻이 아니라
            // 가능한한 최대한 짧게 쉬세요 라는 뜻
            try { Thread.sleep(0); } catch (Exception e) { }
        }
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("start main");
        Thread t = new Tiger();
        t.start();
        for (int i = 0; i < 10; ++i){
            System.out.println("elephant" + i);
            //sleep(0)은 쉬지 말라는 뜻이 아니라
            // 가능한한 최대한 짧게 쉬세요 라는 뜻
            try { Thread.sleep(0); } catch (Exception e) { }
        }
        System.out.println("end main");
    }
}

```

* windows - view - others - debug - debug 에서 여러개 프로그램 실행중인 경우 terminate and remove