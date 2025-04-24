package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "Stay awhile and listen.",
                "Nothing is true, everything is permitted.",
                "The cake is a lie!",
                "War. War never changes.",
                "Had to be me. Someone else might have gotten it wrong.",
                "What is better - to be born good, or to overcome your evil nature through great effort?",
                "Snake? Snaaaaaake!",
                "It's dangerous to go alone! Take this.",
                "A man chooses, a slave obeys.",
                "Do a barrel roll!"
        };
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Display a quote #1 - #10");
//
//        System.out.println(quotes[15]);
        try{
            System.out.println("Display a quote #1 - #10");

            System.out.println(quotes[15]);

        } catch (RuntimeException e) {
            System.out.println(quotes[6]);
//            throw new RuntimeException(e);
        }
    }
}
