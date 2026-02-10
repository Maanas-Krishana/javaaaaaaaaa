import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
       int num[][]=new int[3][3];
       int i,j,max,min;
       for(i=0;i<3;i++)
       {     for(j=0;j<3;j++)
           {
               System.out.println("Enter element");
               num[i][j]=input.nextInt();
           }
       }
       max=min=num[0][0];
       for(i=0;i<3;i++)
       {     for(j=0;j<3;j++)
           {
               if(num[i][j]>max)
               max=num[i][j];
               if(num[i][j]<min)
               min=num[i][j];
               
           }
       }
       System.out.println("Maximum element"+max);
       System.out.println("Minimum element"+min);
    }
}
