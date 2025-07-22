interface  A {
   void show(); // this method is abstract + public
}
interface B{
   void display(); // this method is abstract + public
}

class C implements A,B{

@Override
public void display() {
   System.out.println("This is display method");
}

@Override
public void show() {
System.out.println("This is show method"); 
}

public static void main(String[] args) {
   C obj = new C();
   obj.show();
   obj.display();
}
}