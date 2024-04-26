package Task04Exception2204;
import java.util.Scanner;

class PositiveNumberHandler {
    private int number;

    public PositiveNumberHandler(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

class NegativeNumberHandler {
    private int number;

    public NegativeNumberHandler(int number) {
        if (number >= 0) {
            throw new IllegalArgumentException("Number must be negative");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}


public class exceptionHandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            // Handling positive number
            try {
                System.out.print("Enter a positive number: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid positive number.");
                    scanner.next(); // clear the invalid input
                    System.out.print("Enter a positive number: ");
                }
                int positiveInput = scanner.nextInt();
                PositiveNumberHandler positiveHandler = new PositiveNumberHandler(positiveInput);
                System.out.println("Positive number entered: " + positiveHandler.getNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
