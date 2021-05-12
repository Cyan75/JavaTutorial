package pack;

//ex30
/*
class Airplane //name of the class starts with a CAPITAL
{
    //--------these are MEMBER s of the class
    //1. member variables == fields
    int num; //number
    int ct; //count
    int test;
    //2. constructor
    //3. member methods == functions
}
*/
/*
//ex31

public class Hello
{
    public static void main(String[] arg)
    {
        //class name       object           instantiate!  class name
        Airplane a1 = new Airplane();
        //int[] ar = new int[10];
        a1.num = 10;
        a1.ct = 20;
        System.out.println(a1.num + a1.ct);
        System.out.println(a1.num + " " + a1.ct);
        //undefined fields are set to be 0 as default;
        System.out.println(a1.test);
    }
}
*/
//ex32
/*public class Hello
{
    public static void main(String[] arg)
    {
        //different tigers
        Tiger t1 = new Tiger();
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        Tiger t2 = new Tiger();
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
        //. member selection operator
        System.out.println(t1);
        System.out.println(t2);
    }
}

class Tiger
{
    int a = 10, b, c = 20;
}*/
//ex33
/*public class Hello
{
    public static void main(String[] arg)
    {
        Tiger t1 = new Tiger();
        //method == function
        System.out.println("breakfast");
        System.out.println("meal");
        System.out.println("boil");
        System.out.println("noodle");
        System.out.println("lunch");
        System.out.println("meal");
        System.out.println("boil");
        System.out.println("noodle");
        System.out.println("dinner");
        System.out.println("meal");
        System.out.println("boil");
        System.out.println("noodle");
        //----------------------------repeated -> method -> call a method
        System.out.println();
        System.out.println("breakfast");
        t1.eat();
        System.out.println("lunch");
        t1.eat();
        System.out.println("dinner");
        t1.eat();
        t1.eatI();
    }
}

class Tiger
{
    //method
    void eat()
    {
        System.out.println("meal");
        System.out.println("boil");
        System.out.println("noodle");
    }
    void eatI()
    {
        System.out.println("eat Ice Cream");
    }
}*/
/*//ex34
class Lion
{
    void m1()
    {
        System.err.println("method m1 is called");
    }
    void m2()
    {
        System.out.println("method m2 is called");
    }
    void m3(){
        System.out.println("method m3 is called");
    }
}

public class Hello
{
    public static void main(String[] arg)
    {
        Lion l1 = new Lion();
        l1.m1();
        for (int i = 0; i < 4; i++)
        {
            l1.m1();
        }
        l1.m1();
        l1.m3();
        l1.m2();
    }
}*/
/*
//ex35
public class Hello
{
    public static void main(String[] arg)
    {
        Lion l1 = new Lion();
        l1.m1(7, 2);
        l1.m2(38,90);
    }
}

class Lion
{
    void m1(int i, int j)
    {
        System.out.println(i + " " + j + " m1");
    }

    void m2(int a, int b)
    {
        System.out.println(a + b);
    }
}*/
/*
//ex37
public class Hello
{
    public static void main(String[] arg)
    {
        Tiger t = new Tiger();
        t.m1();
        int num = t.m2();
        System.out.println(num);
    }
}

class Tiger
{
    //return type
    void m1()
    {
        System.err.println("hello from the other side");
    }

    int m2()
    {
        return 100;
    }
    int m3(){
        return 3*4;
    }
}*/
//ex38
public class Hello
{
    public static void main(String[] arg)
    {
        Tiger t = new Tiger();
        t.m1();
        t.m2();
        t.m3();
        t.m4(3, 4);
    }
}

class Tiger
{
    void m1()
    {
        System.out.println("m1 call");
    }

    void m2()
    {
        System.out.println("m2 call");
    }

    int m3()
    {
        System.out.println("m3 call");
        return 2021;
    }

    float m4(int a, int b)
    {
        System.out.println("m4 call " + (a + b));
        return 3.14f;
    }
}
