// A polymorphism which is exits at the time of compliation is called compile time polymorphism
// also known as early binding or static polymorphism

class A 
{
    int  add()  // return type can be same or may not but its method name should be same & must have different parameters
    {
        int a=10, b=20, c;
        c=a+b;
        return c;
    }

    
    void add(int x, int y)
    {
        int c;
        c=x+y;
        System.out.println("Addition of two numbers: "+c);
    }
    void add(int x, double y)
    {
        double c;
        c=x+y;
        System.out.println("Addition of two numbers: "+c);
    }

}
class compile_time_polymorphism
{
    public static void main(String [] args)
    {
        A  obj=new A();
        obj.add(100,200);
        obj.add(50,50.5);
        int add=obj.add();
        System.out.println("Addition of two numbers: "+add);
    }

}