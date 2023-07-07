public class LocalVariableTest {
    
    static String message = "Global Varaibles";
    String newMessage = "New Global Varaibles";
    
    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void localWillCall() {
        // variable hidding
        String message = "Local Varaibles";
        System.out.println(message);
    }

    public static void globalWillCall() {
        String message = "Local Varaibles";
        System.out.println(LocalVariableTest.message);
    }

    public void anotherWayOfGlobalCall() {
        String newMessage = "New Local Variables";
        System.out.println(this.newMessage);

    }

    public static void main(String[] args) {
        localWillCall();
        globalWillCall();

        // another way of calling global variable instead of local variable
        LocalVariableTest obj = new LocalVariableTest();
        obj.anotherWayOfGlobalCall();

    }

}
