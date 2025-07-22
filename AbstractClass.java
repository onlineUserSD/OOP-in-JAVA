abstract class AbstractClass {
    public abstract void show();
    public abstract void display();
    void show2(){}
}

abstract class A extends AbstractClass{
    @Override
    public void show() {
        System.out.println("This is abstract method show");
    }
}

class B extends A{
    @Override
    public void display() {
        System.out.println("This is abstract method display");
     }

     public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.display();
     }
}