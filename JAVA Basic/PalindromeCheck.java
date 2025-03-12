import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");
    }
}

