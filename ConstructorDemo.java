class ConstructorDemo {
    // ConstructorDemo(){
    //     int a = 100;
    //     System.out.println("This is a constructor and value is "+a);
    // }

    int age;
    String name;
    double salary;
    boolean available;
    ConstructorDemo(){  // Default Contructor
        System.out.println(age+  name+ salary+ available);
    }
    ConstructorDemo(int a){  // Parameterized Contructor
        System.out.println(a);
    }
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(10); 
         ConstructorDemo obj1= new ConstructorDemo();// calling constructor, it does not need to be called explicitly. It will be automatically called during initialization of object.
    }
}