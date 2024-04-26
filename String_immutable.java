//the + operator can be used between strings to combine them. This is called concatenation:
// also use the 'concat()' method to concatenate two strings:
class String_immutable
{
    public static void main(String[] args)
    {
        String str="Ankush";    // immutable(can't changed)  string constant pool mai memory create hoga ..
        String str1="Ankush";   // new memory is not created for str1 it only point towards the str  
        String str2=str.concat(" kumar"); // New ref by--> str2  by just making the duplicate/copy of str in str1.
        str.concat("kumar");    // Once the object is create, then it can't be change.
        System.out.println(str);  // Ankush --^
        System.out.print(str2); // Ankusk kumar
    }
}