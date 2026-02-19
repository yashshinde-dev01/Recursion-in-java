import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        subsetprint(arr);
    }
    static void subsetprint(int[]arr){
        int n=arr.length;
        for(int i=0;i<(1<<n);i++){
            ArrayList<Integer>lst=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((1<<j)&i)!=0){
                    lst.add(arr[j]);
                }
            }
            System.out.println(lst);
        }
    }
}
