package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Scanner keyboard = new Scanner(System.in);

        System.out.println("Here is a nursery rhyme that can tell you about your character based on the day you were born");
        System.out.println("                                                       ");

        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");

        System.out.println("                                                       ");
        System.out.println("Would you like to see what the nursery says about you?");

    }

    public static void printMonthName(Scanner keyboard) {
        int month;
        System.out.println("What month were you born in? (Enter as a number)");
        month = keyboard.nextInt();
        switch (month) {
            case 1:
                System.out.println("January has 31 days.");
                break;
            case 2:
                System.out.println("February has 28 days.");
                break;
            case 3:
                System.out.println("March has 31 days.");
                break;
            case 4:
                System.out.println("April has 30 days.");
                break;
            case 5:
                System.out.println("May has 31 days.");
                break;
            case 6:
                System.out.println("June has 30 days.");
                break;
            case 7:
                System.out.println("July has 31 days.");
                break;
            case 8:
                System.out.println("August has 31 days.");
                break;
            case 9:
                System.out.println("September has 30 days.");
                break;
            case 10:
                System.out.println("October has 31 days.");
                break;
            case 11:
                System.out.println("November has 30 days.");
                break;
            case 12:
                System.out.println("December has 31 days.");
                break;


        }
    }

    public static void printDayBorn (Scanner keyboard) {
        int date;
        System.out.println("What is the date you were born?");
        


        int year;








    }


}










 /* 0=Saturday
 * 1=Sunday
 * 2 Monday
 * 3=Tuesday
 * 4=Wednesday
 * 5= Thursday
 * 6= Friday
 *
 *
 *
 *
 *3= March
 * 4= April
 * 5= May
 * 6= J
 *
 * J= actual year (20..)*/