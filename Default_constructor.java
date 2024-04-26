//A constructor is called "Default Constructor" when it doesn't have any parameter.
class a
{
    int a;
    String b;
    boolean c;
    a() // Default constructor
    {
        a=100;
        b="MONDAY";
        c=true;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class Default_constructor
{
    public static void main (String[] args)
    {
        a obj=new a();
        obj.show();

    }
}