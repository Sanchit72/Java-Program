/*
  write java program which accept N number from user and Display all such element which are divisible by 3 and  5.
 */
import java.util.*;

class ArrayDemo3
{
    public static void Dispaly(int Arr[])
    {
        int icnt = 0;
        for(icnt=0;icnt<Arr.length;icnt++)
        {
            if((Arr[icnt]%3==0)&&(Arr[icnt]%5==0))
            {
                System.out.print("\t"+Arr[icnt]);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int icnt =0,isize = 0;

        System.out.println("Enter the number of element :");
        isize = sobj.nextInt();

        int Arr[] = new int[isize];

        System.out.println("Enter the element:");
        for(icnt=0;icnt<isize;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }

        Dispaly(Arr);
    }
}
