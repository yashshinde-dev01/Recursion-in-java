import java.util.*;
public class CombinationSumIII {
    public static void main(String[] args) {
        List<List<Integer>>ans=new ArrayList<>();
        combi3(5,1,2,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void combi3(int sum,int idx,int k,ArrayList<Integer>lst,List<List<Integer>>ans){

        if(sum==0 && lst.size()==k){
            ans.add(new ArrayList<>(lst));
            return;
        }
        if(sum<=0 ||lst.size()>k)return;

        for(int i=idx;i<10;i++){
            lst.add(i);
            combi3(sum-i,i+1,k,lst,ans);
            lst.remove(lst.size()-1);
//            combi3(sum,i+1,k,lst,ans);
        }
    }
}
