// A polymorphism which is exits at the time of execution of a program is called compile time polymorphism
// also known as late binding or dynamic polymorphism


class shape // Super class
{
    
    void draw() // if 'draw' method is not present then it will give an error ie 'method does not override or implement a method from a supertype'
    {
        System.out.println("Can not say 'shape type' ");
    }
}

class square extends shape // sub- class
{
    @Override    // if 'draw' method is not over ridden then it will call super class's method ie 'Can not say 'shape type''
    void draw()
    {
        super.draw();  // 'super' keyword is used to call super class method 
        System.out.println("Square shape");
    }
}
class run_time_polymorphism
{
    public static void main(String[] args)
    {
        shape obj=new square();       // object ka reference --> shape-->  , object --> square  
        obj.draw();
    }
}
