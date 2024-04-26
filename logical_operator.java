public class logical_operator
{
    public static void main(String[] args)
    {
        int a=10,b=20;
        System.out.println(a==b && a!=b);   // logical AND ie 10 is not equal to 20 ==> False
        System.out.println(a==b || a!=b);   // logical OR  ie 10==20 or 10 not equal 20 ==> True
        System.out.println(!(a>b));         // logical NOT ie 10>20 ==> False statement hai but 'logical NOT' hai tho result True hoga 
        
    }
}