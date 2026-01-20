import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int sum,m1,m2;
        float avg;
        // m1=56;
        // m2=78;
        
       
        System.out.println("Enter the value");
        m1=scan.nextInt();
        System.out.println("Enter the value");
        m2=scan.nextInt();
         sum=m1+m2;
         avg=sum/2;
         System.out.println("Sum of m1\t" +m1+"and" +m2+"is"+sum +"and thier average is"+avg);
    }
}
