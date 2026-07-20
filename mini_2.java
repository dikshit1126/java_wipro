package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class mini_2 {

    static class Video {
        String name;
        boolean checkedOut;
        int rating;

        Video(String name) {
            this.name = name;
            this.checkedOut = false;
            this.rating = 0;
        }
    }

    static ArrayList<Video> store = new ArrayList<>();

    public static void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video added successfully.");
    }

    public static void doCheckout(String name) {
        for (Video v : store) {
            if (v.name.equalsIgnoreCase(name)) {
                if (!v.checkedOut) {
                    v.checkedOut = true;
                    System.out.println("Video checked out successfully.");
                } else {
                    System.out.println("Video is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public static void doReturn(String name) {
        for (Video v : store) {
            if (v.name.equalsIgnoreCase(name)) {
                if (v.checkedOut) {
                    v.checkedOut = false;
                    System.out.println("Video returned successfully.");
                } else {
                    System.out.println("Video was not checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public static void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.name.equalsIgnoreCase(name)) {
                v.rating = rating;
                System.out.println("Rating updated successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public static void listInventory() {

        if (store.isEmpty()) {
            System.out.println("No videos available.");
            return;
        }

        System.out.println("\n-------------------------------");
        System.out.printf("%-20s %-10s %-6s\n", "Video Name", "Status", "Rating");
        System.out.println("-------------------------------");

        for (Video v : store) {
            String status = v.checkedOut ? "Out" : "In";
            System.out.printf("%-20s %-10s %-6d\n", v.name, status, v.rating);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== VIDEO STORE =====");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter video name: ");
                    String add = sc.nextLine();
                    addVideo(add);
                    break;

                case 2:
                    System.out.print("Enter video name: ");
                    String check = sc.nextLine();
                    doCheckout(check);
                    break;

                case 3:
                    System.out.print("Enter video name: ");
                    String ret = sc.nextLine();
                    doReturn(ret);
                    break;

                case 4:
                    System.out.print("Enter video name: ");
                    String rate = sc.nextLine();
                    System.out.print("Enter rating (1-5): ");
                    int rating = sc.nextInt();
                    receiveRating(rate, rating);
                    break;

                case 5:
                    listInventory();
                    break;

                case 6:
                    System.out.println("Thank you for using Video Store.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}