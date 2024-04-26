//parametrized_constructor has one or more parameters. 
//The parameterized constructor is used to provide different values to distinct objects
class A{
    int x,y;
    A(int a,int b)
    {
        x=a;    
        y=b;
    }
    A(int a,String b)
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }

}
class parametrized_constructor
{
    public static void main(String[] args)
    {
        A obj=new A(100,200);
        obj.show();
        A obj2=new A(10,"SUNDAY");
    }
}