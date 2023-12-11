// Addition of even factor
 
import java.util.*;
class Program11 
{
    public static void EvenFactor(int No)
    {
        int iFact = 1;
        int icnt = 0;

        int iSumEven = 0;
        int iSumOdd = 0;

        for(icnt=1;icnt<=No;icnt++)
        {
            if(No%icnt==0)
            {
                if(icnt%2==0)
                {
                    iSumEven = iSumEven +icnt;
                }
                else
                {
                    iSumOdd = iSumOdd+icnt;
                }
            }
        }
        System.out.println("Addition of even factor is "+iSumEven);;
        System.out.println("Addition of odd factor is "+iSumOdd);;
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
