import java.io.*;

class Deletefile
{
    public static void main(String Arg[])
    {
        try
        {
            File fobj = new File("PPA.txt");
            fobj.delete();
        }
        catch(Exception obj)
        {}
    }
}
