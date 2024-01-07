public class avgOfArr {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,5,1};
        float sum=0;
        for(int i:arr){
            sum+=(float) i;
        }
        float ans=sum/arr.length;
        System.err.println(ans);
    }
}
