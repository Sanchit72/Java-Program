//Accept number from user check Factorial of number
 
import java.util.*;
class Program9 
{
    public static int Factorial(int No)
    {
        int iFact = 1;
        int icnt = 0;

        for(icnt=1;icnt<=No;icnt++)
        {
            iFact = iFact*icnt;
        }
        return iFact;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int value = 0,Ans= 0;

        System.out.println("Enter number :");
        value = sobj.nextInt();

        Ans = Factorial(value);

        System.out.println("Factorial is :"+Ans);


    }
}
