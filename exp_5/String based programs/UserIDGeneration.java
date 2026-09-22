import java.util.Scanner;

public class UserIDGeneration {
    public static String userIdGeneration(String input1, String input2, int input3, int input4) {
        String smallerName;
        String longerName;

        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareToIgnoreCase(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }

        String pin = String.valueOf(input3);
        char leftDigit = pin.charAt(input4 - 1);
        char rightDigit = pin.charAt(pin.length() - input4);

        String userId = "" + smallerName.charAt(0) + longerName + leftDigit + rightDigit;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < userId.length(); i++) {
            char ch = userId.charAt(i);
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.next();
        System.out.print("Enter Last Name: ");
        String lastName = sc.next();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Generated User ID: "
                + userIdGeneration(firstName, lastName, pin, n));
        sc.close();
    }
}
