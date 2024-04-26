//Java allows us to declare a constructor as private. We can declare a constructor private by using the private access specifier. 
//Note that if a constructor is declared private, we are not able to create an object of the class
//The main purpose of using a private constructor is to restrict object creation
class A 
{
    int a;
    double b;
    String c;
    private A()
    {
        a=10;
        b=30.5;
        c="GOOD NIGHT";
        System.out.println(a+" "+b+" "+c );
    }
}
class private_constructor
{
    public static void main(String [] args)
    {
        A obj=new A();  //error: A() has private access in A ,henced proved
    }

}