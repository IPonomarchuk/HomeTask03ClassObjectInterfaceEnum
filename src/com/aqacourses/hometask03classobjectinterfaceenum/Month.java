package com.aqacourses.hometask03classobjectinterfaceenum;

class Month extends AbstractMonth {

    /**
     * Constructor that matching super constructor in class ancestor
     *
     * @param numOfMonth
     */
    Month(int numOfMonth) {
        super(numOfMonth);
    }

    /**
     * Method from abstract class that we must override
     */
    @Override
    void printPhrase() {
        System.out.println("I'm going to make him an offer he can't refuse.");
    }
}
