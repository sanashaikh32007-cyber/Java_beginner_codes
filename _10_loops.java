package com.company;
public class _10_loops {
    public static void main (String[] args){

        //While loop
        System.out.println("Using while loop.");
        int i = 1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
       // write first 100 natural numbers in reversed order using for loop, while loop and do while loop.
 
        System.out.println("Using while loop");
        int a = 100;
        while (a>=1) {
            System.out.println(a);
            a--;
        }
 
        // Do while loop
        System.out.println("Using do while loop");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }
        while (b<=100);

        System.out.println("Using do while loop");
        int c = 100;
        do{
            System.out.println(c);
            c--;
        }
        while (c>=1);
 
        // for loop
        System.out.println("using to for loop");
        for (int j = 1 ; j <= 100 ; j++) {
            System.out.println(j);
        }
 
        // Write a program to print frist 100 odd numbers using for loop
        int n = 100 ;
        for (int k=0 ; k < n ; k++ ){
            System.out.println(2*k+1);
        }
        
        //Write a pogram to print numbers from 1 to 100 in reverse order
        System.out.println("Using for loop ");
        for(int d = 100 ; d >= 1 ; d--){
            System.out.println(d);
        }
 
        //break statements
        for (int l = 1 ; l <= 100 ; l++){
            System.out.println(l);
            System.out.println("Java is great ");
            if (l == 9){
                System.out.println("Ending the loop");
                break;
            }
        }

        // continue statements
        for (int m = 1 ; m <= 100 ; m++) {
            if (m == 3) {
                System.out.println("hello");
                continue;
            }
            System.out.println(m);
            System.out.println("Java is great");

        }
    }
}
