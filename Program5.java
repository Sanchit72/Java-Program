import java.util.*;

class Program5 
{
    public static int Addition(int ivalue1,int ivalue2)
    {
        int sum = 0;

        sum = ivalue1+ivalue2;

        return sum;
    }
    public static void main(String Arg[])
   {
     Scanner sobj =new Scanner(System.in);

     int No1  = 0,No2=0;
     int Ans= 0;

     System.out.println("Enter First number :");
     No1 = sobj.nextInt();

      System.out.println("Enter Second number :");
     No2 = sobj.nextInt();

     Ans = Addition(No1,No2);
     System.out.println("Addition is :"+Ans);
   } 
}
