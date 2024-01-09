import java.util.*;

public class MatrixZero{

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> li=new ArrayList<>();
            int n=3;
            int m=3;
            for(int i=0;i<n;i++){
                ArrayList<Integer> a=new ArrayList<>();
                for(int j=0;j<m;j++){
                    int x=sc.nextInt();
                    a.add(x);
                }
                li.add(a);
            }
        }
       
       /*Better solution with TC-> 2*O(M*N)  and SC-> O(N)+O(M) 
       //mark the row and col which contains 0
       int row[]=new int[n];
       int col[]=new int[m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(li.get(i).get(j)==0){
                row[i]=1;
                col[j]=1;
            }
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1 || col[j]==1){
                li.get(i).set(j,0);
            }
        }
       }
       System.err.println(li);*/
       

     }

     
}