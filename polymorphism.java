
 //Compile time polymorphism -> Mehtod overloading
// public class polymorphism {
//     void show(){
//         System.out.println("This is a show method");
//     }

//     void show(int a , int b){
//         System.out.println(a +" "+ b);
//     }
//     void show(int a , int b , int c){
//         System.out.println(a +" "+ b +" "+ c);
//     }

//     public static void main(String[] args) {
//         polymorphism p = new polymorphism();
//         p.show();
//         p.show(2,4,7);
//         p.show(8,4);
//     }
// }


class A{
    void show(int a){
        System.out.println(a);
    }
}
class B extends A{
    @Override
    void show(int a){
        super.show(200);
        System.out.println(a);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show(4);
    }
}
