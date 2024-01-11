public class insertEle {
    public static void insertAtbegin(int ele,int a[],int n){
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=ele;
        for(int i=0;i<n;i++){
            System.err.print(a[i]+" ");
        }
        System.err.println();
        
    }
    public static void insertAtEnd(int ele,int a[],int n){
       a[n-1]=ele;
       for(int i=0;i<n;i++){
        System.err.print(a[i]+" ");
       }
       // System.err.print(a[n-1]+" ");
       System.err.println();
    }
    public static void insertAtPos(int ele,int a[],int n,int pos){
       
       for(int i=n-1;i>=pos;i--){
        a[i]=a[i-1];
       }
       a[pos-1]=ele;
     //  System.err.print(a[pos]+" ");
       for(int i=0;i<n;i++){
        System.err.print(a[i]+" ");
       }
       System.err.println();
    }
    
    public static void main(String[] args) {
        int a[] = new int[7];
        int k=1;
        for(int i=0;i<6;i++){
            a[i]=k+1;
            k++;
        }
        int ele = 5; //element to be inserted
        int n=a.length;
        insertAtbegin(ele,a,n);

        insertAtEnd(ele,a,n);

        int pos=3;

       insertAtPos(ele,a,a.length,pos);

    }
}
