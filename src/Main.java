import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Testing the Scanner class usage
     /*
        //Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");


        //Takes input from keyboard
        String name = input.nextLine();

        //Prints the name
        System.out.println("My name is " + name + " and I'm a java developer");

        //closes the scanner
        input.close();
*/

        // Calculator starts here
        char operator;
        Double number1, number2, result;


        //Create an object of Scanner class
        Scanner input = new Scanner(System.in);


        // ask user to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);


        //ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            //performs addition
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            //performs subtraction
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            //performs multiplication
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            //performs division
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}