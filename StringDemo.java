/*
 write a java program which accept string from user and count number of capital character.
 */
import java.util.*;

class StringDemo
{
   
        public static int countcapital(String str)
    {
        int icnt = 0;
        int count = 0;
        char Arr[] = str.toCharArray()
;        
        for(icnt=0;icnt<Arr.length;icnt++)
        {
        if((Arr[icnt]>='A') && (Arr[icnt]<='Z'))
        {
            count++;
        }
        }
        return count;
    }
    public static void main(String Arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int iRet = 0;

        String str = null;

        System.out.println("Enter your name :");
        str = sobj.nextLine();

       iRet = countcapital(str);

       System.out.println("Number of capital character are :"+iRet);

        
    } 

        
    }
