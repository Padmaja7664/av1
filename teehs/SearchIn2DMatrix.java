public class SearchIn2DMatrix {
    public static boolean binarySearch(int a[][],int rowno,int collen,int target){
        int low=0;
        int high=collen-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[rowno][mid]==target){
                return true;
            }
            else if(a[rowno][mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        //TC -> O(N+logM) ,  SC -> O(1)
        int a[][]={{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,13}};
        int target=12;
        for(int i=0;i<a.length;i++){
            if(a[i][0]<=target && target<=a[i][a[0].length-1]){
                System.err.println(binarySearch(a, i, a[i].length, target));
                break;
            }
        }
    }
}
