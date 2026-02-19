import java.sql.Array;
import java.util.*;
public class Subset_NoARep {
    public static void main(String[] args) {
        int[]arr={1,2,2,2,3,3};
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        norepsub(arr,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void norepsub(int[]arr,int idx,List<Integer>lst,List<List<Integer>>ans){
        ans.add(new ArrayList<>(lst));
        for(int i=idx;i<arr.length;i++){
            if(i!=idx && arr[i]==arr[i-1])continue;
            lst.add(arr[i]);
            norepsub(arr,i+1,lst,ans);
            lst.remove(lst.size()-1);
        }
    }
}
