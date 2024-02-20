import java.util.*;

public class Program23
 {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = 0;
        int digit = 0;
        int icnt = 0;

        System.out.println("Enter number");
        no = sobj.nextInt();

        while (no != 0)
        {
            digit = digit%2;
            no = no/2;
            System.out.println();
        }
        System.out.println();

    }
}
