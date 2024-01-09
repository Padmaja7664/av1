public class SortZeroOneTwo {

    //Dutch national flag algorithm
    //here we take low=0,mid=0,high=n-1;
    // 0-low-1=> 0 is present
    //low - mid-1 => 1 is present
    //mid - high-1 => unsorted array
    //high - n-1 => 2 is present

    //we are only concern with mid to high-1 part bcoz its unsorted part
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void solve(int a[]){
        //optimal solution TC=>O(N),SC=>O(1)
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,high);
                high--;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        solve(a);
      // betterSol(a);
        for(int i=0;i<a.length;i++){
            System.err.print(a[i]+" ");
        }
        System.err.println();
    }

    //better TC=>O(2N),SC=>O(1)
    //count 0,1,2 and place it accordingly into the array
    public static void betterSol(int a[]){
        int zero=0,one=0,two=0;

        //this loop will take O(N) TC
        for(int i:a){
            if(i==0) zero++;
            else if(i==1) one++;
            else{
                two++;
            }
        }

        //now put 0 first then one and then two in the array
        int j=0;
        for(int i=0;i<zero;i++){
            a[j++]=0;
        }
        for(int i=0;i<one;i++){
            a[j++]=1;
        }
        for(int i=0;i<two;i++){
            a[j++]=2;
        }
        return;
    }
}
