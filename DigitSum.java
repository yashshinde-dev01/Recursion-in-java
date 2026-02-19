public class DigitSum {
    // find the sum of digit
    public static void main(String[] args) {
        int n=505;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}
