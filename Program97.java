
import java.util.*;

public class Program97
 {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

         String Arr[] = str.split(" ");

         int icnt = 0;
         for(icnt = 0;icnt<Arr.length;icnt++)
         {
            System.out.println("words is"+Arr[icnt] +"having lenth"+Arr[icnt]);

        }
         }
        
}
