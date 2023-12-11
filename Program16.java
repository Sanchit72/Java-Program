/*
    Accept number from user and Dispaly Addition of all element.
 */
import java.util.*;

class Program16 
{
    public static int  Addition(int Brr[])
    {
        int icnt =0;
        int isum = 0;

        for(icnt=0;icnt<Brr.length;icnt++)
        {
          isum = isum+Brr[icnt];
        }
        return isum;
    
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
       Ans = Addition(Arr);

       System.out.println("Addition of all element is :"+Ans);
    }  
}
