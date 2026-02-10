import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int num[][]=new int[3][3];
       int i,j;
       for(i=0;i<3;i++)
       {     for(j=0;j<3;j++)
           {
               System.out.println("Enter element");
               num[i][j]=input.nextInt();
           }
       }
       
       int pds=0,sds=0;
       for(i=0;i<3;i++)
       {   for(j=0;j<3;j++)
           {
               if(i==j)
               pds=pds+num[i][j];
               else if((i+j)==2)
               sds=sds+num[i][j];
               
           }
       }
      System.out.println("Sum of primary diagonal"+pds);
      System.out.println("Sum of Secondary diagonal"+sds);
       
    }
}
