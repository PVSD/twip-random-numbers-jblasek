package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int attempts = 0;
        int amtOfTimes = 0;
        int avgNum = 0;
        Scanner kbRd = new Scanner(System.in);

        System.out.println("Do you want to loop 100, 1,000, or 10,000 times?");
        String response = kbRd.next();

        //100 tries
        if (response.equals("100")) {

            while (amtOfTimes < 100) {
                counter = 0;
                int array100[] = new int[100];
                while (counter != 100) {
                    int ranNum = ((int) (Math.random() * 100)) + 1;

                    if (ranNum != array100[ranNum - 1]) {
                        array100[ranNum - 1] = ranNum;
                        counter++;
                        attempts++;
                    } else {
                        attempts++;
                    }
                }
                avgNum += attempts;
                amtOfTimes++;
                System.out.println(amtOfTimes);
            }
        }
        //1000 tries
        else if (response.equals("1000") || response.equals("1,000")) {

            while (amtOfTimes < 1000) {
                counter = 0;
                int array1000[] = new int[1000];
                while (counter != 1000) {
                    int ranNum = ((int) (Math.random() * 1000)) + 1;

                    if (ranNum != array1000[ranNum - 1]) {
                        array1000[ranNum - 1] = ranNum;
                        counter++;
                        attempts++;
                    } else {
                        attempts++;
                    }
                }
                avgNum += attempts;
                amtOfTimes++;
                System.out.println(amtOfTimes);
            }
        }
            //10,000 tries
        else if (response.equals("10000") || response.equals("10,000")) {

            while (amtOfTimes < 10000) {
                counter = 0;
                int array10000[] = new int[10000];
                while (counter != 10000) {
                    int ranNum = ((int) (Math.random() * 10000)) + 1;

                    if (ranNum != array10000[ranNum - 1]) {
                        array10000[ranNum - 1] = ranNum;
                        counter++;
                        attempts++;
                    } else {
                        attempts++;
                    }
                }
                avgNum += attempts;
                amtOfTimes++;
                System.out.println(amtOfTimes);
            }
            }

            else{
            System.out.println("That dont make sense...get out");
            System.exit(0);
        }
            int finalAvgNum = (attempts / amtOfTimes);

            System.out.println("Average for " + response + " iterations is " + finalAvgNum);
            System.out.println("Do you want to know why the spread of numbers decrease when the number of iterations increases? yes or no");

            response = kbRd.next();

            if(response.toLowerCase().equals("yes")){
                System.out.println("The spread of numbers decrease when the amount of iterations increase because there is a larger set of numbers to work with. The more results there are, the more precise the answer will become.");
            }
            else{
                System.out.println("darn...what a Shnoober_2");
            }
        }
    }





