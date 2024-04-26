//Arrays are used to store multiple values in a single variable
import java.util.Scanner;// import package for input
import java.util.Arrays; // import package for sorting arrry elements
public class array_one_d{
    public static void main(String [] args)
    {
        int a[]={10,20,30,40,50}; //a[5]--> array of 5 elements
        System.out.println(a [3]);
        System.out.println(a [4]);
        System.out.println("Printed each element by using FOR EACH LOOP");
        // for each loop
            for(int b:a)  // b:a ---> b=print all element of the array 'a'
            {
                System.out.print(b+ " ");
            }
        System.out.println();// newline
        System.out.println("Enter five elements: ");
        int c[] = new int [5];
        Scanner obj=new Scanner(System.in); 
        for(int i=0 ;i<5 ;i++)  // using FOR loop to insert the elemnts in the array
        {
            c[i]=obj.nextInt();
        } 
        System.out.println("Array Elements");  //Printed each element by using FOR EACH LOOP 
        for(int d:c)  // b:a ---> b=print all element of the array 'a'
            {
                System.out.print(d+ " ");
            }
        Arrays.sort(c); //predefined 'method' --> "sort" (we can call it pre-define 'function' in c , c++)
        System.out.println();// new line
        System.out.println("Sorted Array Elements");
        for(int d:c)     
            {
                System.out.print(d + " ");
            }     
    }
}