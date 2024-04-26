// Multithreading in Java is a process of executing multiple threads simultaneously.
// A thread is a lightweight sub-process,the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
// Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread. Thread class extends Object class and implements Runnable interface.

 class A extends Thread 
 {
    @Override
   // public void fun() // normal method
    public void run()   // child thread will perform this job
    // "run() -> method "It is used to do an action for a thread.
    {
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("Tuesday");
                Thread.sleep(1000); // 1000 mili/sec   -> 1 second ka vaue h
            }
        }
        catch(InterruptedException i)
        {

        }

    }
 }

 class B 
{
    public static void main (String[] args) throws InterruptedException
    {
        A obj=new A();
        obj.start();    // 'start' -> method it will start thread and internally it will call "run method" and start() is in Thread class  and 'obj' -> child thread
        // obj.fun();
        for(int i=1; i<=5; i++) // main thread will perform this job
        {
            System.out.println("Wednesday");
            Thread.sleep(1000);
        }
    }
 }
 // we can not define output sequences in every execution but both threads will simultaneously gets executed at same time 
 // uses of multithreading