class PrimitiveTypeCasting {
    public static void main(String[] args) {
        
        byte b = 3;
        short s = 20;
        int i = 10;
        long l = 128;

        // you can add small type into large type
        // l = i;
        // l= i;

        // you need to change type when you want to add large type into small type
        b = (byte)l;
        System.out.println(b);

        // takeValue(10);
        // takeValue(10f);
        // takeValue(10d);
        // takeValue((byte) 2000);
        // takeValue((short) 2000);
        // takeValue(2000l);


    }

    static void takeValue(byte b) {
        System.out.println("Byte is working");
    }

    static void takeValue(short s) {
        System.out.println("Short is working");
    }

    static void takeValue(int i) {
        System.out.println("Integer is working");
    }

    static void takeValue(long l) {
        System.out.println("Long is working");
    }

    static void takeValue(float f) {
        System.out.println("Float is working");
    }

    static void takeValue(Double d) {
        System.out.println("Double is working");
    }
}