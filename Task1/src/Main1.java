import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //inputNumber();
        System.out.println(getFloatInput());

    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter float number: ");
                String input = scanner.nextLine();
                number = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("The entered string is not a float number");
            }
        }
        return number;
    }
}
