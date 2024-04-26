//Arrays are used to store multiple values in a single variable
//A multidimensional array is an array of arrays.
//To create a two-dimensional array, add each array within its own set of curly braces:
import java.util.Scanner;// import package for input
public class array_two_d{
    public static void main(String [] args)
    {
        int a[][]={{10,20},{60,70}}; //a[2][2]--> array of 4 elements '2 X 2'
        System.out.print("a[1][1]= ");
        System.out.println(a [0][0]); // print a[1][1] --> a(1,1) element

        System.out.println("Enter four elements: ");
        int c[][] = new int [2][2];
        Scanner obj=new Scanner(System.in); 
        for(int i=0 ;i<2 ;i++)  // using FOR loop to insert the elemnts in the array  NOTE : 'FOR EACH LOOP' is not used to print matrix elements
        {
            for(int j=0 ;j<2 ;j++)
            {
                c[i][j]=obj.nextInt();
            }
        } 
        System.out.println("\nMatrix Elements");  //Printed each element by using FOR EACH LOOP 
        for(int i=0 ;i<2 ;i++)  // using FOR loop to print the elemnts in the array
        {
            for(int j=0 ;j<2 ;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();           
        }        
    }
}