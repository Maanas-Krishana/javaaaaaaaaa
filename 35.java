import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int max=0;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' '){
                if (count>max){
                    max=count;
                }
                count=0;
            }
            else{
                count++;
            }
        }
        System.out.println("Maximum length of word in the string: " + max);
}
}
