// Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
// we need to handle exception because to maintain the normal flow of execution
class exception_handling
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");

        int a=10, b=0,c;
        // The "try" keyword is used to specify a block where we should place an exception code. 
        //It means we can't use try block alone. The try block must be followed by either catch or finally.
        try 
        {
        c=a/b;  // error: Exception in thread "main" java.lang.ArithmeticException: / by zero and gets terminated
        System.out.println(c);
        }
        //The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. 
        //It can be followed by finally block later.
        catch(Exception e) // 'Exception' is super class of Exception handling & we can use here " Arithmetic Exception"
        {
            System.out.println("can not divided by zero    error: "+e);
        }

        System.out.println("Main method ended");
    }
}