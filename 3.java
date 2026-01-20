// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int sum,m1,m2;
        // m1=56;
        // m2=78;
        
       
        System.out.println("Enter the value");
        m1=scan.nextInt();
        System.out.println("Enter the value");
        m2=scan.nextInt();
         sum=m1+m2;
         System.out.println("Sum of m1\t" +m1+"and" +m2+"is"+sum);
    }
}
