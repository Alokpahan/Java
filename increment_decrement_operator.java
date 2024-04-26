public class increment_decrement_operator
{
    public static void main(String[] args)
    {
        int a=10;                   // Assignment operator 
        System.out.println(++a);   // pre increment  11
        System.out.println(a++);   // post increment 11 --->12
        System.out.println(--a);   // pre decrement  11
        System.out.println(a--);   // post decrement 11 --->10
        System.out.println(a);     //                10
        a+=10;
        System.out.println(a);       // a=a+10= 20  compound assignment operator --> '+='
    }
}