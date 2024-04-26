import java.util.Scanner;   // import package for input 
public class condition_if_else_2
{
    public static void main(String[] arg)
    {
        int Age;
        System.out.print("Enter Age: ");
        Scanner obj=new Scanner(System.in);
        Age=obj.nextInt();
        if(Age>=18)   // if statement 
        {
            System.out.println("Eligible for vote");
        }
        else    // else statement 
        {
            System.out.println("Not Eligible for voting");
        }
    }
}