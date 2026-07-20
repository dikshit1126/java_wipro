package wipro;

import java.util.Scanner;

public class sum_integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}