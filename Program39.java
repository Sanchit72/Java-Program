
// Accept number from user and  between the Toggel 15 bit of that number.


import java.util.*; 

class Program39
  {
    public static int ToggleBit(int iNo)
    {
        
        int iMask =   0x00004000;
        int iResult = 0;

        iResult = iNo ^ iMask;

            return iResult;
    

    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        iRet = ToggleBit(iNo);

        System.out.println("Updated number is :"+iRet);
    }
}



