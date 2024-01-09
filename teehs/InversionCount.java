import java.util.*;

public class InversionCount {
    //for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

    //use merge sort and count the pair

    public static int mergeMethod(int a[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int cnt=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                cnt+=(mid-left+1);
                right++;
            }
        }

        while(left<=mid){
            temp.add(a[left]);
            left++;
        }

        while(right<=high){
            temp.add(a[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            a[i]=temp.get(i-low);
        }


        return cnt;

    }
    public static int merge(int a[],int low,int high){
        int mid=low + (high - low)/2;
        int cnt=0;
        if(low>=high){
            return cnt;
        }
        cnt+=merge(a, low, mid);
        cnt+=merge(a,mid+1,high);
        cnt+=mergeMethod(a,low,mid,high);
        return cnt;
    }
    public static void main(String[] args) {
        int a[]={5, 4, 3, 2, 1};
       // int n=5;
        int ans=merge(a,0,4);
        System.err.println(ans);

    }
}
