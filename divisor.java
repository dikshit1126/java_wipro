package wipro;

import java.util.Scanner;

public class divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int divisor = -1;

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                divisor = i;
                break;
            }
        }

        System.out.println("Smallest exact divisor other than 1 = " + divisor);

        sc.close();
    }
}