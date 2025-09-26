package com.pluralsight;

import java.util.Scanner;

public class sandwichshop {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);


        //Prompt the user for the size of the sandwich (1 or 2):
        System.out.print("What size sandwich would we like today, regular or large? : ");
        String sizeChoice = input.nextLine();

        //Prompt the user for their age. 17 and younger or 65 and older:
        System.out.print("How old are you? : ");
        int age = input.nextInt();


        //Display what our user chooses
//        System.out.println("Okay you want " + sizeChoice);
//        System.out.println("Okay you're " + age);

        //Declare Sandwich prices
        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;

        //Declare Discount percentage
        double tenPercentDiscount = .10;
        double twentyPercentDiscount = .20;

        double regularSandwichDiscounted = regularSandwichPrice - (regularSandwichPrice * tenPercentDiscount / 100);

        if (age < 65 && sizeChoice == "regular"){
            System.out.println(regularSandwichDiscounted);
        }
        else;





//        if (sizeChoice.equals("regular")){
//            System.out.println(regularSandwichPrice);
//        }
//        else if ( sizeChoice.equals("large")){
//            System.out.println(largeSandwichPrice);
//        }





        //Next we want to check what they chose and save it




    }

}
