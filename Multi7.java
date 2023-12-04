class Demo extends Thread
{
    public void run()   //Running state
    {

    }
    synchronized public void Dispaly()
    {

    }
}
class Multi7
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo();   //new state
        Demo obj2 = new Demo();   //new state

        obj1.start();    //Runnable state
        obj2.start();    //Runnable state
        
        System.out.println("Priority of obj1 is :"+obj1.getPriority());
        System.out.println("Priority of obj2 is :"+obj2.getPriority());
    }
}


