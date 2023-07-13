public class DayEnumTest {

    public static void main(String[] args) {
        // get all days
        System.out.println("Get all days and find holiday");
        for(DayEnum dayEnum : DayEnum.values()) {
            FindHoliday holiday = dayEnum;
            System.out.println(dayEnum);
            holiday.isHoliday();
            // Calling ordinal() to find index of color.
            System.out.println(dayEnum + " at index " + dayEnum.ordinal());
        }
        System.out.println("Value of MONDAY " + DayEnum.valueOf("MONDAY"));

        // get specific day
        System.out.println("======================================");
        System.out.println("Get specific day and find holiday");
        DayEnum day = DayEnum.MONDAY;
        System.out.println("today is " + day);
        System.out.println(day.getGreeting());    

        FindHoliday isHoliday = day;
        isHoliday.isHoliday();
    }            


    
}
