import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner scan=new Scanner(System.in);
        int i,j,ar[]=new int[5];
        for(i=0;i<ar.length;i++)
        {
            System.out.println("enter the element");
            ar[i]=scan.nextInt();
        }
        System.out.println("Array before swapping");
         for(i=0;i<ar.length;i++)
        {
        System.out.print("\t"+ar[i]);
            
        }
        
        for(i=0,j=ar.length-1;i<=(ar.length-1)/2;i++,j--)
        {
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
        }
        System.out.println("\nArray after swapping");
         for(i=0;i<ar.length;i++)
        {
        System.out.print("\t"+ar[i]);
            
        }
        
    }
}
