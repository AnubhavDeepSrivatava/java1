public class staticinstant {
    static int a = 25;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // Prints the local variable 'a'
        print();

        // Create an object of InnerStaticInstant to call its methods
        InnerStaticInstant obj = new InnerStaticInstant();
        obj.other();
    }

    public static void print() {
        System.out.println(a); // Prints the static variable 'a'
         // Create an object of InnerStaticInstant to call its methods
         InnerStaticInstant obj = new InnerStaticInstant();
         obj.other();
         System.out.println(obj.p);
    }
}

class InnerStaticInstant {
    static int p=2555; 
    public static  void other() { // Removed 'static' because it's an instance method
  
        System.out.println("Hello new class");
    }
}
