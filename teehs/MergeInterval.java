import java.util.*;

public class MergeInterval {
    public static List<List<Integer>> solve(int[][] a){
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(a,new Comparator<int[]>() {
            public int compare(int[] x,int[] y){
                return x[0]-y[0];
            }
        });

        for(int i=0;i<a.length;i++){
            if(li.isEmpty() || li.get(li.size()-1).get(1)<a[i][0]){
                li.add(Arrays.asList(a[i][0],a[i][1]));
              
            }
            else{
                li.get(li.size()-1).set(1,Math.max(li.get(li.size()-1).get(1),a[i][1]));
            }
        }
        return li;

    }

    public static void main(String[] args) {
        int[][] a= {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> li=solve(a);
        System.err.println(li);
        //TC=>O(N*logN)+O(N) SC=>O(1)
    }
}
