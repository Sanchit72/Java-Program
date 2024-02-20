// Accept number from user and  between the off 11 bit of that number


import java.util.*;

class Program36
  {
    public static int ofbit(int iNo)
    {
        
        int iMask =   0x00000400;
        int iResult = 0;

        iResult = iNo & iMask;

        
        if(iResult == iMask)    //11th bit is ON
        {
            return(iNo ^ iMask);
        }
        else                    // 11th bit is OFF
        {
            return iNo;
        }

    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        iRet = ofbit(iNo);

        System.out.println("Updated number is :"+iRet);
    }
}



