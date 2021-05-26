package pakage1;

import java.util.LinkedList;
import java.util.Scanner;

//ex 102-3)
/*public class Hello
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 3; ++i)
        {
            System.out.println("type a number ");
            int num = new Scanner(System.in).nextInt();
            if (num == 999)//le mot de passe
            {
                System.out.println("terminate this program");
                break;
            }
            System.out.println(num * 11);
        }
    }
}*/
/*

//ex103)
class Tiger extends Thread{
    public void run(){
        System.out.println("Tiger start");
        Thread t = new Lion();
        t.start();
        new Scanner(System.in).nextInt();
        System.out.println("Tiger end");
    }
}
class Lion extends Thread{
    public void run(){
        System.out.println("Lion start");
        new Scanner(System.in).nextInt();
        System.out.println("Lion end");
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello start");
        Thread t = new Tiger();
        t.start();

        new Scanner(System.in).nextInt();
        System.out.println("Hello end");
    }
}*/
//ex104)
/*
class Lion extends Thread{
    static int num = 0;
    public void run(){
        for (int i = 0; i < 3; ++i)
        {
            System.out.println(i);
        }
        System.out.println(num + " Lion thread terminated");
    }
}
class Tiger extends Thread
{
    public void run()
    {
        System.out.println("Tiger run");
        for (int i = 0; i < 5; ++i)
        {
            System.out.println("waiting for connection");
            try{ Thread.sleep(0);} catch (Exception e){}
            System.out.println("user " + i + " connected");

            Thread t = new Lion();
            t.start();
            Lion.num++;
            System.out.println("Tiger thread terminated");
        }
    }
}

class Test
{
    static int num = 100;
}

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println(Test.num);
        System.out.println("Hello start");
        Tiger t = new Tiger();
        t.start();
        //for stopping the program
        new Scanner(System.in).nextInt();
        System.out.println("Hello end");
    }
}*/
//ex105) 도서관리 프로그램 << collection(LinkedList)
/*
class Book
{
    String title;
    String author;
    String publisher;
    int price;

    public Book(String title, String author, String publisher, int price)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    void info()
    {
        System.out.println(title + " " +
                author + " " +
                publisher + " " +
                price + " "
        );
    }
}

public class Hello
{
    public static void main(String[] args)
    {
        LinkedList<Book> mm = new LinkedList<Book>();

        //C
        mm.add(new Book("The Virtue of Moderate", "Confucius", "Han", 2500));
        mm.add(new Book("java tutorial", "Or", "oracle", 2000));
        mm.add(new Book("big data", "Py", "python", 3000));
        mm.add(new Book("Help", "Winston", "SC", 2700));
        System.out.println(mm.size());
        System.out.println("R1------------------------------------------");
        //R1
        for (Book book : mm)
        {
            book.info();
        }
        System.out.println("R2------------------------------------------");
        //R2
        Book bk = mm.get(2);
        bk.info();
        System.out.println("U------------------------------------------");
        //U
        mm.set(1, new Book("C++ Tutorial", "BS", "CPP", 5000));
        for (Book book : mm)
        {
            book.info();
        }
        System.out.println("D------------------------------------------");
        //D
        mm.remove(3);
        for (Book book : mm)
        {
            book.info();
        }
        Book findThis = search(mm, "BS");
        if (findThis != null)
        {
            System.out.println(" found! ");
            findThis.info();
        }
        else
        {
            System.out.println(" no such book by the author ");
        }
    }

    //searching
    static Book search(LinkedList<Book> mm1, String author)
    {
        for (Book book : mm1)
        {
            if (book.author.equals(author))
            {
                return book;
            }
        }
        return null;
    }
}*/
//ex106)
/*public class Hello
{
    static String HexaToBinary(int n)
    {
        String s = Integer.toBinaryString(n);
        while (s.length() < 32)
        {
            s = "0" + s;
        }
        StringBuffer s1 = new StringBuffer(s);

        for (int i = 0; i < 7; i++)
        {
            s1.insert((7 - i) * 4, " ");
        }
        return s1.toString();
    }

    public static void main(String[] args)
    {
        int num = 0x3b12cd59;
        int a = 0x000000ff;
        //int : 4 bytes = 32 bits
        System.out.println(HexaToBinary(num));
        System.out.println(HexaToBinary(a));
        int c = num & a;
        //
        System.out.println(HexaToBinary(c));
    }
}*/

//ex107)

//ex107)
public class Hello {
    static String HexaToBinary(int n) {
        String s = Integer.toBinaryString(n);
        while(s.length() < 32) {
            s = "0" + s;
        }
        StringBuffer s1 = new StringBuffer( s );

        for (int i = 0; i < 7; i++) {
            s1.insert( (7-i) * 4, " ");
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        int num = 0x3b12cd59;
        System.out.println(HexaToBinary(num));
        System.out.println(num);

        System.out.println( num & 0x000000ff );
        System.out.println( (num & 0x0000ff00) >> 8);
        System.out.println( (num & 0x00ff0000) >> 16);
        System.out.println( (num & 0xff000000) >> 24);
        System.out.println("-----------------------");
        int a = 0x0000004a;
        System.out.println( HexaToBinary(a) );
        System.out.println( HexaToBinary(0x00000020) );
        System.out.println( HexaToBinary( a | 0x00000010) );
    }
}