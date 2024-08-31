package com.assignment;

import java.util.Scanner;

public class string_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;


        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Number of other characters: " + otherCount);

    }
}

