import java.util.Scanner;

public class AcceptNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            System.out.println("Number " + i + ": " + num);
        }

        sc.close();
    }
}
