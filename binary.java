package wipro;

import java.util.Scanner;

public class binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            int digit = binary.charAt(i) - '0';

            decimal = decimal + digit * (int)Math.pow(2, power);

            power++;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}