package wipro;

import java.util.Scanner;

public class length_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        
        str = str.replace(" ", "");

        
        System.out.println("Length of the string is " + str.length());

        sc.close();
    }
}