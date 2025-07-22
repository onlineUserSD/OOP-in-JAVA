class ClassDemo {
    int a = 20;
    void show(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ClassDemo obj = new ClassDemo();
        obj.show();   // we cannot call the non-static method inside a static method so we have to make object of the class
    }
}
