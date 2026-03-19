public class Main {
    
    public static void main(String as[])
    {
     String Str="You really can't change" ;  
    int count=0;
    boolean flag=true;
    for(int i=0; i<Str.length(); i++)
    {
        if(Str.charAt(i)==' ')
        {
            flag=true;
            
        }
        else if(flag==true)
        {
            flag=false;
            count++;
        }
    }
    System.out.println(count);
    }
}
