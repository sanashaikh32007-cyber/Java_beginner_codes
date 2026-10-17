package com.company;
import java.util.Scanner;
public class basic1 {
    public static void main(String[] args){
      //Printing in java
        System.out.println("Hello world");

      //Taking input from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
        System.out.println("Enter a number");
      System.out.println("Your entered number is: "+num);

      //Taking input from user and adding the integers integers
      System.out.println("Adding 5 numbers:");
        Scanner sc1 = new Scanner (System.in);

        System.out.println("Enter your first number");
        int a  = sc1.nextInt();
        System.out.println("Enter your second  number");
        int b = sc1.nextInt();
        System.out.println("Enter your third number");
        int c = sc1.nextInt();
        System.out.println("enter your fourth number");
        int d = sc1.nextInt();
        System.out.println("enter your fifth number");
        int e = sc1.nextInt();

        int sum = a + b + c + d + e ;
        System.out.println("the sum of this numbers is:" + sum);

      // Checking if the  user entered number is an integer or not
      System.out.println("Enter a number to check whether it is an integer or not");
        System.out.println("Enter a number");
        // program to check whether entered number is a
        Scanner integer = new Scanner(System.in);
        boolean b1 = integer.hasNextInt();
        System.out.println("Result: "+b1);
    }
}

// Some other methods to print are
//System.out.print -> no new line at the end the next line will after this same line.
//System.out.printf
//System.out.format
