package pack;

public class Hello
{
    public static void main(String[] args){
        System.out.println("tiger1");
        try{
            System.out.println(4/0);
        }catch (Exception e){
            //TODO : handle exception
            System.out.println(" inside catch");
            e.printStackTrace();
        }
        System.out.println("tiger2");
    }
}
