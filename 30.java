import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        int n,i,j;
        System.out.println("Enter the size of string");
        Scanner sc=new Scanner(System.in);

        n=Integer.parseInt(sc.nextLine());

        String[] str=new String[n];

        for (i=0;i<n;i++)
        {
            System.out.println("Enter the string");
            str[i]=sc.nextLine();
        }

        for(i=0;i<n;i++)
        {
            String rev="";

            for(j=str[i].length()-1;j>=0;j--)
            {
                rev=rev+str[i].charAt(j);
            }

            System.out.println("String no "+(i+1)+" is "+str[i]+" || "+rev);
        }
    }
}
