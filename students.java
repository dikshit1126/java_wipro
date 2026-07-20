package wipro;

import java.util.Scanner;

public class students {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] count = new int[101];

        System.out.println("Enter marks of 30 students:");

        for (int i = 0; i < 30; i++) {

            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {
                count[mark]++;
            }
        }

        System.out.println("Count of each mark:");

        for (int i = 0; i <= 100; i++) {

            if (count[i] > 0) {
                System.out.println("Mark " + i + " = " + count[i] + " student(s)");
            }
        }

        sc.close();
    }
}