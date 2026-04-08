class Fact {

    int fact(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("With loop");
        
        Fact obj = new Fact();

        int result = obj.fact(6);

        System.out.println(result);
        }
    }
