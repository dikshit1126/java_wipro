package wipro;

import java.util.Scanner;

public class descending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting in descending order
        for (int i = 0; i < 9; i++) {

            for (int j = i + 1; j < 10; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}