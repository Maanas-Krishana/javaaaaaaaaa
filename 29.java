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
            System.out.println("");
            System.out.println("Enter the string");
            str[i]=sc.nextLine();
    }
    
    for(i=0;i<n;i++)
    {
        System.out.println("String no "+(i+1)+" is "+str[i]);
    }

    for(j=0;j<str[i].length();j++)
    {
        System.out.println(str[i].charAt(j));
    }
}
}
