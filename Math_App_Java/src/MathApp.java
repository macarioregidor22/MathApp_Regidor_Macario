/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

 
    /**
     * 
     * @author Regidor
     */
   public class MathApp {
       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        char continueChar;

        // Outer do-while loop to keep displaying the menu until user exits
        do {
            System.out.println("=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Thank you!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double add1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double add2 = input.nextDouble();
                    System.out.println("Result: " + (add1 + add2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    double sub1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double sub2 = input.nextDouble();
                    System.out.println("Result: " + (sub1 - sub2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    double mul1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double mul2 = input.nextDouble();
                    System.out.println("Result: " + (mul1 * mul2));
                    break;

                case 4:
                    System.out.print("Enter dividend: ");
                    double div1 = input.nextDouble();
                    System.out.print("Enter divisor: ");
                    double div2 = input.nextDouble();
                    if (div2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.println("Result: " + (div1 / div2));
                    }
                    break;

                case 5:
                    System.out.print("Enter a non-negative integer: ");
                    int factNum = input.nextInt();
                    if (factNum < 0) {
                        System.out.println("Error: Factorial is undefined for negative numbers!");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= factNum; i++) {
                            fact *= i;
                        }
                        System.out.println("Result: " + factNum + "! = " + fact);
                    }
                    break;

                case 6:
                    System.out.print("Enter base (x): ");
                    double base = input.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exp = input.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;

                case 7:
                    System.out.print("Enter integer N (N >= 1): ");
                    int nSum = input.nextInt();
                    if (nSum < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        long sum = 0;
                        for (int i = 1; i <= nSum; i++) {
                            sum += i;
                        }
                        System.out.println("Result: Sum from 1 to " + nSum + " = " + sum);
                    }
                    break;

                case 8:
                    System.out.print("Enter an integer: ");
                    int pNum = input.nextInt();
                    boolean isPrime = pNum > 1;
                    for (int i = 2; i <= Math.sqrt(pNum); i++) {
                        if (pNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println("Result: " + pNum + (isPrime ? " is Prime." : " is NOT Prime."));
                    break;

                case 9:
                    System.out.print("Enter first integer: ");
                    int g1 = Math.abs(input.nextInt());
                    System.out.print("Enter second integer: ");
                    int g2 = Math.abs(input.nextInt());
                    int a = g1, b = g2;
                    while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("Result: GCD(" + g1 + ", " + g2 + ") = " + a);
                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    double absNum = input.nextDouble();
                    System.out.println("Result: |" + absNum + "| = " + Math.abs(absNum));
                    break;

                case 11:
                    System.out.print("Enter quantity of numbers N (N > 0): ");
                    int nAvg = input.nextInt();
                    if (nAvg <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] arr = new double[nAvg];
                        double total = 0;
                        for (int i = 0; i < nAvg; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            arr[i] = input.nextDouble();
                            total += arr[i];
                        }
                        System.out.println("Result: Average = " + (total / nAvg));
                    }
                    break;

                case 12:
                    System.out.print("Enter quantity of numbers N (N > 0): ");
                    int nMax = input.nextInt();
                    if (nMax <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] arr = new double[nMax];
                        for (int i = 0; i < nMax; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            arr[i] = input.nextDouble();
                        }
                        double maxVal = arr[0];
                        for (int i = 1; i < nMax; i++) {
                            if (arr[i] > maxVal) {
                                maxVal = arr[i];
                            }
                        }
                        System.out.println("Result: Maximum = " + maxVal);
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
                    continue; // Skip the continuation prompt on invalid input
            }

            // Inner do-while loop to prompt user whether to continue
            do {
                System.out.print("Do you want to continue? (y/n): ");
                continueChar = input.next().toLowerCase().charAt(0);
            } while (continueChar != 'y' && continueChar != 'n');

            if (continueChar == 'n') {
                System.out.println("Thank you!");
                break;
            }

            System.out.println(); // Extra spacing before menu re-displays

        } while (choice != 0);

        input.close();
    }
}