/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Exercise22 {
    public static void main(String args[]) {
        System.out.println("Enter the first number:");
        Scanner UserInput = new Scanner(System.in);
        int first = UserInput.nextInt();

        System.out.println("Enter the second number:");
        int second = UserInput.nextInt();

        System.out.println("Enter the third number:");
        int third = UserInput.nextInt();

        if (first > second && first > third){
            System.out.println("The Largest number is "+first);
        }else if (second > first && second > third){
            System.out.println("The Largest number is "+second);
        }else if (third > first && third > second){
            System.out.println("The Largest number is "+third);
        }
    }
}