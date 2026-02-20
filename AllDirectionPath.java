import java.util.ArrayList;

public class AllDirectionPath {
    public static void main(String[] args) {
        boolean[][]board={
                {true,  true,  true},
                {true,  true, true},
                {true,  true,  true}
        };
        ArrayList<String>ans=alldire(board,"",0,0);
        System.out.println(ans);
    }
    static ArrayList<String> alldire(boolean[][]arr,String p,int r, int c){
        if(r==2 && c==2){
            ArrayList<String> lst=new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String>lst=new ArrayList<>();
        if(arr[r][c]==false){
            return lst;
        }
        arr[r][c]=false;

        if(r<2){
            lst.addAll(alldire(arr,p+'V',r+1,c));
        }
        if(c<2){
            lst.addAll(alldire(arr,p+'H',r,c+1));
        }
        if(r>0){
            lst.addAll(alldire(arr,p+'U',r-1,c));
        }
        if(c>0){
            lst.addAll(alldire(arr,p+'L',r,c-1));
        }
        arr[r][c]=true;
        return lst;
//        arr[r][c]=true;

    }
}
