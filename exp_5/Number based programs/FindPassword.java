import java.util.Scanner;

public class FindPassword {
    public static boolean isStable(int num) {
        int[] freq = new int[10];
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            freq[digit]++;
        }
        int firstFrequency = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                firstFrequency = freq[i];
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] != firstFrequency)
                return false;
        }
        return true;
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] nums = {input1, input2, input3, input4, input5};
        int stable = 0;
        int unstable = 0;
        for (int num : nums) {
            if (isStable(num))
                stable += num;
            else
                unstable += num;
        }
        return stable - unstable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();
        System.out.print("Enter fifth number: ");
        int e = sc.nextInt();
        System.out.println("Generated Password: "
                + findPassword(a, b, c, d, e));
        sc.close();
    }
}
