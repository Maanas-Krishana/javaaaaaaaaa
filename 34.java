import java.util.Scanner;
class Main {
    public static void main(String[] args) 
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int freq[] = new int[26]; 

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(freq[ch - 'a'] == 1){
                System.out.println("First non-repeating character: " + ch);
                
                 return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
