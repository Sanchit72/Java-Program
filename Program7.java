import java.util.*;

class Arithematic 
{
    public int ivalue1;
    public int ivalue2;

    public Arithematic(int A,int B)
    {
        this.ivalue1 = A;
        this.ivalue2 = B;
    }
 public  int Addition()
    {
        int sum = 0;

        sum = this.ivalue1+this.ivalue2;

        return sum;
    }
    
}
class Program7 
{
   
    public static void main(String Arg[])
   {
     Scanner sobj =new Scanner(System.in);

     int No1  = 0,No2=0;
     int Ans= 0;

     System.out.println("Enter First number :");
     No1 = sobj.nextInt();

      System.out.println("Enter Second number :");
     No2 = sobj.nextInt();

     Arithematic aobj = new Arithematic(No1,No2);

     Ans = aobj.Addition();
     System.out.println("Addition is :"+Ans);
   } 
}

