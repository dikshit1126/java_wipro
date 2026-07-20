package wipro;

import java.util.Scanner;

public class mark_range {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] range = new int[10];

        System.out.println("Enter marks of 30 students:");

        for (int i = 0; i < 30; i++) {

            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {

                if (mark == 100)
                    range[9]++;
                else
                    range[mark / 10]++;
            }
        }

        System.out.println("Students in each range:");

        System.out.println("0-10   = " + range[0]);
        System.out.println("11-20  = " + range[1]);
        System.out.println("21-30  = " + range[2]);
        System.out.println("31-40  = " + range[3]);
        System.out.println("41-50  = " + range[4]);
        System.out.println("51-60  = " + range[5]);
        System.out.println("61-70  = " + range[6]);
        System.out.println("71-80  = " + range[7]);
        System.out.println("81-90  = " + range[8]);
        System.out.println("91-100 = " + range[9]);

        sc.close();
    }
}