//public class Cnt_zeros {
//    // cnt number of zeros in number
 //    }
//}
//method-2;
//public class Cnt_zeros{
//    public static void main(String[] args) {
//        int n=1304050;
//    }
//    static int count(int n){
//        return helper(n);
//    }
//    static int helper(int n,int cnt){
//        if(n==0){
//            return cnt;
//        }
//        int rem=n%10;
//        if(rem==0){
//            return helper(n/10,cnt++);
//        }
//        return helper(n/10,cnt);
//    }
//}