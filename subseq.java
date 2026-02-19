public class subseq {
    public static void main(String[] args) {
        String st="abc";
        subseq(st);
    }
    static void subseq(String st){
        int n=st.length();
        for(int num=0;num<(1<<n);num++){
            String empty="";
            for(int i=0;i<n;i++){
                if(((1<<i)&num)!=0){
                     empty+=st.charAt(i);
                }
            }
            System.out.println(empty);
        }
    }
}
