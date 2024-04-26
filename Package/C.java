package ABC;
import XYZ.A;  // or import XYZ.*   can also be use to acess all the classes
class C    // "class C extends A" can be in prtected must and (can/can not be use in public case only)
{
    public static void main (String [] args)
    {
        A obj=new A(); // A obj=new A();  for public case we use class 'A' as object
        obj.show();
    }
}
    