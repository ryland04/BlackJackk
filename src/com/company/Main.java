package com.company;

import jdk.nashorn.internal.objects.Global;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // computer number
        int compNum1 = getRandNum();
        int compNum2 = getRandNum();
        int compTotal = (compNum1 + compNum2);
        // user number
        int userNum1 = getRandNum();
        int userNum2 = getRandNum();
        int userTotal = (userNum1 + userNum2);

        System.out.println("these are ur cards: " + userNum1 + "and" + userNum2);
        System.out.println("total is:" + (userTotal));

        if (userTotal > 21) {
            System.out.println("ur total is over 21, loser");
        }
        if (compTotal > 21) {
            System.out.println("computer total is over 21, well done");
        }


    }


    // random number generator
    public static int getRandNum() {
        Random random = new Random();
        return random.nextInt(11) + 1;
    }
}}

// get new card
public static int newCard(){

}