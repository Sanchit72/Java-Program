class Commandline 
{
    public static void main(String Arg[])
    {
        System.out.println("Number of command line argument are :"+Arg.length);

        System.out.println("Command line argument are:");

        for(int i =0;i<Arg.length;i++)
        {
            System.out.println(Arg[i]);
        }
    }
}

// javac Commandline.java
//java Commandline PPA python java marvellous
