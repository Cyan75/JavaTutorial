package package6;

public class Lions
{
    /*//ex39
    public static void main(String[] args)
    {
        System.out.println(1);
        Tiger t = new Tiger();
        System.out.println(2);
    }
}
class Tiger{
    //Constructor is a function
    Tiger(){
        System.out.println("ctor called");
    }
}*/
/*//ex40
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.m1();
        System.out.println(t.a+" "+ t.b);

    }
}

class Tiger
{
    int a, b;

    //Constructor is a function
    Tiger()
    {
        System.out.println("ctor called");
        a = 10;
        b = 20;
    }

    void m1()
    {
        System.out.println(a + b);

    }
}*/
/*
//ex41
    public static void main(String[] args)
    {
        Airplane t = new Airplane(100);
        Airplane s = new Airplane(200);
        System.out.println(t.a + " " + t.b);

    }
}

class Airplane
{
    // ZEROs unless they are initialised in CTOR
    //int a, b;
    int a = 10, b = 20;
    int fuel = 100;

    //Constructor is a function
    Airplane(int fuel)
    {
        a = 30;
        b = 40;
        System.out.println("The fuel level is "+ fuel);
    }
    void m1()
    {
        System.out.println(a + " " + b);
    }
}*/
/*
//ex43
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.m1();
        t.m1(2);

    }
}

class Tiger
{
    void m1()
    {
        System.out.println("1");
    }

    //different method
    void m1(int a)
    {
        System.err.println(a);
    }

}
*/


    /*//ex44
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger(10);
    }
}

class Tiger
{
    Tiger()
    {
        System.out.println("Ctor w/o pass val");
    }

    Tiger(int a)
    {
        System.out.println("Ctor passed w/ " + a);
    }
}*/

/*//ex45
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger(100);
        Tiger t2 = new Tiger();
    }
}

class Tiger
{
    Tiger()
    {
        System.out.println(8);
    }

    Tiger(int a)
    {
        System.out.println(a);
    }
}*/
/*
//ex46

    public static void main(String[] args)
    {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger(1, 2);
    }
}

class Tiger
{
    int a, b;

    Tiger()
    {
        a = 10;
        b = 20;
        m1();
    }

    Tiger(int x, int y)
    {
        a = x;
        b = y;
        m1();
    }

    void m1()
    {
        System.out.println(a + " " + b);
    }
}
*/

    /*//ex47
        public static void main(String[] args)
        {
            Tiger t1 = new Tiger();
            t1.m3();
        }
    }

    class Tiger
    {
        Tiger(){}
        void m1(){
            System.out.println("tiger");
        }
        void m2(){
            m1();
            System.out.println("elephant");
        }
        void m3(){
            m2();
            System.out.println("eagle");
        }
        *//* 하면안되는 실수
    void m4(){
        m5();
    }
    void m5(){
        m4();
    }*//*
}*/
/*
//ex48
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger();
        t1.m1(3, 4);
        t1.show();
    }
}

class Tiger
{
    int a, b;

    void m1(int a, int b)
    {
        this.a = a * 10;
        this.b = b * 20;
    }
    void show(){
        System.out.println(a + " " + b); //the same as  System.out.println(this.a + " " + this.b);
        System.out.println(this.a + " " + this.b); // recommended
    }
}*/
/*
//ex49
    public static void main(String[] args)
    {
        Tiger t = new Tiger(1, 100);
        t.display();
    }
}

class Tiger
{
    int num;
    int fuel;

    Tiger()
    {
    }

    Tiger(int a, int b)
    {
        //usually. in this form. 99%
        num = a;
        fuel = b;
    }

    void display()
    {
        System.out.println(this.num + " " + this.fuel);
    }

}*/
//ex50
    public static void main(String[] args)
    {
        int i = 1;
        //String is a class
        String str = "lion";
        String str2 = new String("lion");
        System.out.println(Short.MAX_VALUE);
        B my =new B();
        my.m2();// B.m2()
        my.m1();// A.m1()
    }
}


class A
{
    void m1()
    {
        System.out.println("draw a star");
    }
}

class B extends A
{
    void m2()
    {
        System.out.println("draw an hourglass");
    }
}