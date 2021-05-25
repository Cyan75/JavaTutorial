package pack;
/*//ex97-1)
class AA{}
class BB extends AA{}
class CC extends AA{}

public class Hello {
    public static void main(String[] args) {
        //AA tttt1 = new BB();
        //AA tttt2 = new CC();
        AA tttt1 = new BB();
        tttt1 = new CC();
    }
}*/
/*
//ex97-2)
class A
{
    int num = 30;

    int run()
    {
        System.out.println("A run");
        return num; //30
    }
}

class B extends A
{
    A a;        //1번의 a를 백업하는곳 a = new A();
    int num = 20; //can have a variable with existing name of the parent class

    B(A a)
    {
        this.a = a;
    }

    @Override
    int run()
    {
        System.out.println("B run");
        return num + a.run(); //20 + 30
    }
}
class C extends A
{
    A a;        //a를 백업하는곳 a = new B(a);
    int num = 10;

    C(A a)
    {
        this.a = a;
    }

    @Override
    int run()
    {
        System.out.println("C run");
        return num + a.run(); //10 + 30
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        A a = new A(); //new A()는 아래줄에서 없어짐         //1번
        a = new B(a);  //B 생성자: B안에 원래 a값 저장해버림     //2번
        //completely different <code>a</code>
        //memory 확보먼저
        //이후 a를 그 memory 에 넣음
        //System.out.println(a.run());
        a= new C(a);        //a는 new B(a) 임
        a.run();
        //System.out.println(a.run());
    }
}*/

/*
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
}*/

/*//ex98-1) 변수만 다르고 형식은 같을 때 : 비효율적
class Tiger
{
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

class Lion
{
    private String data;

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger();
        tiger.setData(10);
        System.out.println(tiger.getData());
        Lion lion = new Lion();
        lion.setData("lion");
        System.out.println(lion.getData());
    }
}*/

/*//ex98-2) <>: 컨테이너
//<>안에 사용하고가 하는 type 명시하여 사용할 것
class Tiger<T>{
    private T data;

    public T getData()
    {
        return data;
    }

    public void setData(T data)
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
        t3.setData(3.14f);
        System.out.println(t3.getData());
        Tiger<Boolean> t4 = new Tiger<Boolean>();
        t4.setData(true);
        System.out.println(t4.getData());
    }
}*/



/*
//ex99) thread
import java.util.LinkedList;
class A{
    void start(){
        System.out.println("start call");
        run();
    }
    void run(){
        //System.out.println("A run call");
    }
}
class B extends A{
    @Override
    void run(){
        System.out.println("start thread");
        System.out.println("B run call");
        System.out.println("end thread");
    }
}
public class Hello
{
    public static void main(String[] args)
    {
        System.out.println(1);
        A a = new B();
        a.start();
    }
}*/


/*
//ex100)
//Thread is a standard java class
class Tiger extends Thread
{
    public void run()
    {
        System.out.println("start thread");
        System.out.println("Tiger run call");
        System.out.println("end thread");
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("start main");
        Thread t = new Tiger();
        // 't라는 thread를 지금부터 실행하세요'
        t.start();  //-------이후의 코드는 동시에 실행됨.
        // main 실행, Tiger.run() 동시에 실행됨
        //뭐가 먼저 실행될지는 OS 마음대로

        //1초 쉬는동안 다른놈 실행시킴
        try { Thread.sleep(1000); } catch (Exception e) { }
        System.out.println("end main");
    }
}*/


/*//ex101)
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
}*/



//ex102-1)
/*
import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        //키보드로부터 입력받고싶은경우
        Scanner sc = new Scanner(System.in);
        System.out.println(1000);
        //키보드로 숫자 입력 기다리는 함수
        sc.nextInt();
        System.out.println(2000);
    }
}*/
//ex102-2) ex102-1)과 같음
import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        System.out.println(1000);
        new Scanner(System.in).nextInt();
        System.out.println(2000);
    }
}