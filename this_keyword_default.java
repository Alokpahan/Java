class this_keyword_default 
{
    this_keyword_default()  // default constructor
    {
        System.out.println("Default constructor");
    }
    this_keyword_default(int a) // parametrized constructor
     {
        this(); // it calls to the dafult constructor , i.e--> it also used to call the default constructor of the same class;
        System.out.println(a);

     }
      public static void main(String[] args)
    {
        this_keyword_default obj=new this_keyword_default(100); // it calls the parametrized constructor with some argument then 'this' key word calls the default constructor 
    }
}
   