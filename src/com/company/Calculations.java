package com.company;

import java.util.Scanner;

public class Calculations {


    public static void main(String[] args) {

        /* 1.factorial()
        2. testArmstrong()
        3. testPalindrome()
        4. testPrime()
        5. fibonacciSeries() */

        int i, fact = 1,r, sum = 0, temp, m = 0, n = 0, n1 = 0, n2 = 1, n3;
        boolean quit=false;
        System.out.println("Enter number :-");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        do {

            System.out.println("Enter 0.quit");
            System.out.println("1.Factorial");
            System.out.println("2.Armstrong");
            System.out.println("3.Palindrome");
            System.out.println("4.Prime");
            System.out.println("5.fibonacci");


            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    for (i = 1; i <= num; i++) {
                        fact = fact * i;

                    }
                    System.out.println("the factorial of number is :" + fact);
                    break;

                case 2:

                    int N, rem, result = 0;

                    N = num;

                    while (N != 0) {
                        rem = N % 10;
                        result += Math.pow(rem, 3);
                        N /= 10;
                    }

                    if (result == num)
                        System.out.println(num + " is an Armstrong number.");
                    else
                        System.out.println(num + " is not an Armstrong number.");
                    break;
                case 3:

                    temp = num;
                    while (num > 0) {
                        r = num % 10;
                        sum = (sum * 10) + r;
                        num = num / 10;
                    }
                    if (temp == sum)
                        System.out.println("palindrome number ");
                    else
                        System.out.println("not palindrome");
                    break;

                case 4:

                    m = num / 2;
                    if (num == 0 || num == 1) {
                        System.out.println(num + " is not prime number");
                    } else {
                        for (i = 2; i < m; i++) {
                            if (n % i == 0) {
                                n = 1;
                                break;
                            }
                            if(n==1)
                                System.out.println(num + " is not prime number");
                            else
                                System.out.println(num + " is prime number");

                        }
                    }
                    break;

                case 5:
                    System.out.print(n1 + " " + n2);

                    for (i = 2; i < num; ++i) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;
                    }

                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;
            }
        }while (!quit) ;
        System.out.println("Bye!");

    }
}
