package wipro;

import java.util.Scanner;

public class decimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = "";

        if (decimal == 0) {
            binary = "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}