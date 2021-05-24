package pack;

/*//ex92-1)
public class Hello
{
    public static void main(String[] args)
    {
        Apple apple = new Apple();
        //apple.a = 10;
        apple.b = 20;
    }
}

class Apple
{
    public int b;
    private int a;//class  외부 사용 불가능

    void m1()
    {
        a = 10;
        b = 20;
    }
}*/


/*
//ex92-2) private member 사용하는법
class Apple
{
    private int num;
   public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        Apple apple = new Apple();
        apple.setNum(999);
        System.out.println(apple.getNum());
    }
}*/

/*
//ex92-3) Singleton
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
        */
/*if (a1 == a2)// == : 두 객체가 동일한지 물어보는 것.
        {
            System.out.println("o");
        } else
        {
            System.out.println("x");
        }*//*

        System.out.println((a1 == a2) ? "o" : "x");// == : 두 객체가 동일한지 물어보는 것.

        Banana b1 = new Banana();
        Banana b2 = new Banana();
        System.out.println((b1 == b2) ? "o" : "x");
    }
}
class Banana{ }*/
/*
//ex93)
import java.io.*;
//create a new file
public class Hello
{
    public static void main(String[] args)
    {
        //File 입력 출력
        try
        {
            Writer w = new FileWriter("test.txt");//파일 입출력 시작하겠습니다~
            w.write("apple");
            w.write("\n");
            w.write("hyacinth");
            w.close();//파일 입출력 마감했습니다~

        }catch (Exception e){
            //TODO : handle exception
        }

    }

    }*/


/*//ex94)

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
}*/

/*
//ex95)
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
                if (readData == -1)
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
}*/
//ex96)

import java.io.*;

class A
{
    void greenColour()
    {

    }
}

//greenColour overriding 시도
//typo occurred
//not aware of the typo
class B extends A
{
    @Override
        //혹시 typo 발생시 error 발생시킬것
    void redColour()
    {
    }
}

public class Hello
{
    public static void main(String[] args)
    {

    }
}