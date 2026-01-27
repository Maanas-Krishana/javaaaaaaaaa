import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enterrrr the character");
        ch=scan.nextLine().charAt(0);
        if(ch>='A' && ch<='Z')
        System.out.println("It's Capital");
        else if (ch>='a' && ch<='z')
        System.out.println("It's Small");
        else if(ch>='0' && ch<='9')
        System.out.println("It's digit");
        else{
            System.out.println("It's Special");
        }
    }
}
