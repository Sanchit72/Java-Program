/*
    Accept String from user and Dispaly one by one character.
 */
import java.util.*;

class Program18
{
    
    public static void main(String Arg[])
    {
        Scanner sobj =new Scanner(System.in);

        String str = null;

        System.out.println("Enter your name :");
        str = sobj.nextLine();

        int icnt = 0;

        for(icnt=0;icnt<str.length();icnt++)
        {
        System.out.println(str.charAt(icnt));
        }
    }  
}

