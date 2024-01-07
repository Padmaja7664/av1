import java.util.*;

class minNo{
    public static void main(String args[]){
        int arr[]={2,5,1,3,0};
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        Arrays.sort(arr);
        System.err.println(arr[0]);
    }

}