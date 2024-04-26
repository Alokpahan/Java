// The main purpose of constructor is to initialize the object 
class A
{
    int a;
    String name;
    /*A()   // Every java class has a constructor
    {
        a=0;
        name=null;
    }*/
    void show()
    {
        System.out.print(a+" "+name);
    }
}

class constructor
{
    public static void main(String [] args)
    {
        A obj=new A();
        obj.show();
    }
}