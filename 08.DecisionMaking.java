package com.company;
import java.util.Scanner;
public class DecisionMaking {
    public static void main (String[] args){
        
        Scanner SC = new Scanner(System.in);
        // if else statements
        
        System.out.println("checking whether you are eligible to drive or not");
        int age = SC.nextInt();
            if (age >= 18) {
                 System.out.println("You are eligible to drive!!!");
        }
            else {
                System.out.println("You are not eligible to drive yet");
        }
      
        // else if  law
      
        System.out.println("Enter your age");
        int age1 = SC.nextInt();
        if (age1 <= 3) {
            System.out.println("You are a Kid");
        }
        else if (age1 <= 12){
            System.out.println("You are a Children");
        }
        else if (age1 <=19) {
            System.out.println("You are a teen");
        }
        else if (age1 <=59) {
            System.out.println("You are an adult");
        }
        else {
        System.out.println("You are a senior citizen" );
        }

        //switch case
      
        System.out.println(" Enter your age :");
        int age2 = SC.nextInt();

        switch (age2){
            case  18 :
                System.out.println("you can work [ you have entered working class ]");
            break ;
            case 21 :
                System.out.println("you are eligible to vote.");
            break ;
            case 30 :
                System.out.println("you are a expericenced worker.");
            break ;
            case 70 :
                System.out.println("you are retired");
            break ;
            default :
                System.out.println("Hello!!!");

        }

            // Enhanced switches.
        SC.nextLine();
        System.out.println("\nenter your name");
        String var = SC.nextLine();
        switch (var) {
            case  "Saurabh" -> {
                System.out.println("you are going to become an adult. ");
            }
            case "Saubham" -> {
                System.out.println("You are a teenager ");
            }
            case  "Sana" ->{
                System.out.println("You a super girl");
            }
            case "Faizan" -> {
                System.out.println("You a Spider man");
            }
            case "Sumaiya" ->  {
                System.out.println("You a gental women ");
            }
            case "Sufiyan" ->{
                System.out.println("You a mouse");
            }
            case "Kitty" ->{
                System.out.println("You a cute baby");
            }
            case "Parveen" ->{
                System.out.println("You a very strong Women");
            }
            default :
                System.out.println("Hello!!!");
        }
    }
}
