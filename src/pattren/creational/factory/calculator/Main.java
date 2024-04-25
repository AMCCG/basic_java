package pattren.creational.factory.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factory");
        System.out.println("*********************************");
        Scanner scan = new Scanner(System.in);
        System.out.println("\n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)");
        try {
            // getting choice from user
            System.out.println("\n\nSelect your operation (1-4): ");
            int choice = scan.nextInt();

            //getting 2 operands from user
            System.out.println("Enter first operand: ");
            double operand1 = scan.nextDouble();
            System.out.println("Enter second operand: ");
            double operand2 = scan.nextDouble();

            // create opeartion instance based on user choice
            OperationFactory operationFactory = new OperationFactoryImpl();
            Operation operation = operationFactory.getInstance(choice);
            // printing result
            System.out.println("\nThis result is " + operation.calculate(operand1, operand2) + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type!\n");
        } catch (InvalidOperationException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }

}
