public class FindPower {
    public static double findPow(double x,int pow){
           double ans=1.0;
           double val=x;
           long n=pow;

           if(n<0){
            n*=-1;
           }
           while(n>0){
            if(n%2==1){
                ans=ans*val;
                n=n-1;
            }
            else{
                val=val*val;
                n=n/2;
            }
           }
           if(pow<0){
            ans=(double)(1.0)/ans;
           }
           return ans;
    }

    public static void main(String[] args) {
        System.err.println(findPow(2,-2));
    }
}
