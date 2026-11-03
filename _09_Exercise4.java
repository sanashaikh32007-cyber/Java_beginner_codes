package com.company;
import java.util.Scanner;

public class _09_Exercise4 {
    public static void main (String[] args) {

        Scanner SC = new Scanner (System.in);
      
        // checking if a student has passsed or not [ minimum 40% amd 35 marks in all the subjects]
        System.out.println("Checking if the student is passed or not ");
        
        System.out.println("enter your marks in English`");
            float a = SC.nextFloat();
        System.out.println("enter your marks in Computer science");
            float b = SC.nextFloat();
        System.out.println("enter your marks in Chemistry");
            float c = SC.nextFloat();
        System.out.println("enter your marks in physics");
            float d = SC.nextFloat();
        System.out.println("enter your marks in Maths");
            float e = SC.nextFloat();
        System.out.println("enter your marks in Biology");
            float f = SC.nextFloat();
            float percentage = (a + c + d + e + f )/600 * 100 ;

            if (percentage<40){
        System.out.println(" You are failed 'Try again' ");
        }
            else if (a < 35) {
                System.out.println("You are failed in english 'work hard and try again' ");
            }
            else if (b < 35) {
                System.out.println("You are failed in Computer Science 'work hard and try again' ");
            }
            else if (c < 35) {
                System.out.println("You are failed in Chemistry 'work hard and try again' ");
            }
            else if (d < 35) {
                System.out.println("You are failed in Physics 'work hard and try again' ");
            }
            else if (e < 35) {
                System.out.println("You are failed in Maths 'work hard and try again' ");
            }
            else if (f < 35) {
                System.out.println("You are failed in Biology 'work hard and try again' ");
            }
            else {
                System.out.println("You have passed the exam successfully");
            }
                System.out.println("your percentage is : " +percentage);

        // calculate the payable tax to the government
        //| Taxable income          | Tax rate |
        //| ----------------------- | -------: |
        //| Up to ₹4,00,000         |   **0%** |
        //| ₹4,00,001 – ₹8,00,000   |   **5%** |
        //| ₹8,00,001 – ₹12,00,000  |  **10%** |
        //| ₹12,00,001 – ₹16,00,000 |  **15%** |
        //| ₹16,00,001 – ₹20,00,000 |  **20%** |
        //| ₹20,00,001 – ₹24,00,000 |  **25%** |
        //| Above ₹24,00,000        |  **30%** |

            System.out.println("CALCULATING YOUR PAYABLE TAX \n   ");
        
            System.out.println("Enter you annual income : ");
            int amt = SC.nextInt();
            if (amt <= 400000){
                    System.out.println("your payable tax is 0% ");
            }
            else if (amt <= 800000 ){
                float income1 = amt - 400000;
                float tax1 = 0.05f*income1;
                    System.out.println("Your payable tax is : " +tax1);
            }
            else if (amt <= 1200000 ){
                double income0 = 0.05*400000.00 ;
                double income1 = amt - 800000 ;
                double tax2 = 0.1*income1;
                double finaltax1 = income0 + tax2;
                    System.out.println("Your payable tax is : " +finaltax1);
            }
            else if (amt <= 1600000 ){
                double income0 = 0.05*400000.00 ;
                double income1 = 0.1*400000.00 ;
                double income2 = amt - 1200000 ;
                double tax3 = 0.15*income2;
                double finaltax2 = income0 + income1 + tax3 ;
                    System.out.println("Your payable tax is : " +finaltax2);
            }
            else if (amt <= 2000000 ){
                double income0 = 0.05*400000.00 ;
                double income1 = 0.1*400000.00 ;
                double income2 =  0.15*400000.00;
                double income3 = amt - 1600000 ;
                double tax4 = 0.2*income3;
                double finaltax3 = income0 + income1 + income2 + tax4 ;
                    System.out.println("Your payable tax is : " +finaltax3);
            }
            else if (amt <= 2400000 ){
                double income0 = 0.05*400000.00 ;
                double income1 = 0.1*400000.00 ;
                double income2 =  0.15*400000.00;
                double income3 = 0.2*400000.00;
                double income4 = amt - 2000000 ;
                double tax5 = 0.25*income4;
                double finaltax4 = income0 + income1 + income2 + income3 + tax5 ;
                    System.out.println("Your payable tax is : " +finaltax4);
            }
            else {
                double income0 = 0.05 * 400000.00;
                double income1 = 0.1 * 400000.00;
                double income2 = 0.15 * 400000.00;
                double income3 = 0.2 * 400000.00;
                double income4 = 0.25 * 400000.00;
                double income5 = amt - 2400000;
                double tax6 = 0.3 * income5;
                double finaltax5 = income0 + income1 + income2 + income3 + income4 + tax6;
                System.out.println("Your payable tax is : " + finaltax5);
            }
            
