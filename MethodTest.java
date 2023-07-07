public class MethodTest {
    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        test.sayHello();
        add(1,2);
        int rsl = showAddResult(1, 3);
        System.out.println(rsl);

        OtherMethod.showMessage("This message is calling from another class");
    }

    void sayHello() {
        System.out.println("Hello");
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static int showAddResult(int a, int b) {
        return a + b;
    }
}
