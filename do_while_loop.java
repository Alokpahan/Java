import java.util.Scanner;
public class do_while_loop
{
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter any number: ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
       do
        {
            System.out.print(num + " ");
            num ++;
        }
        while(num<=10);
    }
}