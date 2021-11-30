package com.company;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        // Write a Menu driven program in java to implement simple banking applications.
        //Application should read the customer name, account number, initial balance,
        //rate of interest, contact number and address field etc.

        Scanner sc = new Scanner(System.in);
        int Choice;
        boolean quit = false;
        float balance = 0f;

        do {
            System.out.println("1.Deposit money");
            System.out.println("2.Withdraw money");
            System.out.println("3.Check balance");
            System.out.print("0 to quit: ");
            Choice = sc.nextInt();

            switch (Choice) {

                case 1:
                    float amount;
                    System.out.println("Amount to be deposited: ");
                    amount = sc.nextFloat();
                    if (amount <= 0)
                        System.out.println("Cant deposit non-positive amount...");
                    else {
                        balance += amount;
                        System.out.println("₹" + amount + " has been deposited");
                    }
                    break;

                case 2:
                    System.out.println("Amount to be withdrawn: ");
                    amount = sc.nextFloat();
                    if (amount <= 0 && amount > balance)
                        System.out.println("Withdrawal can't be completed.");
                    else {
                        balance -= amount;
                        System.out.println("₹" + amount + " has been withdrawn.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance: ₹" + balance);
                    break;

                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("Wrong Input!");
                    break;
            }
            System.out.println();

        } while (!quit);
        System.out.println("End! ");

    }
}




