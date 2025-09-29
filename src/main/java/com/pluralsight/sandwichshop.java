package com.pluralsight;

import java.util.Scanner;

public class sandwichshop {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        //Establish the known values
        double priceRegular = 5.45;
        double priceLarge = 8.95;
        double loadedregular = 1.00;
        double loadedlarge = 1.75;
        float discountStudentPercent = 0.10f;
        float discountSeniorPercent = 0.20f;



        //get unknown values(what size and age )
        System.out.println("What Sandwich Size do you want (1 or 2)");
        System.out.println(" 1. Regular Size: $5.45");
        System.out.println(" 2. Large Size: $8.95");
        System.out.println("Please select ( 1 or 2 )");
        int userOption = scanner.nextInt();

        //Check if they would like it loaded
        System.out.println("Would you like your Sandwich loaded?");
        System.out.println("1. Regular Loaded: $1.00");
        System.out.println("2. Large Size: 1.75");
        System.out.println(" Please select (1 or 2)");
        int userloadedchoice = scanner.nextInt();

        //Get the Users age
        System.out.println("What is your age?: " );
        int userAge = scanner.nextInt();


        //Identify the base price of the sandwich
        double subtotal;

        if (userOption == 1){
            subtotal = priceRegular;
        }
        else {
            subtotal=priceLarge;
        }

        //Identify if the user wants sandwich loaded.

        if (userloadedchoice == 1 ){
            subtotal = subtotal + loadedregular;
        }
        else {
            subtotal = subtotal+loadedlarge;
        }

        //identify if the user is eligible for discount.
        //Calculate discount
        double discountPercent;

        if (userAge <= 17) {
            //student discount
            discountPercent = discountStudentPercent;
        }else if (userAge >= 65){
            //Senior discount
            discountPercent = discountSeniorPercent;
        }
        else {
            //no discount
            discountPercent=0;
        }

        //Calculate discount
        double discountAmount = subtotal * discountPercent;


        //calculate the subtotal
        double totaldue = subtotal - discountPercent;


        //display the results
        //size of the sandwich and the price
        //Was discount applied
        //What was the total

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Discount: $%.2f\n", discountAmount);
        System.out.printf("Total Due: $%.2f\n", totaldue);




    }


}



