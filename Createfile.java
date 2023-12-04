import java.io.*;

class Createfile 
{
    public static void main(String Arg[])
    {
        try
        {
        File fobj = new File("PPA.txt");
        fobj.createNewFile();
        }
        catch(Exception obj)
        {}
    }
}
