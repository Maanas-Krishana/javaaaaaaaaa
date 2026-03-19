import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String maxWord = "";

        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.println("Maximum (longest) word: " + maxWord);
        System.out.println("Length: " + maxWord.length());

        sc.close();
    }
}
