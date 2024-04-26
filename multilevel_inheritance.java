// When there is a chain of inheritance, it is known as multilevel inheritance
class A // Super class
{
    int a,b,c;

    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Addition of two numbers: "+c);
    }

    void sub()
    {
        a=30; b=20;
        c=a-b;
        System.out.println("Subtraction of two numbers: "+c);
    }
}
class B extends A   // sub class 1
{
    void mul()
    {
        a=10; b=20;
        c=a*b;
        System.out.println("Multiplication of two numbers: "+c);
    }

    void div()
    {
        a=10; b=2;
        c=a/b;
        System.out.println("Division of two numbers: "+c);
    }
}
class C extends B   // sub class 2
{
    void rem()
    {
        a=10; b=3;
        c=a%b;
        System.out.println("Remainder of two numbers: "+c);
    }
}
class multilevel_inheritance
{
    public static void main(String [] args)
    {
        C obj=new C();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.rem();

    }
}