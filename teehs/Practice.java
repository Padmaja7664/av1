public class Practice {
    
    public static long pascal(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }


    public static void main(String[] args) {
       int n=5;
       int r=3;

       for(int i=1;i<=n;i++){
        System.err.println(pascal(n-1,i-1));
       }
      
      
    }
}
