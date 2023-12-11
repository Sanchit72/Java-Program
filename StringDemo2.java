/*
 write a java program which accept string from user and return difference between frequency of small characters and 
 frequency of capital characters.
 */
import java.util.*;

class StringDemo2 {
    public static int CountDiff(String str) {
        int Scount = 0;
        int Ccount = 0;
        char Arr[] = str.toCharArray();

        for (int icnt = 0; icnt < Arr.length; icnt++) {
            if ((Arr[icnt] >= 'A') && (Arr[icnt] <= 'Z')) {
                Scount++;
            } else if ((Arr[icnt] >= 'a') && (Arr[icnt] <= 'z')) {
                Ccount++;
            }
        }
        return Scount - Ccount;
    }

    public static void main(String Arg[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        String str = null;

        System.out.println("Enter the String");
        str = sobj.nextLine();

        iRet = CountDiff(str);
        System.out.println("Difference between small and capital characters is: " + iRet);
    }
}
