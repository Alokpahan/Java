class this_keyword_parametrized
{
    this_keyword_parametrized() // default constructor
    {
        this(1000); //it calls to the parametrized constructor , i.e--> it also used to call the parametrized constructor of the same class; 
    }
    this_keyword_parametrized(int a)     // parametrized constructor 
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        this_keyword_parametrized obj=new this_keyword_parametrized(); // it calls the default constructor then 'this' key word calls the parametrized constructor with some argument
    }
}