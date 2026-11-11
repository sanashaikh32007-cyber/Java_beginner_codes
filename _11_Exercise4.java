package com.company;
import java.util.Scanner;
public class _11_Exercise4 {
    public static void main(String[] args){
      
        // print the following pattern
        //****
        //***
        //**
        //*

        for (int a = 4; a >= 1; a--) {

            for (int b = 1 ; b<=a ; b++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // same pattern using while loop
 
        int a2 = 4 ;
        while(a2 >= 1){
            int b2 = 1;
            while(b2 <= a2){
                System.out.print("*");
                b2++;
            }
                a2--;
            System.out.println();
        }
      
        //Same pattern using do while loop
 
          int h = 4;
          do{
              int g = 1 ;
              do {
                  System.out.print("*");
                  g++;
              }
              while(g<=h);
              h--;
              System.out.println();
          }
          while(h>=1);
 
        //sum of first 50 numbers using for loop , while loop and do while loop


        System.out.println("Using for loop");
        int sum = 0;
        for (int s = 1 ; s<=50 ; s++){
           sum = s+ sum;
        }
        System.out.println(sum);

        System.out.println("Using while loop");
        int sum1 = 0;
        int o = 1;
        while ( o<=50) {
            sum1 = o + sum1;
            o++;
        }
        System.out.println(sum1);

        System.out.println("Using do while loop");
        int sum2 = 0;
        int p = 1;
        do{
          sum2 = p + sum2;
            p++;
        }
        while (p<=50);
        System.out.println(sum2);

        //Multiplication table of 8 using while loop
 
        System.out.println("Using while loop to write a multiplication table of 8");
       int e = 1;
       while (e<=10){

           System.out.println("8 x " +e+ " = " +e*8);
           e++;
       }
      
        // Multiplication table of 16 using do while loop

        System.out.println("Using do while to write a multiplication table 16 ");
        int f = 1;
        do{
            System.out.println("16 x " +f+ " = " +f*16);
            f++;
        }
        while(f<=10);

        // Multiplication table of 18 using for loop

        System.out.println("Using for loop for printing multiplication table of 18 ");
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("18 x " + i + " = " +18*i);
        }

        //Multiplication table 34 in reversed order using while loop

        System.out.println("Multiplication table of 34 in reversed order");
        int j = 10;
        while (j>=1){
            System.out.println("34 x "+j+ " = " +j*34);
            j--;
        }
        System.out.println("Multiplication table of 54 in reversed order using do while loop");
        int k = 10;
        do{
            System.out.println("54 x " +k+ " = " +k*54);
            k--;
        }
        while (k >= 1);

        System.out.println("Multiplication table of 67 in reversed order using for loop");
        for(int z = 10 ; z >= 1 ; z-- ){
            System.out.println("67 x " +z+ " = " +67*z);
        }

        // factorial of any number using while loop, for loop and do while loop

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check the factorial of that number : ");
        int x = sc.nextInt();
        int fact = 1;
        while (x>=1){
            fact = fact * x;
            x--;
        }
        System.out.println(fact);

        // Finding factorial of a big number

        System.out.println("Enter a number to check the factorial of that number : ");
        BigInteger x = sc.nextBigInteger();
        BigInteger fact = BigInteger.ONE;
        while (x.compareTo(BigInteger.ONE) > 0){
            fact = fact.multiply(x);
            x = x.subtract(BigInteger.ONE);

        }
        System.out.println(fact);
 
        //for loop
 
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial");
        int fact1 = 1;
        for (int v = sa.nextInt() ; v>=1 ; v--){
            fact1 = fact1 * v;
        }
        System.out.println(fact1);

        // do while loop

        Scanner num = new Scanner (System.in);
        System.out.println("Enter a number to calculate the factorial");
        int fact2 = 1;
        int Q = num.nextInt();
        do{
           fact2 = fact2 * Q ;
           Q--;
        }
        while(Q>=1);
        System.out.println(fact2);
 
        // sum of the multiplication table
        int m = 1;
        int sums = 0;
        while(m<=10){

            sums = sums + (m*16);
            m++;
        }
        System.out.println(sum);
    }
}
