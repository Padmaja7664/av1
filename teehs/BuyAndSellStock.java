public class BuyAndSellStock {
    
    public static int max=0;
    public static int brute(int a[]){
        //TC=>O(N^2) SC=O(1)
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]>a[i]){
                    int diff=a[j]-a[i];
                    if(max<diff){
                        max=diff;
                    }
                }
                
            }
        }
        return max;

    }

    public static int optimalSlo(int a[]){
        //TC=>O(N) SC=>O(1)
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<a.length;i++){
            if(minPrice>a[i]){
                minPrice=a[i];
            }
            if((a[i]-minPrice)>maxProfit){
                maxProfit=a[i]-minPrice;
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
      //  System.err.println(brute(a));
      System.err.println(optimalSlo(a));
    }
    
}
