package hometask03classobjectinterfaceenum;

public enum DaysOfWeek {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int numOfDay;

    DaysOfWeek(String name, int numOfDay) {
        this.name = name;
        this.numOfDay = numOfDay;
    }

    public String getName() {
        return name;
    }

    public int getNumOfDay() {
        return numOfDay;
    }
}
