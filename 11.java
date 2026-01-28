// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,count=0;
        System.out.println("Enter number:");
        int num = sc.nextInt();
        while (num>0){
        num=num/10;
        count++;
        }
        System.out.println("Total digits" + " = " + count); sc.close();
}
}
