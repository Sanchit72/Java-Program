/*
    Accept number from user and Dispaly that number.
 */

 import java.util.*;

 class Program14
  {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int isize = 0,icnt=0;

        System.out.println("Enter the number of element :");
        isize = sobj.nextInt();

        int Arr[] = new int[isize];

        System.out.println("Enter the Element :");

        for(icnt=0;icnt<isize;icnt++)
        {
            Arr[icnt] = sobj.nextInt();
        }
        System.out.println("Element of the array are :");
        for(icnt=0;icnt<isize;icnt++)
        {
            System.out.print(Arr[icnt]+"\t");
        }
        System.out.println();

        sobj.close();
    }    
 }