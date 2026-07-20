package wipro;

import java.util.Scanner;

public class position {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        System.out.println("Enter 15 integers:");

        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 15; i++) {

            if (arr[i] == x) {
                System.out.println("Found at position " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        sc.close();
    }
}