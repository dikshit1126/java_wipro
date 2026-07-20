package wipro;

import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        boolean vowelFound = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                result = result + 'z';
                vowelFound = true;
            }
            else {
                result = result + ch;
            }
        }

        if (vowelFound) {
            System.out.println(result);
        } else {
            System.out.println(str);
            System.out.println("No vowels present");
        }

        sc.close();
    }
}