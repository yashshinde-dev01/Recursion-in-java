public class ReverseNum {
    //reverse the num by recurrsion
    public static void main(String[] args) {
        rev(123);
        System.out.println(sum);
    }
    static int sum=0;
    static void rev(int n){
        if (n == 0) {
            return;
        }
            int rem = n % 10;
            sum=sum*10+rem;
             rev(n/10);
    }
}
