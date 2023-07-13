class StatementTest {

    public static void main(String[] args) {
        
        // declaration statement
        int i;
        String str;
        StatementTest test;
        int array[];

        // assignment statement
        i=10;
        str = "hello";

        // object creation statement
        test = new StatementTest();
        array = new int[3];

        // Method invocation statement
        test.showMessage();

    }

    void showMessage() {
        System.out.println("hello java");
    }
}