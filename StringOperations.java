import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // (i) Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // (ii) Convert lowercase letters to uppercase
        String upperCaseOnly = "";
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                upperCaseOnly += Character.toUpperCase(c);
            } else {
                upperCaseOnly += c;
            }
        }
        System.out.println("Converted to Uppercase (only lowercase letters): " + upperCaseOnly);

        // (iii) Find the length of the string
        int length = input.length();
        System.out.println("Length of the String: " + length);

        // (iv) Print first and last characters
        if (length > 0) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(length - 1);
            System.out.println("First Character: " + firstChar);
            System.out.println("Last Character : " + lastChar);
        } else {
            System.out.println("The string is empty, no characters to show.");
        }

        scanner.close();
    }
}
 
