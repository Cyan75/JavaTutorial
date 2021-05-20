package package1;

import java.util.Iterator;

public class Hello
{
    public static void main(String[] args)
    {
        /*
        //ex80)
        String s1 = "Tigger the tiger";
        System.out.println(s1);
        String s2 = s1.substring(3, 7);
        //substring() : makes a child string using a mother string
        System.out.println(s2);
        String s3 = "A p p l e";
        System.out.print(s3);
        System.out.print(s3.trim());
        //trim() :  removes spaces before and after the string*/

       /* //ex81)
        //F4 -> type hierarchy
        //
        String s;
        Math m;
        Thread t;
        Tiger t1;
        Lion l1;*/

        /*//ex82)
        String s ="123";
        System.out.println(s.toString());
        String s1 = "tiger";
        System.out.println(s1.hashCode());
        //Address on memory
        Lion l = new Lion();
        //below two are the same
        System.out.println(l.hashCode());
        System.out.println(l);*/
        /*//ex83)
        int num1 = 100;
        System.out.println(num1);

        int num2 = 0xabcd;
        System.out.println(num2);

        int num3 = 0x63ce7bcd; //int has 32 bit size
        //0110(6)  0011(3)  1100(c)  1110(e) 0111(7)  1011(b)  1100(c)  1101(d)
        System.out.println(num3);
        //System.out.println(Integer.MAX_VALUE);

        String s1 = Integer.toBinaryString(num1);
        System.out.println(s1);

        String s2 = Integer.toBinaryString(num1);
        System.out.println(s2);

        String s3 = Integer.toBinaryString(num1);
        System.out.println(s3);
*/
        //int num = 0x3b12cd59;
        int num = 1000;
        //System.out.println(Integer.toBinaryString(num));
        //11 1011 0001 0010 1100 1101 0101 1001
        //-> 0011 1011 0001 0010 1100 1101 0101 1001
        System.out.println(hexToBin(num));

    }

    /*static String hexToBin(int n)
    {
        *//*String s = Integer.toBinaryString(n);
        //System.out.println(s.length());// size of the string
        while (s.length() < 32)
        {
            s = "0" + s;
        }*//*
        //ex85)
        StringBuffer s1 = new StringBuffer(Integer.toBinaryString(n));
        s1.insert(1, "ho");
        s1.insert(4, ',');
        for (int i = 0; i < 7; i++)
        {
            s1.insert((7 - i) * 4, " ");
        }
        return s1.toString();
    }*/
    int num = 10;
    // int : standard data type
    // num : variable
    // 10 : literal

    String s = " flower";
    // String :  not a standard data type
    // s : object
    // flower : literal



}
/*

class Tiger
{

}

class Lion extends Tiger
{


}*/
/*
//ex85)
public class Hello {
    static String HexaToBinary(int n) {
        String s = Integer.toBinaryString(n);
        //System.out.println(s.length());
        while(s.length() < 32) {
            s = "0" + s;
        }
        //System.out.println(s);
        // 0011,1011,0001,0010,1100,1101,0101,1001

        // String은 자신이 가지고 있는 문자열사이에 추가적으로 문자를
        // 넣을수가 없습니다.
        StringBuffer s1 = new StringBuffer( s );
        //System.out.println("s1 : " + s1);

        for (int i = 0; i < 7; i++) {
            s1.insert( (7-i) * 4, " ");
        }

        //s1.insert(28, " ");
        //s1.insert(24, " ");
        //s1.insert(20, " ");
        //s1.insert(16, " ");
        //s1.insert(12, " ");
        //s1.insert(8, " " );
        //s1.insert(4, " " );

        //System.out.println("s1 : " + s1);
        return s1.toString();
    }

    public static void main(String[] args) {
        int num = 0x3b12cd59;
        System.out.println(Integer.toBinaryString(num));
        // 결과
        // 111011000100101100110101011001
        // 0011 1011 0001 0010 1100 1101 0101 1001
        System.out.println(HexaToBinary(num));
        num = 0xab;
        System.out.println(HexaToBinary(num));
    }
}*/
