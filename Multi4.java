class Demo extends Thread
{
    public void run()   //Running state
{
        for(int i=1;i<100;i++)
        {}

            System.out.println("End of thread");
        
    }
}
class Multi4
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo();   //new state
    
        obj1.start();    //Runnable state
        obj1.join();
        System.out.println("End of main thread");    //Dead state
    }
}

