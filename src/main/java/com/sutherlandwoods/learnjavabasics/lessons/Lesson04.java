package com.sutherlandwoods.learnjavabasics.lessons;

public class Lesson04 {

    /**
     * Lets learn how to use numbers and text together.
     */
    public static void run() {

        //int is short for "integer" which means "a whole number with no decimal places"
        //change the number to your birth year to see how old you are (or will be on your birthday this year)
        int myBirthYear = 1980;
        int currentYear = 2018;

        //My age is the current year minus the year I was born, you can easily do math inside your code
        int myAge = currentYear - myBirthYear;

        //uncomment this to show your answer
        //System.out.println("I am " + myAge + " years old");
    }
}
