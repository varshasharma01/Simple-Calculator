import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();
        double result;

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) 
        {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double add(double x, double y) 
    {
        return x + y;
    }

    public static double subtract(double x, double y) 
    {
        return x - y;
    }

    public static double multiply(double x, double y) 
    {
        return x * y;
    }

    public static double divide(double x, double y) 
    {
        if (y == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return x / y;
    }
}
