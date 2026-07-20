package wipro;

import java.util.Scanner;

public class max {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[25];

        System.out.println("Enter 25 integers:");

        for (int i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < 25; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int first = -1;
        int last = -1;

        for (int i = 0; i < 25; i++) {

            if (arr[i] == max) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println("Maximum Value = " + max);
        System.out.println("First Position = " + first);
        System.out.println("Last Position = " + last);

        sc.close();
    }
}