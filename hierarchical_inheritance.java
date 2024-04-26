// When two or more classes inherits a single class, it is known as hierarchical inheritance
class A 
{
    void input()
    {
        System.out.println("Enter your name: ");
    }
}
class B extends A 
{
    void show()
    {
        System.out.println("My name is XYZ");
    }
}
class C extends A 
{
    void disp()
    {
        System.out.println("My name is ABC");
    }
}
class hierarchical_inheritance
{
    public static void main(String [] args)
    {
        B b=new B();
        C c=new C();

        b.input(); 
        b.show();

        c.input();
        c.disp();
        
    }
}