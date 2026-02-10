import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[][] ar=new int[2][3];
	    int i,j;
	    for(i=0;i<2;i++){
	        for(j=0;j<3;j++){
	        System.out.println("Enter elements");
	        ar[i][j]=sc.nextInt();
	    }
	    }
	    System.out.println("Elements are");
	    for(i=0;i<2;i++){
	        for(j=0;j<3;j++){
	        System.out.print(ar[i][j]+" ");
	        
	    }
	    System.out.println("");
	    }
		
	}
}
