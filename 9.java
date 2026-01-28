import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            System.out.println("Number " + i + ": " + num);
            sum += num;
        }

        double average = sum / 10;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
