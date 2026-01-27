// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
    float u_p,n_p;
    int tot_unit;
    System.out.println("Total consumed unit");
    tot_unit=scan.nextInt();

    if(tot_unit>=0 && tot_unit<=100){
        n_p=tot_unit*1.5f;
    }
    else if( tot_unit<=200){
        n_p=tot_unit*2.5f;
    }
    else {
    n_p=tot_unit*4f;
    }
        System.out.println(n_p);
 } 
}
