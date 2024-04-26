class A implements Runnable
{
    public void run()// child thread will perform this job
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("My Child Thread");
        }
    }
}
class C
{
    public static void main(String [] args)
    {
        A r=new A();
        Thread obj=new Thread(r); // main thred will create child and start it 
        obj.start();    // child thread

        for(int i=1; i<=5; i++) // main thread will perform this job
        {
            System.out.println("Main thread");
        }
    }
}