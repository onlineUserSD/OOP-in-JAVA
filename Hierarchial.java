class Tree {
    void tshow(){
        System.out.println("Class Tree");
    }
}

class Human extends Tree{
      void hshow(){
        System.out.println("Class Human");
      }
}

class Bird extends Tree{
    void bshow(){
        System.out.println("Class Bird");
    }
}
public class Hierarchial {

    public static void main(String[] args) {
    Human h = new Human();
    Bird b = new Bird();

    h.hshow();
    h.tshow();

    b.bshow();
    b.tshow();
    }
}
