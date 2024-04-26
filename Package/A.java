// User-defined packages are those packages that are designed or created by the developer to categorize classes and packages.
// compilation : javac -d . A.java
// execution : java Package_name.class_name/object_name
package XYZ;

public class A  // public for protected as well public cases
{
     public void show()    // private, default, protected and public case
    {
        System.out.println("Learn Coding...!");
    }
    
      
}
 /*class B extends A
{
    public static void main(String[] args) 
    {
       
      B obj=new B();     
        obj.show(); // it will not compiled because show() has private access in class A incase of private case
    }
}

*/


