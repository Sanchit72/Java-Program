import java.util.*;

class Program15 
{
    public static void Dispaly(int Brr[])
    {
        int icnt =0;

        System.out.println("Element of the array are :");

        for(icnt=0;icnt<Brr.length;icnt++)
        {
            System.out.print(Brr[icnt]+"\t");
        }
        System.out.println();
    
    }
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
        Dispaly(Arr);
    }  
}
