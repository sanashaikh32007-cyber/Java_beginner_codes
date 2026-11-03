package com.company;
import java.util.Scanner;
public class DecisionMaking {
    public static void main (String[] args){
      
        // if else statements
        
       Scanner ifelse = new Scanner(System.in);
        System.out.println("checking whether you are eligible to drive or not");
        int age = ifelse.nextInt();
            if (age >= 18) {
                 System.out.println("You are eligible to drive!!!");
        }
            else {
                System.out.println("You are not eligible to drive yet");
        }
      
        // else if  law
      
        Scanner elseif = new Scanner(System.in);
        System.out.println("Enter your age");
        int age1 = elseif.nextInt();
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

        Scanner switches = new Scanner(System.in);
        System.out.println(" Enter your age :");
        int age2 = switches.nextInt();

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

        }

            // Enhanced switches.

        Scanner cs = new Scanner(System.in);
        System.out.println("enter your name");
        String var = cs.nextLine();
        switch (var) {
            case  "saurabh" -> {
                System.out.println("you are going to become an adult. ");
            }
            case "saubham" -> {
                System.out.println("You are a teenager ");
            }
            case  "sana" ->{
                System.out.println("You a super girl");
            }
            case "faizan" -> {
                System.out.println("You a Spider man");
            }
            case "sumaiya" ->  {
                System.out.println("You a gental women ");
            }
            case "sufiyan" ->{
                System.out.println("You a mouse");
            }
            case "kitty" ->{
                System.out.println("You a cute baby");
            }
            case "Parveen" ->{
                System.out.println("You a very strong Women");
            }
        }
    }
}
