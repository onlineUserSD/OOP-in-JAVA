class Encapsulation {
private int a;
private int b;

public void setter(int a ,int b){
    this.a = a;
    this.b = b;
}
public void getter(){
     System.out.println(a+" "+b);
}
}

class A{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setter(4, 6);
        obj.getter();
    }

}
