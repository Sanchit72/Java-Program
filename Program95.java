
import java.util.*;

public class Program95
 {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

         String Arr[] = str.split(" ");

         System.out.println("Number of words are "+Arr.length);

    }
}
