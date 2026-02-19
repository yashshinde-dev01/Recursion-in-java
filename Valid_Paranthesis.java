import java.util.*;
public class Valid_Paranthesis {
    public static void main(String[] args) {
        ArrayList<String>temp=new ArrayList<>();
       Generate(temp,"",0,0,3);
        System.out.println(temp);
    }
    static void Generate(List<String>temp,String str,int open,int close,int n){
        if(str.length()==2*n){
           temp.add(str);
           return;
        }
        if(open<n){
           Generate(temp,str+'(',open+1,close,n);
        }
        if(close<open){
            Generate(temp,str+')',open,close+1,n);
        }
    }
}
