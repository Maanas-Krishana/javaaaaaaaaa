import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[11];
        System.out.println("10 Number daal bhai");
        for(int i=1;i<=10;i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        for(int j=1;j<=10;j++)
        {
            System.out.println(arr[j]);
        }
        
    }
}
