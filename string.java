//A String variable contains a collection of characters surrounded by double quotes:
class string {
    public static void main (String[] args)
    {
        String str="sunday";
        String str2=new String("sunday");
        int l=str.length();  // calculate the length of string 
        System.out.println(l);
        System.out.println(str.toUpperCase());// Output "SUNDAY"
        System.out.println(str.toLowerCase());// Output "sunday"
        System.out.println("Condition 'str==str2'");// checks the each storing variable  ie ('str' == 'str2')--> not equal , it don't check the content ,it checks the storing variable is same or not i.e they are referring to the same object of different reffered variable in String constant pool of heap memory.
        if(str==str2)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Not Equal");
        }


        System.out.println("Condition 'str.equals(str2)'"); // checks the each string/content ie ('sunday' == 'sunday')--> equal i.e equals() method compares the value of String objects
        if(str.equals(str2))  
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
    }
}