// write a program in java to accept salary of an employee and calculate their net payable amount as given criteria Hra@15% da@7% pf@5% 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int gross_pay;
        System.out.println("Enter your gross Salary:");
        gross_pay=scan.nextInt();
        double net_pay;
        net_pay=gross_pay+(gross_pay*15/100)+(gross_pay*7/100)-(gross_pay*5/100);
        System.out.println(net_pay);
    }
}
