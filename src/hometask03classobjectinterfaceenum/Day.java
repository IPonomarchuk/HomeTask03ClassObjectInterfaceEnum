package hometask03classobjectinterfaceenum;

public class Day implements InterfacePrint {

    private String name;
    private int numOfDay;

    @Override
    public void printPhrase() {
        System.out.println("It's my life and it's now or never! Cause I ain't gonna live forever, I just want live while I'm alive. It's my life!");
    }

    @Override
    public String returnDayNameByNum(int numOfDay) {

        switch (numOfDay) {
            case 1:
                name = DaysOfWeek.MONDAY.getName();
                break;
            case 2:
                name = DaysOfWeek.TUESDAY.getName();
                break;
            case 3:
                name = DaysOfWeek.WEDNESDAY.getName();
                break;
            case 4:
                name = DaysOfWeek.THURSDAY.getName();
                break;
            case 5:
                name = DaysOfWeek.FRIDAY.getName();
                break;
            case 6:
                name = DaysOfWeek.SATURDAY.getName();
                break;
            case 7:
                name = DaysOfWeek.SUNDAY.getName();
                break;
            default:
                System.out.println("Day doesn't exist");
                ;
                break;
        }

        return name;
    }

    @Override
    public int returnDayNumByName(String name) {

        switch (name) {
            case "Monday":
                numOfDay = DaysOfWeek.MONDAY.getNumOfDay();
                break;
            case "Tuesday":
                numOfDay = DaysOfWeek.TUESDAY.getNumOfDay();
                break;
            case "Wednesday":
                numOfDay = DaysOfWeek.WEDNESDAY.getNumOfDay();
                break;
            case "Thursday":
                numOfDay = DaysOfWeek.THURSDAY.getNumOfDay();
                break;
            case "Friday":
                numOfDay = DaysOfWeek.FRIDAY.getNumOfDay();
                break;
            case "Saturday":
                numOfDay = DaysOfWeek.SATURDAY.getNumOfDay();
                break;
            case "Sunday":
                numOfDay = DaysOfWeek.SUNDAY.getNumOfDay();
                break;
            default:
                System.out.println("Day doesn't exist");
                ;
                break;
        }

        return numOfDay;
    }
}
