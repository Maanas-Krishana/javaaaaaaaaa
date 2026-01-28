import java.util.Scanner;

public class PosNegZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            System.out.println("Number " + i + ": " + num);
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("\nTotal positive numbers = " + positiveCount);
        System.out.println("Total negative numbers = " + negativeCount);
        System.out.println("Total zeros = " + zeroCount);

        sc.close();
    }
}
