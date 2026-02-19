import java.util.Arrays;

public class Selection_recurr {
    // selection sort using the recurrsion
    public static void main(String[] args) {
        int[]arr={8,7,5,4,3,2,1};
        selction(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selction(int[]arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selction(arr,r,c+1,c);
            }else{
                selction(arr,r,c+1,max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selction(arr,r-1,0,0);
        }

    }
}
