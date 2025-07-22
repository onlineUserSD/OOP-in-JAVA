
class A {
   int a = 100;
   static int b = 200; 
}

class B extends A{
public static void main(String[] args) {
    B obj = new B();
    int c  = 300;
    System.out.println(obj.a);
    System.out.println(A.b);
    System.out.println(c);
}
}
