import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);{

         if (ch != ' ' || ch!=',' || ch!='.') {
                if (!inWord) {
                    count++;    
                    inWord = true;
                }
            } else {
                inWord =false; 
            }
            }

        System.out.println("Word count: " + count);
    }
}
