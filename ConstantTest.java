public class ConstantTest {

    static final int MAX_COUNT;
    static final int INIT_COUNT;
    static {
        MAX_COUNT = 20;
        INIT_COUNT = 1;
    }

    static final String HR_SYS = "HR";

    enum Days {MON, TUE, WED, THU, FRI, SAT, SUN}

    public static void main(String[] args) {
        System.out.printf("max count is %d%n", MAX_COUNT);
        System.out.printf("initial count is %d%n", INIT_COUNT);
        System.out.printf("HR_SYS constant is %s%n", HR_SYS);
        System.out.printf("Your selected day is %s", Days.MON);

        Days day = Days.MON;
        System.out.println(day);
        day = Days.TUE;
        System.out.println(day);

    }
    
}
