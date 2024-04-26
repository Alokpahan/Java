//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
class A // Super class
{
    int a=10;   // variable
    void show() // method
    {
        System.out.println("hi");
    }
    A() // default consturctor
    {
        System.out.println("SUNDAY");
    }
    A(String a) // parametrized consturctor
    {
        System.out.println("SUNDAY"+a);
    }
}
class B extends A   // Sub class
{
    int a=20;   // variable
    void show() // method
    {
        System.out.println(a);
        System.out.println(super.a);    // variable : 'super' --> keyword, it is used to differentiate the members of super class form the members of sub class, if the name of both variable/ methods (i.e 'a') are same 
        super.show();   // method : 'super' --> keyword, it is used to differentiate the members of super class form the members of sub class, if the name of both variable/ methods (i.e 'show') are same 
        System.out.println("hello");
    }
    B() // default consturctor 
    {
       // super();    // reserved by the compiler,if you will not write 'super();' keyword then compiler will automatically call it in the case of default constructor
        System.out.println("MONDAY");
    }
    B(String a) // parametrized consturctor
    {
        super(a);    // here we need to mention 'super()' keyword as it is required in parametrized constructor
        System.out.println("MONDAY");
    }
}

class super_keyword
{
    public static void main(String[] args )
    {
        B obj=new B();
        obj.show(); 
        B obj2=new B("--> HOLIDAY");
        
    }
}