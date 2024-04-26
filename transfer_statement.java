//Transfer statement "Break" & "Continue"
public class transfer_statement
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        {
            if(i==5)    // Break statement, where it break its execution/loop after 5 ie 5,6,7,8,9,10
            break;
            System.out.print(i+ " ");
            
        }
        for(int i=1; i<=10; i++)
        {
            if(i==5)    // Continue statement, where it skip the 5th loop ie 5 from the for loop ie 1,2,3,4,6,7,8,9,10
            continue;
            System.out.print(i+ " ");
        }
    }
}