package ExampleConstructor;

public class NewClass {
    public static void main(String[] args) {
        Example example = new Example("Alexandru");
        System.out.println(example.testValue);
    }
    public static void printName(String name) {
        System.out.println(name);
    }
}
