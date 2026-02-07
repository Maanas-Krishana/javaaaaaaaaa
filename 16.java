import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,ar[]=new int[5];
        for(i=0;i<ar.length;i++)
        {
            System.out.println("enter the element");
            ar[i]=scan.nextInt();
        }
        for(i=0;i<ar.length;i++)
        {
            int count=0;
            int num=ar[i];
            while (num>0){
            num=num/10;
                       
           count++;
            }
            System.out.println("Digits in "+ar[i]+" are");
            System.out.println(count);
        }
        }
}
