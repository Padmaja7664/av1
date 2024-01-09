public class RotateMatrix {
    public static void solve(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][a.length-j-1];
                a[i][a.length-j-1]=temp;

            }
        }
        return;
    }
    public static void main(String[] args) {
        int a[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solve(a);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.err.print(a[i][j]+" ");
            }
            System.err.println();
        }
        
    }
}
