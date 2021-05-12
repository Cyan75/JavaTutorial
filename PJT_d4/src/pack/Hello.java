package pack;

public class Hello
{
    public static void main(String[] arg)
    {
        /*System.out.println("");
        for (int i = 0; i < 7; i++){
            System.out.println("tiger");
        }
        System.out.println(20+30+"tiger");
*/
/*
        //ex20
        int sum = 0;
        for(int i = 1; i<=4; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        int evenSum =0;
        int oddSum =0;
        for(int i = 1; i<=12; i++)
        {
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
            else {
                oddSum +=i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
*/


/*
        //ex21
        int a =65;
        System.out.println(a);
        System.out.println((char)a);
        for (int i=0; i<26 ; i++)
        {
            int num = 'A' + i;
            System.out.println((char)num);
            }
*/
        //ex22
        /*int  n = 0;
        while(true){
            n++;
            if(n == 10)
            {
                break;
            }
            System.out.println(n);
        }*/
     /*   //ex23
        int num = 0;
        while (num < 5)
        {
            System.out.println(num);
            num++;
        }
    */
        /*//ex24
        int num = 11;
        while(true){
            System.out.println(num);
            if(num == 1){
                break;
            }
            if(num%2 == 0){
                num = num/2;
            }
            else {
                num = num*3 + 1;
            }
        }
        System.out.println("exit");*/


        /*//ex25
        int num=15;
        switch (num){
            case 10:
                System.out.println('a');
                break;
            case 15:
                System.out.println('b');
                break;
            default:
                System.out.println('c');
        }*/
/*
        //ex26 메모리 한번에 주세요
        int[] arr = new int[10];
        arr[0]=10;
        arr[4]=20;
        arr[7]=arr[0] + arr[4];
        System.out.println(arr[7]);
*/
        //ex27\
        /*
        //array1
        int[] ar = new int[10];
        //array2
        int[] br = new int[]{10, 20, 30, 88, 99};
        System.out.println(br[0] + br[7]);
        //array3
        int[] cr = {11, 22, 33, 44, 55};
        System.out.println(cr[0] + cr[7]);
        */
        /*int[] ar = new int[13];
        System.out.println(ar.length);
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(i);
            ar[i] = 100;
        }
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i]);
        }
        */
        int[] ar = {4, 5, 6, 7, 8, 9, 2, 3};
        System.out.println((ar.length));
        for (int i = 0; i < ar.length / 2; i++)
        {
            //System.out.println(ar[i] + ar[8 - 1 - i]);
            System.out.println(ar[i] + ar[ar.length - 1 - i]);
        }
    }
}
