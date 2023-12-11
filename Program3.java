 import java.io.*;

    class Program3
    {
      public static void main(String Arg[]) throws Exception
      {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
   
        int No1  = 0,No2=0;
        int Ans= 0;
   
        System.out.println("Enter First number :");
        No1 = Integer.parseInt(bobj.readLine());
   
         System.out.println("Enter Second number :");
         No2 = Integer.parseInt(bobj.readLine());
   
   
        Ans = No1+No2;
        System.out.println("Addition is :"+Ans);
      } 
   }
   

