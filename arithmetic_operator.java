import java.util.Scanner;
public class arithmetic_operator
{
    public static void main(String[] args)
    {
        int a,b,c,choice;
        System.out.print("Enter any two numbers: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.print("Enter your choice: ");
        choice=obj.nextInt();
        switch(choice)
            {
                case 1: c=a+b;
                System.out.print("Addition "+c);
                break;
                case 2: c=a-b;
                System.out.print("Subtraction "+c);
                break;
                case 3: c=a*b;
                System.out.print("Multiplication "+c);
                break;
                case 4: c=a/b;
                System.out.print("Division "+c);
                break;
                case 5: c=a%b;
                System.out.print("Remainder "+c);
                break;
                default:
                System.out.print("Invalid input....");
            }
    }
}