import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius=0;
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid temperature.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit + " F");

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

