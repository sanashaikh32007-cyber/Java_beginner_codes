package com.company;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

      //taking name from the user and greeting the user
        Scanner name = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Enter you name :");
        String str = name.nextLine();
            System.out.print("Hello ");
            System.out.println(str+" have a good day");

      
        //Program to calculate percentage, grade and cgpa of a student
            System.out.println("calculating percentage and grade of a student:");
        Scanner sc  = new Scanner(System.in);
            System.out.println("Marks in English");
        float a = sc.nextFloat();
            System.out.println("Marks in Maths");
        float b = sc.nextFloat();
            System.out.println("Marks in Physics");
        float c = sc.nextFloat();
            System.out.println("Marks in Chemistry");
        float d = sc.nextFloat();
            System.out.println("Marks in Geography");
        float e = sc.nextFloat();
            System.out.println("Marks in Computer science");
        float f = sc.nextFloat();
        float percentage = (a + b + c + d + e + f)/600 * 100 ;
            System.out.println("The percentage of the student is: " +percentage);
            System.out.println(" ");
        if(percentage>=90){
            System.out.println("Grade : A+");
        }
        else if(percentage>=80){
            System.out.println("Grade : A");
        }
        else if(percentage>=70){
            System.out.println("Grade : B+");
        }
        else if(percentage>=60){
            System.out.println("Grade : B");
            }
        else if(percentage>=50){
            System.out.println("Grade : C+");
        }
        else if(percentage>=40){
            System.out.println("Grade : C");
        }
        else if(percentage>=35){
            System.out.println("Garde : D+");
        }
        else{
            System.out.println("Grade : Fail");
        }
            System.out.println(" ");
        float cgpa10 = percentage / 9.5f;
            System.out.println("Cgpa on the scale of 10 : " + cgpa10 );


        float cgpa4 =( percentage / 100) * 4;
            System.out.println("Cgpa on the scale of 4 : " + cgpa4 );

        //convert kilometer to miles
            System.out.println(" ");
        Scanner km = new Scanner (System.in);
            System.out.println("enter distance in kilometer");

        float distance = km.nextFloat();
        float miles = distance * 0.621371f;
            System.out.println("The entered distance in miles is : " +miles);


    }
}
