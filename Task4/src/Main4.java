import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty()) {
                throw new Exception("You can't input empty string");
            }
            System.out.println("Your string: " + input);
        } catch (Exception e) {
            System.out.println("Mistake: " + e.getMessage());
        }
    }
}

