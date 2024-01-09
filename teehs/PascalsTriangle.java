import java.util.*;
public class PascalsTriangle {
    //function to find the elements of the pascal triangle's row-1^C col-1 (ncr)
    public static int pascalElement(int n,int r){
        //TC => O(N*R) SC=>O(1)
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
     }
     public static void pascalRow(int r){
        //TC=> O(N) SC=> O(1)
        long res=1;
        System.err.print(res+" ");
        for(int i=1;i<r;i++){
            res=res*(r-i);
            res=res/i;
            System.err.print(res+" ");
        }
        System.err.println();
     }

     public static void printPascal(int rowno,ArrayList<Integer> a){
        //TC => O(N^2) SC=>O(1)
        a.add(1);
        int res=1;
        for(int i=1;i<rowno;i++){
            res=res*(rowno-i);
            res=res/i;
            a.add(res);
        }
        return ;
        
     }
     public static void main(String[] args) {
        int row=5,col=3;
        int ans=pascalElement(row-1, col-1);
        System.err.println(ans);
        //to get the row elements of pascal's triangle  if row number is given
        int n=5;
        pascalRow(n);

        //print pascal triangle if no. of row is given
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> a=new ArrayList<>();
            printPascal(i, a);
            li.add(a);
        }
        System.err.println(li);


     }
    
}
