import java.util.ArrayList;
//public class Linear_srh_arrList {
//    // return the arraylist
//    public static void main(String[] args) {
//        int[]arr={1,2,3,4,4,5,6};
//        ArrayList<Integer>ans=search(arr,4,0,lst);
//        System.out.println(ans);
//    }
//    static ArrayList<Integer>lst=new ArrayList<>();
//    static ArrayList<Integer> search(int []arr,int target,int i,ArrayList<Integer>lst){
//        if(i==arr.length){
//            return lst;
//        }
//        if(arr[i]==target){
//            lst.add(i);
//        }
//        return search(arr,target,i+1,lst);
//    }
//}

// method-2;
public class Linear_srh_arrList{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5,6};
        ArrayList<Integer>ans=search(arr,4,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> search(int []arr,int target,int i){
        ArrayList<Integer>lst=new ArrayList<>();
        if(i==arr.length){
            return lst;
        }
        if(arr[i]==target){
            lst.add(i);
        }
        ArrayList<Integer>ansfromBlw= search(arr,target,i+1);
        lst.addAll(ansfromBlw);
        return lst;
    }
}
