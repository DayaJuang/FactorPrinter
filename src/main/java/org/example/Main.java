package org.example;

public class Main {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int n){
        // Check if n is greater than 1 (we don't want any 0 or negative input)
        if(n < 1)
            System.out.println("Invalid Value");

        // Check the factor of n
        int factor = 1; // initiate the factor

        while(factor <= n){
            // Check if the factor has remainder or not
            if(n % factor == 0)
                System.out.println(factor);
            factor++;
        }
    }
}