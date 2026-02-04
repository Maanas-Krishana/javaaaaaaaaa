import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[11];
        int flag=0;
        int n=0;
        System.out.println("enter 10 element");
        for(int i=1;i<=10;i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Enter element to find");
        int key=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            if(arr[i]==key){
                flag+=1;
                n=i;
            }
        }
        if (flag==1){
            System.out.println("Element found at index "+n);
        }
        else{
                System.out.println("Element not found");
        
            }
        
    }
}
