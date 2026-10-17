 package com.company;
import java.util.Scanner;
public class exercise2 {
    public static void main (String[] args){
      
   //[ QUESTION 1 ]  
   //Write a code that initializes two variables, a and b, with the values 5.2 and 2.6 (respectively).
   //After that, initialize another variable c that will hold the result of a / b.

        double a = 5.2 ;
        double b = 2.6 ;
        double c = a / b ;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
      

    //[ QUESTION 2 ]
   // using comparision operator to check whether the  user entered number is greater than then a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether your enter number is greater or not");
        int x = 99;
        System.out.println(" ");
        System.out.println("Enter your number : ");
        float y = sc.nextInt();
        System.out.println(y>x);

      
  //[ QUESTION 3 ]
  //Write a code that initializes three variables, d (int), e (double) and f (int) with the values 9, 2.6, and 11 (respectively).
  //After that, initialize the following variables:
  //g (int) that will hold the result of d modulo 2 
  //h (int) that will hold the result of d modulo 3
  //i (double) that will hold the result of e modulo 1.5
  //j (double) that will hold the result of e modulo 3.9
  //k (int) that will hold the result of f modulo 10

        int d = 9 ;
        double e = 2.6 ;
        int f = 11 ;

        int g = d % 2 ;
        int h = d % 3 ;
        double i = e % 1.5 ;
        double j = e % 3.9 ;
        int k = f % 10 ;
        
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);


      //[ QUESTION 4 ]
      //You're building a simple shopping calculator. Follow these steps:
      //Create these variables with the given values:
      //itemPrice (double): 12.99
      //quantity (int): 5
      //taxRate (double): 0.08
      //discount (double): 2.50
      //Using arithmetic operators, calculate and store:
      //subtotal (double): itemPrice * quantity
      //taxAmount (double): subtotal * taxRate
      //discountedAmount (double): subtotal - discount
      //finalTotal (double): discountedAmount + taxAmount

        double itemPrice = 12.99;
        int quantity = 5;
        double taxRate = 0.08;
        double discount = 2.50;

        // Calculate the amounts
        double subtotal = itemPrice * quantity;
        double taxAmount = subtotal *  taxRate;
        double discountedAmount = subtotal-discount ;
        double finalTotal = discountedAmount + taxAmount;
        
        // Print those calculated values
        System.out.println("Shopping Calculator Results:");
        System.out.println("-------------------------");
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Discounted Amount: $" + discountedAmount);
        System.out.println("Final Total: $" + finalTotal);

      
     //[ QUESTION 5 ]
    // You're creating a simple game score tracker. The program starts with certain values and you need to update them using increment and decrement operators.
    //You start with these initial values:
    //lives = 3
    //score = 100
    //level = 1
    //coins = 5
    //Perform these operations in order:
    //Player lost 2 lives (use decrement twice)
    //Player collected 3 coins (use increment three times)
    //Player gained 1 life (use increment once)
    //Player advanced to next level (use increment once)
    //Player lost 4 coins (use decrement four times)

        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;
        
        // Add your operations below
        lives--;
        lives--;
        coins++;
        coins++;
        coins++;
        lives++;
        level++;
        coins--;
        coins--;
        coins--;
        coins--;

        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);

      
      //[ QUESTION 6 ]
      // take a number from user and increase it by 8 and then show the original number entered by the user.
      
        System.out.println("increasing your number by 8 and then showing the original number:");
        System.out.println("Enter your number : ");
        int AA = sc.nextInt();
        int BB = AA + 8;
        int CC = BB - 8;
        System.out.println("your number after incryption is : " + BB);
        System.out.println("your number after decryption is : " + CC);
      
      
      //[ QUESTION 7 ]
      //You are given a code, asign the values to the variables b1 and b2 so that b3 holds true.

        boolean b1 = 3>4 ;
        boolean b2 = 5>1 ;
        boolean b3 = b1 || b2;
        
        System.out.println("b3 = " + b3);
      

      //[ QUESTION 8 ]
      //Let's create a program to decide if it's a good day for solar panel energy production
      //Initialize these variables:
      //isSunny with the value true
      //windSpeed with the value 5.4
      //temperature with the value 23
      //solarPanelOutput with the value 9
      //isCloudy with the value false
      //Create one logical expression that checks ALL of these conditions:
      //It's sunny
      //The wind speed is less than 10
      //The solar panel output is less than 15
      //The temperature is above 20 OR there are no clouds

        boolean isSunny = true;
        double windSpeed = 5.4;
        int temperature = 23;
        int solarPanelOutput = 9;
        boolean isCloudy = false;

        boolean result = isSunny && windSpeed < 10 && solarPanelOutput < 15 && (temperature > 20 || !isCloudy);

        System.out.println("Checking conditions for solar energy production...");
        System.out.println("1. Is it sunny? " + isSunny);
        System.out.println("2. Is wind speed safe? " + (windSpeed < 10));
        System.out.println("3. Can panels produce more? " + (solarPanelOutput < 15));
        System.out.println("4. Is temperature good OR no clouds? " + (temperature > 20 || !isCloudy));
        System.out.println("\nFinal result - Good day for solar energy production: " + result);


      //[ QUESTION 9 ]
      //You're helping a pet shop create a system to determine if they can sell a pet to a customer.
      //Initialize the following variables:
      //hasLicense with the value true
      //hasSpace with the value false
      //hasExperience with the value true
      //Write the following logical expressions to determine if:
      //canSellRegularPet: Customer needs EITHER a license OR experience, AND must have space
      //canSellExoticPet: Customer needs BOTH a license AND experience, AND must have space
      //cannotSellAnyPet: Customer has NO license AND NO experience, OR has NO space
      //result: canSellRegularPet OR canSellExoticPet OR cannotSellAnyPet

        // Initialize variables
        boolean hasLicence = true ;
        boolean hasSpace = false ;
        boolean hasExperience = true ;

        // Calculate conditions
        boolean canSellRegularPet = (hasLicence || hasExperience) && hasSpace;
        boolean canSellExoticPet = hasLicence && hasExperience && hasSpace;
        boolean cannotSellAnyPet = (!hasLicence && !hasExperience) || !hasSpace;
        boolean result = (canSellRegularPet || canSellExoticPet) || cannotSellAnyPet;

        // print result
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + result);



      //[ QUESTION 10 ]
     // You're creating a security system with multiple sensors. Calculate if the system should trigger an alarm based on different sensor combinations.
    //Start with these sensor states:
    //motionDetected is true
    //doorOpen is false
    //windowOpen is true
    //systemArmed is true
    //Create these security conditions using logical operators:
    //alarmTrigger1: True if system is armed AND (motion is detected OR door is open)
    //alarmTrigger2: True if system is armed AND window is open AND NOT door is open
    //alarmTrigger3: True if NOT system is armed OR (NOT motion is detected AND NOT window is open)

      // Initial sensor states 
        boolean motionDetected = true;
        boolean doorOpen = false;
        boolean windowOpen = true;
        boolean systemArmed = true;
        
        // Calculate security conditions
        boolean alarmTrigger1 = systemArmed && (motionDetected || doorOpen);
        boolean alarmTrigger2 = systemArmed && windowOpen && !doorOpen;
        boolean alarmTrigger3 = !systemArmed || (!motionDetected && !windowOpen);
        
        System.out.println("Security System Status:");
        System.out.println("---------------------");
        System.out.println("Alarm Trigger 1: " + alarmTrigger1);
        System.out.println("Alarm Trigger 2: " + alarmTrigger2);
        System.out.println("Alarm Trigger 3: " + alarmTrigger3);


    }
      }


      
