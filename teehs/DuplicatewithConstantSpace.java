public class DuplicatewithConstantSpace {
    //fast and slow method
    //run a loop by moving slow one step and fast two step until both at the same place
    //now make the position of fast at first and then move one step ahead both fast and slow
    //TC ->O(N) SC->O(1)

    public static int solve(int a[]){
        int slow=a[0];
        int fast=a[0];
        do{
            slow=a[slow];
            fast=a[a[fast]];
        }while(slow!=fast);

        fast=a[0];
        while(fast!=slow){
            slow=a[slow];
            fast=a[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5};
        int ans=solve(a);
        System.err.println(ans);
    }


}
