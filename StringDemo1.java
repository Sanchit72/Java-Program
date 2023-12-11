/*
 write a java program which accept string from user and count number of capital character.
 */
import java.util.*;

class StringDemo1 
{
    public static int countsmall(String str)
    {
        int icnt = 0;
        int count =0;
        char Arr[]=str.toCharArray();

        for(icnt=0;icnt<Arr.length;icnt++)
        {
            if((Arr[icnt]>='a')&&(Arr[icnt]<='z'))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        String str = null;

        System.out.println("Enter the String:");
        str = sobj.nextLine();

        iRet = countsmall(str);
        System.out.println("Number of small character are:"+iRet);

    }
}
