import java.util.*;
public class CobinationSumII {
    public static void main(String[] args) {
        List<List<Integer>>lst=new ArrayList<>();
        int[]arr={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        combi2(arr,0,8,lst,new ArrayList<>());
        System.out.println(lst);
    }
    static void combi2(int[]arr,int index,int target,List<List<Integer>>ans,List<Integer>lst){
           if(target==0){
               ans.add(new ArrayList<>(lst));
               return;
           }
      for(int i=index;i<arr.length;i++){
          if(i>index && arr[i]==arr[i-1])continue;
          if(arr[i]>target)break;
          lst.add(arr[i]);
          combi2(arr,i+1,target-arr[i],ans,lst);
          lst.remove(lst.size()-1);
      }
    }
}
