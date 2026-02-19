import java.util.ArrayList;

public class Subseq_sumk_cnt {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        ArrayList<Integer>lst=new ArrayList<>();
        int totalcnt=sumk(arr,0,lst,0,2);
        System.out.println(totalcnt);
    }
    static int sumk(int[]arr, int index, ArrayList<Integer> lst, int sum, int k){
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        lst.add(arr[index]);
        sum+=arr[index];
        int s1=sumk(arr,index+1,lst,sum,k);
        lst.remove(lst.size()-1);
        sum-=arr[index];
        int s2=sumk(arr,index+1,lst,sum,k);

        return s1+s2;
    }
}
