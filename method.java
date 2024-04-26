// A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.
// Methods are used to perform certain actions, and they are also known as functions.
public class method {
    public static void main(String[] args) {

        int r = sum(10, 20); // calling 1
        System.out.println("Addition " + r);
        method obj = new method();
        obj.calling(); // calling 2

    }

    static int sum(int a, int b) // defination 1
    {
        return a + b;
    }

    void calling() // defination 2
    {
        System.out.print("Java ----> METHOD CONCEPT");
    }
}