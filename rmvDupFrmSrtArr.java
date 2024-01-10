public class rmvDupFrmSrtArr {
    
    //in place method -> O(n)
    //two pointer  start from i=0 and j=1
    //if arr[i]!=arr[j] then i++ and arr[i]=arr[j] and then j++;

    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,3,4,4,6,6,6,7}; //the array is sorted
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                j++;
            }
            else{
                j++;
            }
        }
        for(int k=0;k<i+1;k++){
            System.err.print(arr[k]+" ");
        }
        System.err.println();
    }
}
