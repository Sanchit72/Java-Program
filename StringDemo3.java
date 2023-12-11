/*
 write a java program which accept string from user and check whether it contains vowels in it or not.
 */
import java.util.*;

class StringDemo3 
{
    public static boolean chkvowel(String str)
    {
        int icnt =0;
         char Arr[] = str.toCharArray();
         for(icnt=0;icnt<=Arr.length;icnt++)
         {
         if(Arr[icnt]=='a'||Arr[icnt]=='e'||Arr[icnt]=='i'||Arr[icnt]=='o'||Arr[icnt]=='u'||
         Arr[icnt]=='A'||Arr[icnt]=='E'||Arr[icnt]=='I'||Arr[icnt]=='O'||Arr[icnt]=='U')
         {
            return true;
         }
        }
         return false;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        String str = null;

        System.out.println("Enter the String");
        str = sobj.nextLine();

        bRet = chkvowel(str);

        if(bRet==true)
        {
            System.out.println(" "+bRet);
        }
        else
        {
            System.out.println(" "+bRet);
        }
        
    }
    
}
