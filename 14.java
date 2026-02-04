// Online Java Compiler
//accept n element and find count even and odd
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[11];
        int ev=0;
        int od=0;
        System.out.println("10 Number daal bhai");
        for(int i=1;i<=10;i++){
            int num=sc.nextInt();
            arr[i]=num;
            if(num%2==0){
                ev++;
            }
            else{
                od++;
            }
        }
        for(int j=1;j<=10;j++)
        {
            System.out.println(arr[j]);
            
        }
        System.out.println("Even no. are"+ev);
        System.out.println("Odd no. are"+od);
        
    }
}
