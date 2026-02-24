public class Main
{
	public static void main(String[] args) {
	    int i,j,b,bc,k;
        
        bc=4;
        
        for(i=1;i<=5;i++)    
        {
          
          for(b=1;b<=bc;b++)
              
          {
              System.out.print(" ");
          }
          bc--;
          
          for(j=1;j<=i;j++)
          {
              System.out.print(j);
          }
          
          for(k=j-2;k>=1;k--)
          {
              System.out.print(k);
          }
          
          System.out.println(" ");
        }
	}
}
