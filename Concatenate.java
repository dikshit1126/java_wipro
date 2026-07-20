package wipro;

import java.util.Scanner;

public class Concatenate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String str3 = str1 + str2;

        System.out.println("Concatenated String = " + str3);

        sc.close();
    }
}