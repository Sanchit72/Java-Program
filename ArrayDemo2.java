/*
  write java program which accept N number from user and Display all such element which are
  even and divisible by 5.
 */

import java.util.*;

class ArrayDemo2 
{
    public static void Dispaly(int Arr[])
    {
        int icnt = 0;
        for(icnt=0;icnt<Arr.length;icnt++)
        {
            if((Arr[icnt]%2==0)&&(Arr[icnt]%5==0))
            {
                System.out.print("\t"+Arr[icnt]);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int isize = 0,icnt= 0,iRet=0;

        System.out.println("Enter the number of Element :");
        isize = sobj.nextInt();

        int Arr[] = new int[isize];

        System.out.println("Enter the Element :");
        for(icnt = 0;icnt<isize;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }
        Dispaly(Arr);
    }
}
