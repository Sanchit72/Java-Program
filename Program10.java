// Dspaly  Odd & even factor.
 
import java.util.*;
class Program10 
{
    public static void EvenFactor(int No)
    {
        int iFact = 1;
        int icnt = 0;

        for(icnt=1;icnt<=No;icnt++)
        {
            if(No%icnt==0)
            {
                if(icnt%2==0)
                {
                    System.out.println("Even factor is :"+icnt);
                }
                else
                {
                    System.out.println("Odd factor is :"+icnt);
                }
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int value = 0;

        System.out.println("Enter number :");
        value = sobj.nextInt();

        EvenFactor(value);


    }
}
