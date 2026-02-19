import java.util.*;
public class Subset_rev {
    public static void main(String[] args) {
        int[]arr={1,2,2};
        Subset(arr);
    }
    static HashSet<List<Integer>>set=new HashSet<>();
    static void Subset(int[]arr){
        int n=arr.length;
        for(int i=0;i<Math.pow(2,n);i++){
            ArrayList<Integer>lst=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    lst.add(arr[j]);
                }
            }
            set.add(lst);
        }
        System.out.println(set);
    }
}
