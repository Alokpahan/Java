class class_and_object_person // Class is a virtual part, it don't required to create memory it consists/define of common property & behaviour of anything eg person, animal, book etc
{
    int age =21;
    int weight=56;
    String color="Light";

    void eat()
    {
        System.out.println("I'm Eating");
    }

    void sleep()
    {
        System.out.println("I'm Sleeping");
    }
    public static void main(String[] args)
    {
        class_and_object_person obj_p=new class_and_object_person(); // object is a real part ,through object it is used to access the define common property and behaviourof a class.
        System.out.println(obj_p.age);
        System.out.println(obj_p.weight);
        System.out.println(obj_p.color);
        obj_p.eat(); obj_p.sleep();
    }
}