public class NumberTest {
    
    public static void main(String[] args) {
        for (String str : args ) {
            showLiterals(str);
        }
    }

    static void showLiterals(String str) {
        Integer value = Integer.parseInt(str);
        String octal = getLiteralNumber(value, 8);
        System.out.printf("Octal number of %d is %s %n", value, octal);
        System.out.printf("%s=%d %n", octal, Integer.decode(octal));

        String binary = getLiteralNumber(value, 2);
        System.out.printf("Binary number of %d is %s %n", value, binary);
        System.out.printf("%s=%d %n", binary, Integer.valueOf(binary,2));
    }

    static String getLiteralNumber(int data, int format) {
        StringBuilder sb = new StringBuilder();

        while(data > 0) {
            sb.append (data % format);
            data = (data / format);
        }

        sb.reverse();
        sb.insert(0, getPrefix(format));
        return sb.toString();

    }

    static String getPrefix(int format) {
        String prefix = null;

        switch (format) {
            case 2:
                prefix = "";
                break;
            
            case 8:
                prefix = "0";

            case 16:
                prefix = "0x";

            default:
                break;
        }
        return prefix;
    }
}
