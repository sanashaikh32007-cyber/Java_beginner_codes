package com.company;
import java.util.Scanner;

public class _09_Exercise3DecisionMaking{
    public static void main (String[] args) {

        Scanner SC = new Scanner (System.in);

        //[if-else statements]
        
        //Your task is to initialize variable status based on the conditions:
                //"Calm" if wind is smaller than 8,
                //"Breeze" if wind is between 8 and 31 (including 8 and 31).
                //"Gale" if wind is between 32 and 63 (including 32 and 63)
                //"Storm" otherwise
             
        int wind = SC.nextInt(); 
        String status = "unset";
       
             if (wind<8){
                 status = "Calm";
             }
             else if (wind<=31){
                 status = "Breeze";
             }
             else if (wind <=63){
                 status = "Gale";
             }
             else {
                status = "Storm";
             }
        
        System.out.println("status = " + status);

       // Your task is to set the variable result based on the conditions:
       //if op is +, set result with n1 + n2.
       // if op is -, set result with n1 - n2.
       //if op is /, set result with n1 / n2.
       //if op is *, set result with n1 * n2.
        System.out.println("Enter 1st number");
        int n1 = SC.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = SC.nextInt(); 
        SC.nextLine(); 
        System.out.println("Enter the type of operation you wants to perform");
        String op = SC.nextLine();
        
     
        double result = 0;
        if (op.equals("+")){
            result = n1 + n2 ;
        }
        else if (op.equals("-")){
            result = n1 - n2 ;
        }
        else if (op.equals("/")){
            result = n1/n2;
        }
        else {
            result = n1*n2;
        }
        
        System.out.println(result);
        
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
            float percentage = (a + b + c + d + e + f )/600 * 100 ;

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

        //Create a program that checks if someone can ride a rollercoaster. The requirements are:
        //Must be at least 12 years old
        //Must be taller than 150cm
        //If they meet both requirements but are under 15, they need adult supervision
        //Print exactly these messages for each case:
        //If too young: Sorry, you're too young
        //If not tall enough: Sorry, you're not tall enough
        //If under 15 and no adult: Sorry, you need an adult with you
        //If under 15 with adult: You can ride with adult supervision!
        //If 15 or older and tall enough: You can ride by yourself!
        
        System.out.println("Enter your age in digits");
        int age = SC.nextInt(); 
         System.out.println("Enter Your height in CM");
        int height = SC.nextInt(); 
        boolean hasAdult = SC.nextBoolean(); 
        
         if (age < 12) {
            System.out.println("Sorry, you're too young");
        }
        else if (height <= 150) {
            System.out.println("Sorry, you're not tall enough");
        }
        else if (age < 15 && !hasAdult) {
            System.out.println("Sorry, you need an adult with you");
        }
        else if (age < 15 && hasAdult) {
            System.out.println("You can ride with adult supervision!");
        }
        else {
            System.out.println("You can ride by yourself!");
        }
        
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

            //Create the logic to determine the ticket type and price.
            //These variables are already set:
            //age (customer's age)
            //time (show time in 24-hour format, e.g., 1430 for 2:30 PM)
            //isHoliday (boolean indicating if it's a holiday)
            //Set the ticketType and price variables based on these conditions:
            //For children (age < 13):
            //"CHILD" ticket
            //Base price $8
            //Add $2 if it's a holiday
            //For teens (age 13-17):
            //"TEEN" ticket
            //Base price $12
            //Add $3 if it's a holiday
            //For adults (age 18-59):
            //"ADULT" ticket
            //Base price $15
            //Add $5 if it's a holiday
            //Subtract $3 if show time is before 1700 (5 PM)
            //For seniors (age 60 and above):
            //"SENIOR" ticket
            //Base price $10
            //No holiday surcharge
            //Subtract $2 if show time is before 1700 (5 PM)
                
                System.out.println("Enter Your age");
                int age = SC.nextInt();
                System.out.println("Enter your visiting time (in 24 Hours format)");
                int time = SC.nextInt(); 
                System.out.println("Enter if there is any public holiday on the day you are visiting (true/false)");
                boolean isHoliday = SC.nextBoolean();
        
                String ticketType = "unset";
                int price = 0;
                if (age<13){
                    if (isHoliday==true){
                    ticketType = "CHILD";
                    price = 10 ;
                    }
                }
                if (age<13){
                    if (isHoliday==false){
                    ticketType = "CHILD";
                    price = 8 ;
                    }
                }
                if (age>=13){
                    if (isHoliday==true){
                    ticketType = "TEEN";
                    price = 15 ;
                    }
                }
                if (age>=13){
                    if (isHoliday==false){
                    ticketType = "TEEN";
                    price = 12 ;
                    }
                }
                if (age>=18){
                    if (isHoliday==true){
                        if (time<1700){
                    ticketType = "ADULT";
                    price = 17 ;
                    }
                }
                }
                 if (age>=18){
                    if (isHoliday==false){
                        if (time<1700){
                    ticketType = "ADULT";
                    price = 12 ;
                    }
                }
                }
                if (age>=18){
                    if (isHoliday==true){
                        if (time>=1700){
                    ticketType = "ADULT";
                    price = 20 ;
                    }
                }
                }
                if (age>=18){
                    if (isHoliday==false){
                       if (time>=1700){ 
                    ticketType = "ADULT";
                    price = 15 ;
                    }
                }
                }
               if (age>=60){
                        if (time<1700){
                    ticketType = "SENIOR";
                    price = 8 ;
                    }
                }
                if (age>=60){
                    if (time>=1700){
                    ticketType = "SENIOR";
                    price = 10 ;
                    }
                }

        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
                
            //[Switches]

            //Create a program that takes a month number (1 for January, 2 for February, etc.) and prints the season it belongs to. Use a switch statement for the logic.
            //The seasons and their corresponding months are:
            //Winter: December (12), January (1), February (2)
            //Spring: March (3), April (4), May (5)
            //Summer: June (6), July (7), August (8)
            //Autumn: September (9), October (10), November (11)
            //For any other month number, print "Invalid month"

                
                int month = SC.nextInt();
                String season = "unset";
        
                    switch (month){
                    case 12 :
                    case 1 :
                    case 2 :
                        season = "Winter";
                    break;
            
                    case 3 :
                    case 4 :
                    case 5 :
                        season = "Spring";
                    break;

                    case 6 :
                    case 7 :
                    case 8 :
                        season = "Summer";
                    break;

                    case 9 :
                    case 10 :
                    case 11 :
                        season = "Autumn";
                    break;

                    default :
                        season = "Invalid month";
                    }
        
                        System.out.println(season);

                    //Ternary operator
                
                    //Create a program that checks if a number is positive, negative, or zero using the ternary operator. The program should:
                    //Take an integer input from the user.
                    //Use the ternary operator to determine if the number is positive, negative, or zero.
                    //Print the result in the format: "The number is [positive/negative/zero]"
        
                    int number = SC.nextInt();
                    String result = "unset";
        
                        result = (number == 0)? "zero" :  (number>=1) ? "positive" : "negative";
                        System.out.println("The number is " + result);

                SC.close()
                
    }
}
            
            
    
