
package org.example;
import java.io.IOError;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fibonacci Application takes a fibonacci term and return the value of that term.
 * The Application uses a recursive method to calculate the information.
 * @author Jayson Flores
 * @version 2.0
 */

public class mainClass {

    /**
     *
     * Method takes n as a term and returns the value of the term as an Integer
     * @param n  parameter n takes term
     * @return method returns Integer which represents value of term
     *
     */


    static int recursive(int n) {
      //returns 0 if parameter equals to 0, or returns 1
      if (n == 0) {
          return 0;
      }

      if (n == 1) {

          return 1;
      }

      // executes recursive method call given that the number is neither 0 nor 1

      else {
          // Fn =  Fn - 1 + Fn - 2
          return recursive(n - 1) + recursive(n - 2);
      }


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

                int input;

                System.out.println("Please Enter Integer");

                input = scan.nextInt();


                // print command includes term and calls recursive method

                System.out.println("The " + input + "th term is " + recursive(input));




    }
}