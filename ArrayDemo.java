/*
    write a java program which Accept N number from user and return difference between summation of even element and odd element.
 */
import java.util.*;

class ArrayDemo 
{
    public static int  difference(int Brr[])
    {
        int icnt =0;
        int isum1 = 0;
        int isum2 = 0;

        for(icnt=0;icnt<Brr.length;icnt++)
        {
          if(Brr[icnt]%2==0)
          {
            isum1 = isum1+Brr[icnt];
          }
          else
          {
            isum2 =isum2+Brr[icnt];
          }
        }
        return isum1-isum2;
    
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int isize = 0,icnt=0,Ans=0;

        System.out.println("Enter the number of element :");
        isize = sobj.nextInt();

        int Arr[] = new int[isize];

        System.out.println("Enter the Element :");

        for(icnt=0;icnt<isize;icnt++)
        {
            Arr[icnt] = sobj.nextInt();
        }
       Ans = difference(Arr);

       System.out.println("summation  of even and odd element is :"+Ans);
    }  
}
