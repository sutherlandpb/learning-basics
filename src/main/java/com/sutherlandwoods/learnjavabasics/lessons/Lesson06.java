package com.sutherlandwoods.learnjavabasics.lessons;

public class Lesson06 {

    /**
     * Let's learn about return values
     */
    public static void run() {
        System.out.println(getMessage());
    }


    /**
     * Methods can return a value.  Instead of "void" we put "String" as the type in front of the method name
     *
     */
    public static String getMessage() {
        String msg = "This was returned from my method call!";
        return msg;
    }
}
