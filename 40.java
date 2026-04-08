class Fact {

    int fact(int n) {
        if (n == 1) 
        return 1;   
        return n * fact(n - 1); 
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("With recursion");
        
         Fact obj = new Fact();  

        int result = obj.fact(7);       

        System.out.println(result);
    }
}
