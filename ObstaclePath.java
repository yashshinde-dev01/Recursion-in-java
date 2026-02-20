import java.util.*;
public class ObstaclePath {
    public static void main(String[] args) {
        boolean[][]arr={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        ArrayList<String>lsst=path(arr,"",0,0);
        System.out.println(lsst);
    }
    static ArrayList<String>path(boolean[][]arr,String p,int r,int c){
        if(r==2 && c==2){
            ArrayList<String>lst=new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String>lst=new ArrayList<>();
        if(arr[r][c]==false){
            return lst;
        }
        if(r<2){
            lst.addAll(path(arr,p+'V',r+1,c));
        }
        if(c<2){
            lst.addAll(path(arr,p+'H',r,c+1));
        }
        return lst;
    }
}
