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
	    int min=ar[0][0],max=ar[0][0];
	    System.out.println("Min and Max are-");
	    for(i=0;i<2;i++){
	        for(j=0;j<3;j++){
	            if(ar[i][j]<min){
	                min=ar[i][j];
	            }
	            if(ar[i][j]>max){
	                max=ar[i][j];
	            }
	    }
	    }
	   System.out.println("Min is "+min); 
	   System.out.println("Max is "+max); 
		
	}
}
