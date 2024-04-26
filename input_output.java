import java.util.Scanner; // import package for input 

public class input_output {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Enter any two number: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = a + b;
        System.out.print("Sum of two numbers : " + c);
    }
}