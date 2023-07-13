public enum DayEnum implements FindHoliday {
    SUNDAY {
        public String getGreeting() {
            return "Enjoy your SUNDAY!";
        }
    },
    MONDAY {
        public String getGreeting() {
            return "Enjoy your MONDAY!";
        }
    },
    TUESDAY{
        public String getGreeting() {
            return "Enjoy your TUESDAY!";
        }
    },
    WEDNESDAY{
        public String getGreeting() {
            return "Enjoy your WEDNESDAY!";
        }

    },
    THURSDAY{
        public String getGreeting() {
            return "Enjoy your THURSDAY!";
        }
    },
    FRIDAY{
        public String getGreeting() {
            return "Enjoy your FRIDAY!";
        }
    },
    SATURDAY{
        public String getGreeting() {
            return "Enjoy your SATURDAY!";
        }
    };

    private final String dayName;

    private DayEnum() {
        this.dayName = name(); // get user selected day name
    }

    public abstract String getGreeting();

    public void isHoliday() {
        String sunday = DayEnum.SUNDAY.toString();
        String saturday = DayEnum.SATURDAY.toString();

        if (dayName.equals(saturday) || dayName.equals(sunday)) {
            System.out.println("Today is Holiday Yayyyyy!");
        } else {
            System.out.println("Ah Ohh, today isn't holiday! Ahhh!");
        }
    }
}
