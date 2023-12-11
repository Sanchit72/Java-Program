/*
 write a java program which accept string from user and display it in reverse order
 */
import java.util.*;

class StringDemo4 {
    public static void Reverse(String str) {
        int icnt = 0;
        char Arr[] = str.toCharArray();

        for (icnt = Arr.length-1; icnt >= 0; icnt--) {
            System.out.print(Arr[icnt]);
        }
        System.out.println();
    }

    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter the String");
        str = sobj.nextLine();

        Reverse(str);
    }
}
