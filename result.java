package wipro;
import java.util.Scanner;
public class result {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int passCount = 0;

        System.out.println("Enter marks of 3 students:");

        for (int i = 1; i <= 3; i++) {

            int marks = sc.nextInt();

            if (marks >= 35) {

                passCount++;

            }

        }

        System.out.println("Number of students passed: " + passCount);

        sc.close();

    }
}
