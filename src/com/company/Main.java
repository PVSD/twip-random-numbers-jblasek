package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int array[] = new int[1000];

        while (counter != 100) {
            int ranNum = ((int) (Math.random() * 100)) + 1;
            int i;

            System.out.println(ranNum);
            for (i = 0; i < 100; i++) {

                if (ranNum == array[ranNum]) {
                    array[ranNum - 1] = ranNum;
                    counter
                }

            }
        }
    }
}
