package com.winterbe.java8.samples;

import java.util.EnumSet;

public class Switch {

    public static void main(String[] args) {
        switchForInteger(3);
        switchWithMultipleCases(2);
        switchWithString("Apple");
        switchWithEnum(Day.WEDNESDAY);
    }

    // Basic switch statement with Integer
    private static void switchForInteger(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        System.out.println(dayName);
    }

    // Switch with multiple cases
    private static void switchWithMultipleCases(int number) {
        String result;
        switch (number) {
            case 1:
            case 2:
                result = "One or Two";
                break;
            case 3:
                result = "Three";
                break;
            default:
                result = "Other";
                break;
        }
        System.out.println(result);
    }

    // Switch with String
    private static void switchWithString(String fruit) {
        switch (fruit) {
            case "Apple":
                System.out.println("Apple selected");
                break;
            case "Banana":
                System.out.println("Banana selected");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }

    // Switch with Enum
    private static void switchWithEnum(Day today) {
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case WEDNESDAY:
                System.out.println("Midweek");
                break;
            case FRIDAY:
                System.out.println("End of work week");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }

    // Enum declaration for switchWithEnum method
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
}
