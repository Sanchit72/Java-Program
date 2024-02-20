
import java.util.*;

class Program34
  {
    public static boolean checkBit(int iNo)
    {
        int iMask =   0x00000a00;
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
    Bit position 10 and 12
 * 
 * 0000     0000    0000    0000    0000    1010    0000    0000
 * 0        0       0       0       0       a       0       0
  
    0x00000a00
 */
