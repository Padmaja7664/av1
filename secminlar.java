public class secminlar {
    public static void main(String[] args) {
        int ar[]={-2,-3,4,5,1,0};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secmin=0;
        int seclar=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                secmin=min;
                min=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                seclar=max;
                max=ar[i];
            }
        }
        System.err.println(secmin+" "+seclar);
    }
}
