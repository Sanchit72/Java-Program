/*
    Accept String from user and Dispaly one by one character.
 */
import java.util.*;

class Program19
{
    public static void Dispaly(String str)
    {
        int icnt = 0;

        for(icnt=0;icnt<str.length();icnt++)
        {
        System.out.println(str.charAt(icnt));
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj =new Scanner(System.in);

        String str = null;

        System.out.println("Enter your name :");
        str = sobj.nextLine();

        Dispaly(str);
        
    }  
}

