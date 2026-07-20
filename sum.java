package wipro;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}