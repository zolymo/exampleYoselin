package com.brixton.demo.libro;// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner

public class Addition 
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int number1, // first number to add
          number2, // second number to add
          sum; // sum of number1 and number2

      System.out.print("Enter first integer: "); // prompt
      number1 = input.nextInt(); // read first number from user

      System.out.print("Enter second integer: "); // prompt
      number2 = input.nextInt(); // read second number from user

      sum = number1 + number2; // add numbers, then store total in sum

      System.out.printf("Sum is %d%n", sum); // display sum







      int num1; // first number to add
      int num2; // second number to add
      int sm; // sum of number1 and number2

      System.out.print("Enter first integer: "); // prompt
      num1 = input.nextInt(); // read first number from user

      System.out.print("Enter second integer: "); // prompt
      num2 = input.nextInt(); // read second number from user

      sm = num1 + num2; // add numbers, then store total in sum

      System.out.printf("Sum is %d%n", sm);
   } // end method main
} // end class Addition

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
