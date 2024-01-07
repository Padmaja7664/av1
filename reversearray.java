public class reversearray {

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int k:arr){
            System.err.print(k+" ");
        }
        System.err.println();
    }
}
