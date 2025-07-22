 class A {
    int a =1;
}

class B extends A{
  int b = 20;
}

class C extends B{
 int c = 30;
}

class D extends C {
 int d  = 40;
 public static void main(String[] args) {
    D obj = new D();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(obj.c);
    System.out.println(obj.d);
 }
}
