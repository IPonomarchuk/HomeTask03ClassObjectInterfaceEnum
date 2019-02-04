package hometask03classobjectinterfaceenum;

public class Runner {

    public static void main(String[] args) {

        Day day = new Day();
        System.out.println(day.returnDayNameByNum(3));
        System.out.println(day.returnDayNumByName("Monday"));
        day.printPhrase();

        Month month = new Month(2);
        System.out.println(month.getMonthNameByNum(2));
        month.printPhrase();

    }

}
