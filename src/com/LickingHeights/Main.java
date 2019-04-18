package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month;
        int date;
        int year;

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
        System.out.println("What month were you born in? (Enter as a number)");
        month = keyboard.nextInt();

        System.out.println("What date were you born?");
        date = keyboard.nextInt();

        System.out.println("What year were you born?");
        year = keyboard.nextInt();









    }


}
