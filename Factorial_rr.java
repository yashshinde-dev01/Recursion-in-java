public class Factorial_rr {
    // find the factorial of given number
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(0));

    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
