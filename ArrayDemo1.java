/*
    write a java program which Accept N number from user and display all such elements are divisible by 5.
 */
import java.util.*;

public class ArrayDemo1
{
    public static void Dispaly(int Arr[])
    {
        int icnt = 0;

        for(icnt=0;icnt<=Arr.length;icnt++)
        {
            if(Arr[icnt]%5==0)
            {
                System.out.print("\t"+Arr[icnt]);
            }
        }
    }
    public static void main(String Arg[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int isize=0,icnt=0,iRet =0;

        System.out.println("Enter the number of element :");
        isize = sobj.nextInt();

        int Arr[] = new int[isize];

        System.out.println("Enter the number :");

        for(icnt=0;icnt<isize;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }

        Dispaly(Arr);
    }
    
}