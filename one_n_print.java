public class one_n_print {
    //print the numbers 1 to n
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printRev(int n){
        if(n==0){
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
}
