import java.util.*;
public class Sumk_subset_recurr {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        ArrayList<Integer>lst=new ArrayList<>();
        sumk(arr,0,lst,0,2);
    }
    static void sumk(int[]arr,int index,ArrayList<Integer>lst,int sum,int k){
        if(index==arr.length){
            if(sum==k){
                System.out.println(lst);
            }
            return;
        }
        lst.add(arr[index]);
        sum+=arr[index];
        sumk(arr,index+1,lst,sum,k);
        lst.remove(lst.size()-1);
        sum-=arr[index];
        sumk(arr,index+1,lst,sum,k);
    }

}
