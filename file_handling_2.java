// In Java, a File is an abstract data type. A named location used to store related information is known as a File. There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.
//  create a file
import java.io.*; // '*' it will import io pakage of any classes 
class file_handling_2
{                                                           // Throws Exception or throws IOException can be handel by JVM or we can use try catch technique 
                                                            // The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. 
                                                            // It is always used with method signature.
    public static void main(String[] args) throws Exception     
    {
        // creation of file
        File f=new File("C:\\Users\\Alok & Ajay\\Desktop\\java_file.txt");  
        
            if(f.createNewFile())   //'CreateNewFile' it create a new file
            {
                System.out.println("File Successfully Create...");
            }
        else
            {
                System.out.println("File already Exits...!");
            }


        // Data input
        
            FileWriter f1=new FileWriter("C:\\Users\\Alok & Ajay\\Desktop\\java_file.txt");
            
            {
                f1.write("Java Programming\nIn Java, a File is an abstract data type. A named location used to store related information is known as a File. There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.\n\nStream\nA series of data is referred to as a stream. In Java, Stream is classified into two types, i.e., Byte Stream and Character Stream.\nFile Operations in Java\n\nByte Stream\nByte Stream is mainly involved with byte data. A file handling process with a byte stream is a process in which an input is provided and executed with the byte data.\n\nCharacter Stream\nCharacter Stream is mainly involved with character data. A file handling process with a character stream is a process in which an input is provided and executed with the character data.  ");
                f1.close(); //closing statement as to provide security purpose
            }
            System.out.println("Successfully Data wrote in file");
        
            

        //Read a file in console
        
            FileReader r=new FileReader("C:\\Users\\Alok & Ajay\\Desktop\\java_file.txt");  // this class is used to read a file
            
                {
                    int i;
                    while((i=r.read())!=-1)   // it read a single by single character in integer format
                    {
                        System.out.print((char)i);
                    }
                }
               System.out.print("File closed");
       
    }
}
