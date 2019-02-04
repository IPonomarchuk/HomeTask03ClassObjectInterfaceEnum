package hometask03classobjectinterfaceenum;

public class Month extends AbstractMonth {

    Month(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("I'm going to make him an offer he can't refuse.");
    }
}
