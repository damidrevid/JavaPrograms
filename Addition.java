// Addition.java
// Addition program that must input two numbers then displays their sum/
// Program wrttien today 30th April 2019 by DamiDrevid A.K.A Oludre ;)
import java.util.Scanner;  // program uses class Scanner

public class Addition {

    //Main method begins execution of Java application
    public static void main(String[] args) {
        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");  // prompt
        int number1 = input.nextInt() ; // Read first number from user

        System.out.print("Enter second integer: ") ; //Prompt
        int number2 = input.nextInt() ; // Read second number from user

        input.close();

        int sum = number1 + number2; // add numbers, then store total in sum

        double division = number1 / number2; // add numbers, then store total in sum

        int sub = number1 - number2; // add numbers, then store total in sum

        int multiplication = number1 * number2; // add numbers, then store total in sum

        System.out.printf("Sum is %d%n", sum); // display sum

        System.out.printf("division is %f%n", division); // display sum

        System.out.printf("Subtraction is %d%n", sub); // display sum

        System.out.printf("Multiplication is %d%n", multiplication); // display sum

        System.out.printf("USER INPUT IS: %d%n", number1);
    } // End method main
} // end class Addition