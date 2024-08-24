
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

    /**
     * A mismatch Exception will be triggered by entering a non-integer character
     * For Example: A 10.5 will be entered, or a String, resulting in mismatch error
     *
     * @throws InputMismatchException A throw and catch is created to create error
     */


    public static void main(String[] args) throws InputMismatchException {

        Scanner scan = new Scanner(System.in);

        try {
            int input;

            System.out.println("Please Enter Integer");

            input = scan.nextInt();
            System.out.println("The " + input + "th term is " + recursive(input));

        }
        catch(InputMismatchException e) {
            System.out.println("Wrong Input: Please Enter Integer characters only");
        }



    }
}