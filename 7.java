import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side l: ");
        int l = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side h: ");
        int h = sc.nextInt();

        if (l + b > h && l + h > b && b + h > l) {
            System.out.println("It is a triangle");
        } else {
            System.out.println("It is NOT a triangle");
        }

        sc.close();
    }
}
