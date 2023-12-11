/*
Input  : 5
OutPut : 1 * 2 * 3 * 4 * 5 *

*/
import java.util.*;
class Program12 
{
    public static void Dislapy(int No)
    {
        int icnt = 0;

        for(icnt=1;icnt<=No;icnt++)
        {
            System.out.print(icnt+"\t"+" *\t");
        }
        System.out.println();
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int value = 0;

        System.out.println("Enter number :");
        value = sobj.nextInt();

        Dislapy(value);

    }
}
