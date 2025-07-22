class B{
    int a =  100; // instance variable
    static int b = 200; // static variable
}

class C{
    public static void main(String[] args) {
        B b1 = new B();
        int c = 100; // local variable
        System.out.println(b1.a);
        System.out.println(B.b);
        System.out.println(c);
    }
}