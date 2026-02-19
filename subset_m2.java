import java.util.ArrayList;
import java.util.List;
public class subset_m2 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        sunset(arr);
    }
    static void sunset(int[]arr){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        System.out.println(outer);
    }
}
