import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.println("Enter value of a and b respectively:");
        a=scan.nextInt();
        b=scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a+" and b="+b);
    }
}
