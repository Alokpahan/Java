// When a class inherits another class, it is known as a single inheritance.
// Also known as single inheritance
class student   // super class
{
    protected int roll, marks; // only protected can get access by sub class ie used in inheritance only 'private' can not get accesed
    String name;
    protected void input()
    {
        System.out.println("Enter rollno name and marks: ");
    }
}
class XYZ extends student     // sub- class
{
    void show()
    {
        roll=1;
        name= "XYZ";
        marks =89;
    
        System.out.println(roll+" "+name+" "+marks);
    }
}
class simple_inheritance
{
    public static void main(String [] args )
    {
        XYZ obj= new XYZ();
        obj.input();
        obj.show();
    }
}