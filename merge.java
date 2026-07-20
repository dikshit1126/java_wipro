package wipro;

import java.util.Scanner;

public class merge{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] merge = new int[10];

        System.out.println("Enter 5 elements for first array:");

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements for second array:");

        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        // Sort first array
        for (int i = 0; i < 4; i++) {

            for (int j = i + 1; j < 5; j++) {

                if (arr1[i] < arr1[j]) {

                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        // Sort second array
        for (int i = 0; i < 4; i++) {

            for (int j = i + 1; j < 5; j++) {

                if (arr2[i] < arr2[j]) {

                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int k = 0;

        for (int i = 0; i < 5; i++) {
            merge[k++] = arr1[i];
        }

        for (int i = 0; i < 5; i++) {
            merge[k++] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(merge[i] + " ");
        }

        sc.close();
    }
}