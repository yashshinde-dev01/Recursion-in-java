import java.util.*;
public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer>lst=new ArrayList<>();
        int[]arr={3,1,2};
        subsum(arr,0,0,lst);
//        Arrays.sort(lst);
        Collections.sort(lst);
        System.out.println(lst);
    }
    static void subsum(int[]arr,int idx,int sum,ArrayList<Integer>lst){
        if(idx==arr.length){
            lst.add(sum);
            return;
        }
        sum=sum+arr[idx];
        subsum(arr,idx+1,sum,lst);
        sum=sum-arr[idx];
        subsum(arr,idx+1,sum,lst);
    }
}
