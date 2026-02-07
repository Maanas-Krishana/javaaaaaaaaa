import java.util.Scanner;
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Please enter "+n+" numbers");
        for (int i = 1; i<=n; i++){
            arr[i]=sc.nextInt();
        }

        int min = arr[1];
        int max = arr[1];

        for (int i = 1; i <=n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
