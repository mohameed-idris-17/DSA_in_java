class A {
    A() {
        System.out.println("Parent");
    }
}

class B extends A {
     B() {
        // super();
        System.out.println("Child");
    }
}
public class MethodOverloading {
   public static void main(String[] args) {
       B obj = new B();
        // Child
   }
}
