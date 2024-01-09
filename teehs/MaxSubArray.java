public class MaxSubArray {
    public static int start=-1;
    public static int end=-1;
    public static long solve(int a[]){
        //TC O(N),SC O(1)
        //Kadane's Algorithm
        long max=Integer.MIN_VALUE;
        long sum=0;
        
        for(int i=0;i<a.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=a[i];
            if(sum>max){
                max=sum;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.err.println(solve(a));
        for(int i=start;i<=end;i++){
            System.err.print(a[i]+" ");
        }
        System.err.println();
    }
    
}
