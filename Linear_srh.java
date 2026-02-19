public class Linear_srh {
    // search for the target ele in arr
    public static void main(String[] args) {
        int[]arr={1,4,5,7,8,99};
        System.out.println(linearidx(arr,5,0));
    }
    static boolean linear(int[]arr,int target,int i){
        if(arr[i]==arr.length){
            return false;
        }
        return arr[i]==target || linear(arr,target,i+1);

    }
    static int  linearidx(int[]arr,int target,int i){
        if(arr[i]==arr.length){
            return -1;
        }
        if(target==arr[i]){
            return i;
        }else{
            return linearidx(arr,target,i+1);
        }

    }
}
