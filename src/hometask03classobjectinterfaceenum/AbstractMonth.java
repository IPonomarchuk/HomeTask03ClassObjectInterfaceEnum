package hometask03classobjectinterfaceenum;

abstract class AbstractMonth {

    private String name;

    AbstractMonth(int numOfMonth) {
    }

    abstract void printPhrase();

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    String getMonthNameByNum(int numOfMonth) {

        switch (numOfMonth) {
            case 1:
                name = Month.JANUARY.toString();
                break;
            case 2:
                name = Month.FEBRUARY.toString();
                break;
            case 3:
                name = Month.MARCH.toString();
                break;
            case 4:
                name = Month.APRIL.toString();
                break;
            case 5:
                name = Month.MAY.toString();
                break;
            case 6:
                name = Month.JUNE.toString();
                break;
            case 7:
                name = Month.JULY.toString();
                break;
            case 8:
                name = Month.AUGUST.toString();
                break;
            case 9:
                name = Month.SEPTEMBER.toString();
                break;
            case 10:
                name = Month.OCTOBER.toString();
                break;
            case 11:
                name = Month.NOVEMBER.toString();
                break;
            case 12:
                name = Month.DECEMBER.toString();
                break;
            default:
                System.out.println("Month doesn't exist");
                ;
                break;
        }

        return name;

    }

}
