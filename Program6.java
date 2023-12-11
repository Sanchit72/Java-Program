import java.util.*;

class Arithematic 
{
 public  int Addition(int ivalue1,int ivalue2)
    {
        int sum = 0;

        sum = ivalue1+ivalue2;

        return sum;
    }
    
}
class Program6 
{
   
    public static void main(String Arg[])
   {
     Scanner sobj =new Scanner(System.in);
    Arithematic aobj = new Arithematic();

     int No1  = 0,No2=0;
     int Ans= 0;

     System.out.println("Enter First number :");
     No1 = sobj.nextInt();

      System.out.println("Enter Second number :");
     No2 = sobj.nextInt();

     Ans = aobj.Addition(No1,No2);
     System.out.println("Addition is :"+Ans);
   } 
}
