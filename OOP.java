import java.util.*;

class Arithematic
{
    public int value1;
    public int value2;


    public Arithematic(int A,int B)
    {
        this.value1=A;
        this.value2=B;
    }

    public int Addition()
    {
        int Result = 0;
        Result = this.value1 + this.value2;
        return Result;
    }
    public int substraction()
    {
        int Result = 0;
        Result = this.value1 - this.value2;
        return Result;
    }
}
class OOP {

    public static void main(String args[])
    {

        int No1 =0,No2=0,Ans=0;

        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter first number :");
        No1 = sobj.nextInt();

         System.out.println("Enter second number :");
        No2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(No1,No2);

        Ans = aobj.Addition();
        System.out.println("Addition is :"+Ans);

        Ans = aobj.substraction();
        System.out.println("substraction is :"+Ans);

        sobj.close();
    }
    
}
