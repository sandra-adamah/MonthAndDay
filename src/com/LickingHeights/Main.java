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

        int month;
        System.out.println("What month were you born in? (Enter as a number)");
        month = keyboard.nextInt();

        int date;
        System.out.println("What is the date you were born?");
        date = keyboard.nextInt();

        int year;
        System.out.println("What is the year you were born?");
        year = keyboard.nextInt();



        System.out.println (printMonthName(month, year));
         System.out.println(printNurseryLine(month));

    }
    public static String printMonthName(int tempMonth, int year) {

        switch (tempMonth) {
            case 1:
                return "January has 31 days.";

            case 2:
                if (year % 4 ==0) {
                    if  (year % 100 ==0){
                        if(year % 400 ==0){
                            return "February has 29 days"; }
                        else{ return "February has 28 days"; } }
                    else { return "February has 28 days"; } }
                else{ return "February has 28 days";
                }

            case 3:
                return "March has 31 days.";

            case 4:
                return "April has 30 days.";

            case 5:
                return "May has 31 days.";

            case 6:
                return "June has 30 days.";

            case 7:
                return "July has 31 days.";

            case 8:
                return "August has 31 days.";

            case 9:
                return "September has 30 days.";

            case 10:
                return "October has 31 days.";

            case 11:
                return "November has 30 days.";

            case 12:
                return "December has 31 days.";
            default:
                return "Could not calculate the month";


        }
    }
    public static int printDayBorn (int date, int year, int month){
        int J, K;
        int dayResult;
        J = (year/100);
        K = (year % 100);

        dayResult = (date+ (13*(month+1)/5))+K+(K/4)+(J/4)+(5*J)%7;

        return printDayBorn(date, year, month);

    }
    public static String printNurseryLine (int dayResult){
        switch (dayResult){
            case 0:
                return "You were born on a Saturday" +
                        "According to the poem you are someone who works hard for a living.";
            case 1:
                return "You were born on a Sunday" +
                        "According to the poem you are someone who is fair, wise, and good in every way.";
            case 2:
                return "You were born on a monday" +
                        "According to the poem you are someone who is fair of face.";
            case 3:
                return "You were born on a Tuesday" +
                        "According to the poem you are someone who is fu8ll of grace.";
            case 4:
                return "You were born on a Wednesday" +
                        "According to the poem you are someone who is full of woe.";
            case 5:
                return "You were born on a Thursday" +
                        "According to the poem you are someone who has far to go.";
            case 6:
                return "You were born on a Friday" +
                        "According to the poem you are someone who is loving and giving.";
            default:
                return "error";
        }
    }
}


//J= actual year (20..)