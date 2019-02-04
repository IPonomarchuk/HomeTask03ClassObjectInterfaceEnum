package com.aqacourses.hometask03classobjectinterfaceenum;

/**
 * Enum. It's list of days of the week
 */
public enum DaysOfWeek {

    // This are values
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int numOfDay;

    /**
     * Constructor
     *
     * @param name
     * @param numOfDay
     */
    DaysOfWeek(String name, int numOfDay) {
        this.name = name;
        this.numOfDay = numOfDay;
    }

    /**
     * Getter of name of the day
     *
     * @return string with name of the day
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of day number
     *
     * @return day number
     */
    public int getNumOfDay() {
        return numOfDay;
    }
}
