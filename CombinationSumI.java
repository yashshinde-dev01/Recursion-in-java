import java.util.*;
public class CombinationSumI {
    public static void main(String[] args) {
        List<List<Integer>>ans=new ArrayList<>();
        int[]arr={2,3,6,7};
        combination(arr,0,7,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void combination(int[]arr,int idx,int target,List<Integer>lst,List<List<Integer>>ans){
        if(idx==arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(lst));
            }
            return;
        }
        if(arr[idx]<=target){
            lst.add(arr[idx]);
            combination(arr,idx,target-arr[idx],lst,ans);
            lst.remove(lst.size()-1);
        }
        combination(arr,idx+1,target,lst,ans);
    }
}
