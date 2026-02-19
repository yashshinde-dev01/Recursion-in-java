import java.util.Arrays;

public class Merge_part2 {
    public static void main(String[] args) {
        int[]arr={2,4,6,2,11,32,57,7};
        int[]ans=merge(arr,0,arr.length);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[]arr,int start,int high){
        if(arr.length==1){
            return arr;
        }
        if(start<high){
            int mid=start+(high-start)/2;
            int[]left=merge(arr,start,mid);
            int[]right=merge(arr,mid+1,arr.length);
            return join(left,right);
        }
        return new int[]{0};

    }
    static int[] join(int[]left,int[]right){
        int[]mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
