import java.util.*;
public class PrintPath {
    public static void main(String[] args) {
        ArrayList<String>st=path("",3,3);
        System.out.println(st);
    }
    static ArrayList<String> path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String>lst=new ArrayList<>();
            lst.add(p);
            return lst;
        }
        ArrayList<String>lst=new ArrayList<>();
        if(r>1 && c>1){
            lst.addAll(path(p+'D',r-1,c-1));
        }
        if(r>1){
           lst.addAll(path(p+'V',r-1,c));
        }
        if(c>1){
            lst.addAll(path(p+'H',r,c-1));
        }
        return lst;
    }
}
