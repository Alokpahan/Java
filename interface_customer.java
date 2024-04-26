// Another way to achieve abstraction in Java, is with interfaces.
// An interface is a completely "abstract class" that is used to group related methods with empty bodies:

interface vehicle
{
    String name="TVS";  // public + static + final

    void start();   // public + abstract
    void stop();    // public + abstract

    default void color()
    {
        System.out.println("TVS color is RED");
    }

    static void speed()
    {
        System.out.println("TVS speed is 100 km/h");
    }
}
class interface_customer implements vehicle
{
    @Override // indicates that the child class method is over-writing its base class method.
    public void start()
    {
        System.out.println("start(): instet key & press start button");
    }

    @Override // indicates that the child class method is over-writing its base class method.
    public void stop()
    {
        System.out.println("stop(): exit key");
    }
    public static void main(String[] args)
    {
        interface_customer c=new interface_customer();
        c.start();
        c.stop();
        c.color();
        vehicle.speed();
        
    }
}
