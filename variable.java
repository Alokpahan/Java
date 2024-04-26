class variable {
    int a = 10; // instamnce variable
    static double b = 20.5; // Staic variable

    public static void main(String[] args) {
        int c = 60;
        boolean d = true; // local variable
        variable obj = new variable();
        System.out.println("First Java program");
        System.out.println(obj.a); // As it is calling instance variable so we use the obj.a (object_name dot
                                   // variable)
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(obj.a + " " + b + " " + c + " " + d); // string concatenation '+' is used as to print the
                                                                 // multiple value of a variable in a single statement

    }

}
