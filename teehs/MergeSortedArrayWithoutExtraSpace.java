import java.util.*;
public class MergeSortedArrayWithoutExtraSpace {

    //merge the two sorted array without using extra space 
    
    
    public static void mostOptimal(int a[],int[] b){
        //TC=>O((n+m)*log(n+m))  SC=>O(1)  here log(n+m) is boz of gap/2 is reducing everytime

        //we use the shell sort method i.e gap method
        //gap is (len1+len2)/2 ka ceil value
        // reduce the gap by taking above ceil value everytime until you get gap==1

        int n=a.length;
        int m=b.length;
       
       // int gap=(int)Math.ceil((n+m)/2);
       int gap=(n+m)/2 + (n+m)%2;
       
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<(n+m)){
                //if left and right both in array1 i.e a
                if(left<n && right<n ){
                    if( a[left]>a[right]){
                      swap(a,a,left,right);
                    }
                }
                //one in first and other in second array
                else if(left<n && right>=n ){
                    if(a[left]>b[right-n]){
                       swap(a,b,left,right-n);
                    }
                }
                //both in second array
                else{
                    if(b[left-n]>b[right-n]){
                        swap(b,b,left-n,right-n);
                    }
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=gap/2 + gap%2;

        }
    }
    public static void swap(int a[],int b[],int left,int right){
        int temp=a[left];
        a[left]=b[right];
        b[right]=temp;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        mostOptimal(a, b);
        betterSol(a, b);
        for(int i=0;i<a.length;i++){
            System.err.print(a[i]+" ");
        }
        System.err.println();
        for(int i=0;i<b.length;i++){
            System.err.print(b[i]+" ");
        }
        System.err.println();

    }

    //two pointer method :start form last index of array1 and check with the element at index of array2 starting from 0
    public static void betterSol(int a[],int b[]){
        int i=a.length-1;
        int j=0;
        while(i>=0 && j<b.length){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        //TC=> O(min(a.length,b.length))+O(nlogn)+O(mlogm) SC=>O(1)
    }

    
}
