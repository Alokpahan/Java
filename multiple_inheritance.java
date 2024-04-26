// multiple inheritance can achive through inface 
// because interface contain only absttract method which implementation is provided by sub classes
interface A 
{
    void show(); // by default public + abstract
    
}
interface B 
{
    void Disp(); // by default public + abstract
    

}
class multiple_inheritance implements A,B 
{
    public void show()
    {
        System.out.println("Interface A");
    }

    public void Disp()
    {
        System.out.println("Interface B");
    }
    public static void main(String[] args)
    {
        multiple_inheritance m=new multiple_inheritance();
        m.show();
        m.Disp();

    }
}