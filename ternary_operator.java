public class ternary_operator
{
    public static void main(String[] args)
    {
       int a=10, b=20, c=5;
       int result =(a>b)?(a>c?a:c):(b>c?b:c);   //variable = (condition) ? expressionTrue :  expressionFalse;
       System.out.println(result);
    }
}