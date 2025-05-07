//invoke the static method
package Methods;

public class Code1 {
    public static void main(String[] args) {
        // calling a static method
        Test.fun();
    }
}

class Test {
    public static void fun() {
        System.out.println("Hello");
    }
}
