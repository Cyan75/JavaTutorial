package pack;

import java.util.LinkedList;
import java.util.Random;

public class Hello
{
    public static void main(String[] args)
    {
        //ex87)
        /*LinkedList<Integer> mm = new LinkedList<>();
        System.out.println(mm.size());
        //Create_RUD
        mm.add(100);
        System.out.println(mm.size() + " rows ");
        for (int i = 0; i < 10; ++i)
        {
            mm.add(i * 10 + 1);
        }
        System.out.println(mm.size() + " rows ");

        //C_Read_UD
        //way1: only printing
        System.out.println(mm);
        //way2: element-wise access available
        for (int i = 0; i < mm.size(); ++i)
        {
            System.out.println(mm.get(i) + " ");
        }
        System.out.println();
        //way3: simplified for sentence
        for (Integer item : mm)
        {
            System.out.print(item + " ");
        }
        System.err.println();
        System.out.println(mm.get(5));

        //CR_Update_D : modify an element
        mm.set(5, 2021);
        System.out.println(mm);

        //CRU_Delete : remove an element
        mm.remove(5);
        System.out.println(mm);


        int[] arr = {10, 20, 30, 40};
        for (int data : arr)
        {
            System.out.print(data + " ");
        }*/

        //ex88)
        /*LinkedList<Integer> mm = new LinkedList<Integer>();
        for (int i = 0; i < 10; ++i)
        {
            mm.add(i * 10 + i);
        }
        System.out.println(mm);
        //search: to find
        for (int i = 0; i < mm.size(); ++i)
        {
            Integer num = mm.get(i);
            if (num == 44)
            {
                System.out.println("at " + i);
                break;
            }
            if (mm.size() - 1 == i){
                System.out.println("not found");
            }
        }*/
        //ex89-1 : how to remove certain data
        /*LinkedList<Integer> mm = new LinkedList<Integer>();
        for (int i = 0; i < 10; ++i)
        {
            mm.add(i * 10 + i);
        }
        System.out.println(mm);
        for (int i = 0; i < mm.size(); ++i)
        {
            if (mm.get(i) == 55)
            {
                mm.remove(i);
                break;
            }
        }*/
        //ex89-2 :  only remove evens
        /*LinkedList<Integer> mm = new LinkedList<Integer>();
        for (int i = 0; i < 10; ++i)
        {
            mm.add(i * 2);
        }
        //System.out.println(mm);
        for (int i = 0; i < mm.size(); )
        {
            int num = mm.get(i);
            if (num % 2 == 0)
            {
                mm.remove(i);
                break;
            } else
            {
                i++;
            }
        }
        System.out.println(mm);*/
        //ex90
        /*LinkedList<Integer> mm = new LinkedList<Integer>();
        for (int i = 0; i < 10; ++i)
        {
            mm.add(i * 2);
        }
        for (int i = 0; i < mm.size(); )
        {
            int ct = mm.size() - i;
        }*/
        //ex91
        // import java.util.Random
        Random rn = new Random();
        int num =rn.nextInt();
        System.out.println(num);
        num = rn.nextInt(100);
        System.out.println(num);
        for (int i = 0; i<10 ; ++i){
            System.out.println(new Random().nextInt(100));
        }

    }
}
