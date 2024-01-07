public class rotateArrByK {
    
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
        int k=3;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,(arr.length)-k+1,arr.length-1);
        for(int i:arr){
            System.err.print(i+" ");
        }
        System.err.println();
    }
}
