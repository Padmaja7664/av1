import java.util.*;

public class rank {
    public static void reverse(int a[],int i,int j){
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5, 6, 7,8};
        int n=a.length;
        int k=2;
        //rotate to left
        // reverse(a,0, n-1);
        // reverse(a,0, n-k-1);
        // reverse(a,n-k, n-1);

        //rotate to right
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
    }
}
