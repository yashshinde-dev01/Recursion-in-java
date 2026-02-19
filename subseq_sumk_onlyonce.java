import java.util.ArrayList;

public class subseq_sumk_onlyonce {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        ArrayList<Integer>lst=new ArrayList<>();
        boolean b=sumk(arr,0,lst,0,2);
        System.out.println(b);
    }
    static boolean sumk(int[]arr, int index, ArrayList<Integer> lst, int sum, int k){
        if(index==arr.length){
            if(sum==k){
                System.out.println(lst);
                return true;
            }
            return false;
        }
        lst.add(arr[index]);
        sum+=arr[index];
        if(sumk(arr,index+1,lst,sum,k)==true){
            return true;
        }
        lst.remove(lst.size()-1);
        sum-=arr[index];
        if(sumk(arr,index+1,lst,sum,k)==true){
            return true;
        }
        return false;
    }
}
