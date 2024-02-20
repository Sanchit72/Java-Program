
import java.util.*;

class Program33
  {
    public static boolean checkBit(int iNo)
    {
        int iMask =  0x00004040;
        int iResult = 0;

        iResult = iNo & iMask;

        
        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        bRet = checkBit(iNo);

        if(bRet==true)
        {
            System.out.println("7th & 15th bit is ON");
        }
        else
        {
            System.out.println("7th & 15th bit is OFF");
        }

    }
}

/*
    Bit position 7 and 15
 * 
 * 0000     0000    0000    0000    0100    0000    0100    0000
 * 0        0       0       0       4       0       4       0
  
    0x00004040
 */
