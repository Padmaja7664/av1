import java.util.*;

public class Median {
    // to find the median we need to first sort the array
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5,7};
        int n=arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            //if length is even  
            System.err.println((double)(arr[n/2]+arr[n/2 -1])/2);
        }
        else{
            System.err.println(arr[(n-1)/2]);
        }
    }
}
