import java.util.Scanner;   // import package for input 
public class condition_if
{
    public static void main(String[] args)
    {
        int pwd;
        System.out.print("Enter password : ");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==2311)  // if statement 
        {
            System.out.println("My Name: Alok ");
            System.out.println("My Age: 19 ");
            System.out.println("My Contact: 7717796959 ");
            System.out.println("My Address: Hathia Gonda Kanke Road Ranchi JH ");
        }

    }
}